use nba;
select * from equipos;
select nombre from jugadores order by nombre asc; #1
select nombre, posicion,peso from jugadores where posicion like "%C%" and peso>200; #2
select nombre from equipos order by nombre asc; #3
select nombre from equipos where conferencia="east" order by nombre asc; #4
select nombre from equipos where ciudad like "c%" order by nombre asc; #5
select j.nombre, e.nombre from jugadores j, equipos e order by e.nombre asc; #6
select nombre from jugadores where nombre_equipo="raptors" order by nombre asc; #7
select puntos_por_partido, jugador from estadisticas 
where jugador=(select codigo from jugadores where nombre="Pau Gasol");  #8
select puntos_por_partido, jugador from estadisticas 
where jugador=(select codigo from jugadores where nombre="Pau Gasol") and temporada="04/05";#9
select sum(e.puntos_por_partido), j.nombre from estadisticas e, jugadores j 
where j.codigo=e.jugador group by j.nombre; #10
select count(nombre), nombre_equipo from jugadores group by nombre_equipo; #11

select jugador, sum(e.puntos_por_partido) from estadisticas e group by jugador having 
sum(e.puntos_por_partido)=(select max(puntos_totales) from 
(select sum(puntos_por_partido) as puntos_totales from estadisticas group by jugador) 
as puntos_por_jugador); #12 solucion con max

SELECT j.nombre AS "Jugador", j.nombre_equipo AS "Equipo", ROUND(SUM(puntos_por_partido * partidos_jugados)) AS Total
FROM jugadores j
JOIN estadisticas e ON j.codigo = e.jugador
JOIN (
	SELECT temporada, equipo_local AS equipo, COUNT(*) AS partidos_jugados
    FROM partidos
    GROUP BY temporada, equipo_local
    UNION ALL
    SELECT temporada, equipo_visitante AS equipo, COUNT(*) AS partidos_jugados
    FROM partidos
    GROUP BY temporada, equipo_visitante
    ) p ON e.temporada = p.temporada AND j.nombre_equipo = p.equipo
    GROUP BY j.codigo
    ORDER BY Total DESC;#10 Y 12 Fer




select codigo from jugadores where nombre="Shaquille ONeal";

select sum(e.puntos_por_partido), j.nombre from estadisticas e, jugadores j 
where j.codigo=e.jugador group by j.nombre order by sum(e.puntos_por_partido) desc limit 1; #12 simple

SELECT j.Nombre, s.Total_Puntos
FROM jugadores j
JOIN (
    SELECT jugador, SUM(Puntos_por_partido) as Total_Puntos
    FROM estadisticas
    GROUP BY jugador
) s ON j.codigo = s.jugador
WHERE s.Total_Puntos = (
    SELECT MAX(Total_Puntos) 
    FROM (
        SELECT SUM(Puntos_por_partido) as Total_Puntos
        FROM estadisticas
        GROUP BY jugador
    ) t
); #12 juampi

select nombre, conferencia, division from equipos 
where (select nombre_equipo from jugadores order by altura desc limit 1)=nombre; #13

select avg(puntos_L.puntos_local+puntos_V.puntos_visitante) as promedio_puntos 
from (select puntos_local from partidos 
where equipo_local in (select nombre from equipos where division="pacific")) puntos_L,
(select puntos_visitante from partidos 
where equipo_visitante in (select nombre from equipos where division="pacific")) puntos_V; #14

select avg(puntos_L.promedio+puntos_V.promedio) as promedio_puntos_pacific
from (select avg(puntos_local) as promedio  from partidos 
where equipo_local in (select nombre from equipos where division="pacific")) puntos_L 
inner join
(select avg(puntos_visitante) as promedio from partidos 
where equipo_visitante in (select nombre from equipos where division="pacific")) puntos_V; #14 no da el promedio, da la suma

SELECT AVG(p.puntos_local) AS media_puntos_local, AVG(p.puntos_visitante) AS media_puntos_visitante
FROM partidos p
JOIN equipos e ON p.equipo_local = e.nombre OR p.equipo_visitante = e.nombre
WHERE e.division = 'Pacific'; #14 chatgpt 2 columnas

SELECT AVG(media_puntos) AS promedio_general
FROM (
  SELECT AVG(p.puntos_local) AS media_puntos
  FROM partidos p
  JOIN equipos e ON p.equipo_local = e.nombre OR p.equipo_visitante = e.nombre
  WHERE e.division = 'Pacific'
  UNION ALL
  SELECT AVG(p.puntos_visitante) AS media_puntos
  FROM partidos p
  JOIN equipos e ON p.equipo_local = e.nombre OR p.equipo_visitante = e.nombre
  WHERE e.division = 'Pacific'
) AS subconsulta; #14 chatgpt v2

select avg(p.puntos_local), avg(p.puntos_visitante) from partidos p, equipos e
where p.equipo_local = e.nombre and e.division = 'pacific' or p.equipo_visitante = e.nombre and 
e.division = 'pacific' order by p.temporada; #14 Illich

select *, (puntos_local - puntos_visitante) as diferencia_puntos from partidos where  
 (select max(dif) from (select abs(puntos_local - puntos_visitante) as
dif from partidos) s) in ((puntos_local - puntos_visitante), (puntos_visitante - puntos_local)); #15 illich

select e.nombre, sum(t.puntos) from equipos e,
((select equipo_local as nombre_equipo, sum(puntos_local) as puntos from partidos group by equipo_local) union
(select equipo_visitante as nombre_equipo, sum(puntos_visitante) as puntos from partidos group by equipo_visitante)) t
where t.nombre_equipo=e.nombre group by t.nombre_equipo; #17


/*
Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
equipo_ganador), en caso de empate sera null.*/
select codigo, equipo_local, equipo_visitante,
       CASE
           WHEN puntos_local > puntos_visitante THEN equipo_local
           WHEN puntos_local < puntos_visitante THEN equipo_visitante
           ELSE NULL
       END AS equipo_ganador
FROM partidos; #18 Santiago

SELECT p.codigo  AS 'Partido', p.equipo_local as "Local", p.equipo_visitante as "Visitante", E.NOMBRE AS "GANADOR"
FROM partidos p, equipos e 
WHERE  (P.PUNTOS_LOCAL > P.PUNTOS_VISITANTE AND E.NOMBRE = P.EQUIPO_LOCAL) 
OR (P.PUNTOS_VISITANTE > P.PUNTOS_LOCAL AND E.NOMBRE = P.EQUIPO_VISITANTE); #18 Santiago