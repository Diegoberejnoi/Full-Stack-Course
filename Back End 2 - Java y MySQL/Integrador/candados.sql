use nba;

/*
A: pos= 2 pass 14043
B: pos= 3 pass 3480
C: pos= 1 pass 631
D: pos= 4 pass 191
*/

select * from equipos;
select * from estadisticas;
select * from jugadores;
select * from partidos;

##Candado A pos=2 pass 421290

/*posicion El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)*/




select count(e.asistencias_por_partido) 
from estadisticas e 
where e.asistencias_por_partido = (select max(e.asistencias_por_partido) from estadisticas e limit 1 ) 
group by e.asistencias_por_partido; 

/*Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
datos:
Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
centro o esté comprendida en otras posiciones.*/
SELECT SUM(j.peso) AS suma_total_peso
FROM jugadores j, equipos e
WHERE j.posicion LIKE "%C%" AND j.nombre_equipo IN (SELECT e.nombre FROM equipos e WHERE conferencia LIKE "east");

select sum(j.peso)
from jugadores j, equipos e
where j.posicion like ("%C%") and j.nombre_equipo in (select e.nombre from equipos e where conferencia like "east");

select sum(j.peso)
from jugadores j, equipos e
where j.posicion like ("%C%") and j.nombre_equipo in (select e.nombre from equipos e where conferencia like "east")
and j.nombre_equipo = e.nombre;


 ##Candado B pos 3 pass 3480
 
 /*Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
jugadores que tiene el equipo Heat. */

select count(t.numero) from (select count(e.jugador) as numero from estadisticas e, jugadores j 
where e.asistencias_por_partido > (select count(j.codigo) from jugadores j where nombre_equipo like "heat")
group by e.jugador) t ;


/*Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.*/

select count(p.codigo) from partidos p where p.temporada like ("%99%");

##Candado C pos casi 1 poss 631

/*
Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
195, y a eso le vamos a sumar 0.9945.
*/

select count(j.codigo)
from jugadores j, equipos e
where j.procedencia like ("%Michigan%") and j.nombre_equipo in (select e.nombre from equipos e where conferencia like "west")
group by j.codigo; ##4

select count(j.codigo) from jugadores j where peso>=195; ## 362



/*
Clave: La clave del candado C estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
tapones por partido. Además, este resultado debe ser, donde la división sea central.
*/

SELECT FLOOR(AVG(puntos_por_partido) + COUNT(asistencias_por_partido) + SUM(tapones_por_partido)) AS codigo_candado_C
FROM estadisticas e
JOIN jugadores j ON e.jugador = j.codigo
JOIN equipos eq ON j.nombre_equipo = eq.nombre
WHERE eq.division = 'central';


/*
Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
resultado debe ser redondeado. Nota: el resultado debe estar redondeado
Este resultado nos dará la posición del candado (1, 2, 3 o 4)
*/

select sum(e.tapones_por_partido) from jugadores j, estadisticas e
where e.jugador=j.codigo and j.nombre="Corey Maggette" and e.temporada like "00/01";

/*
Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
de todos los jugadores de procedencia argentina.*/

select sum(e.puntos_por_partido) from estadisticas e, jugadores j 
where e.jugador = j.codigo and j.procedencia like "argentina";