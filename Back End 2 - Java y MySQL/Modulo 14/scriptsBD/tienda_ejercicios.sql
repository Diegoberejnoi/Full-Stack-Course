use tienda;
select nombre from producto; #1
select nombre, precio from producto; #2
select * from producto; #3
select * from fabricante;
select nombre, round(precio) from producto; #4
select codigo_fabricante from producto; #5
select codigo_fabricante from producto group by codigo_fabricante; #6
select nombre from fabricante order by nombre asc; #7
select nombre, precio from producto order by nombre asc, precio desc; #8
select nombre from fabricante limit 5; #9
select nombre, precio from producto order by precio asc limit 1; #10
select nombre, precio from producto order by precio desc limit 1; #11
select nombre, precio from producto where precio<=120; #12
select nombre, precio from producto where precio between 60 and 200 ; #13
select * from producto where codigo_fabricante in (1,3,5); #14
select nombre from producto where nombre like "portatil%"; #15
select p.codigo as codigo_producto, p.nombre, f.codigo as codigo_fabricante, f.nombre 
from producto p, fabricante f where f.codigo=p.codigo_fabricante; #cm 1
select p.nombre, p.precio, f.nombre as nombre_fabricante from producto p, fabricante f
where f.codigo=p.codigo_fabricante order by f.nombre asc; #cm 2

select p.nombre, p.precio, f.nombre as nombre_fabricante from producto p, fabricante f
where f.codigo=p.codigo_fabricante and p.precio=(select min(precio) from producto);#cm 3 subconsulta
select p.nombre, p.precio, f.nombre as nombre_fabricante from producto p, fabricante f
where f.codigo=p.codigo_fabricante order by p.precio limit 1; #cm 3 order by & limit

select p.nombre, f.nombre as nombre_fabricante from producto p, fabricante f
where f.codigo=p.codigo_fabricante and  f.nombre="lenovo"; #cm 4

select p.nombre, f.nombre as nombre_fabricante from producto p, fabricante f
where f.codigo=p.codigo_fabricante and  f.nombre="crucial" and p.precio>200; #cm 5

select p.*, f.nombre from producto p, fabricante f
where f.codigo=p.codigo_fabricante and  f.nombre in ("Asus","Hewlett-Packard"); #cm 5

select p.*, f.nombre from producto p, fabricante f
where f.codigo=p.codigo_fabricante and p.precio>=180 order by p.precio desc, p.nombre asc; #cm 6

insert into fabricante(nombre) values("Toshiba"); #agregamos un fabricante sin productos

/*Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los
productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos
fabricantes que no tienen productos asociados.
select 
*/
select * from producto;
select fabricante.nombre, producto.nombre from fabricante 
left join producto on fabricante.codigo = producto.codigo_fabricante; #cd lr 1

select fabricante.nombre, producto.nombre from fabricante 
left join producto on  fabricante.codigo = producto.codigo_fabricante 
where producto.codigo_fabricante is null; #cd lr 2

select nombre from producto 
where codigo_fabricante=(select codigo from fabricante where nombre="lenovo");  #subconsulta where 1

insert into producto (nombre, precio, codigo_fabricante) values ("Toshiba Book 1.2", 559,10); #agregamos otro producto

select * from producto where precio=(select max(precio) from producto where 
codigo_fabricante=(select codigo from fabricante where nombre="lenovo"));#subconsulta where 2

select nombre from producto where precio=(select max(precio) from producto where 
codigo_fabricante=(select codigo from fabricante where nombre="lenovo")) and 
codigo_fabricante=(select codigo from fabricante where nombre="lenovo"); #subconsulta where 3


select * from producto where codigo_fabricante=(select codigo from fabricante where nombre="asus")
and precio>(select avg(precio) from producto 
where codigo_fabricante=(select codigo from fabricante where nombre="asus")); #subconsulta where 4

select nombre from fabricante where codigo in (select codigo_fabricante from producto); #subconsulta in 1
select nombre from fabricante where codigo not in (select codigo_fabricante from producto);#subconsulta in 2

select count(codigo) from producto group by codigo_fabricante having count(codigo)>=2;
select count(codigo) from producto group by codigo_fabricante;


select nombre from fabricante group by nombre 
having (select count(codigo) from producto where codigo_fabricante = (select codigo from fabricante))=
(select count(codigo) from producto where codigo_fabricante =
(select codigo from fabricante where nombre="lenovo")); #no anda

select nombre from fabricante where codigo in 
	(select codigo_fabricante from producto group by codigo_fabricante having count(codigo)=
    (select count(codigo) from producto where codigo_fabricante =
	(select codigo from fabricante where nombre="lenovo"))); # subconsulta having 1

select * from fabricante;
SELECT codigo, nombre FROM fabricante WHERE nombre ='KpanKKs';
SELECT codigo, nombre FROM fabricante WHERE nombre = ' KpanKKs';
INSERT INTO fabricante (nombre) VALUES ('prueba');