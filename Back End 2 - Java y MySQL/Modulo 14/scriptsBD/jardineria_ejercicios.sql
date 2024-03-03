use jardineria;
select codigo_oficina, ciudad from oficina; #1
select ciudad, telefono from oficina where pais = "españa"; #2
select nombre, apellido1, apellido2, email from empleado where codigo_jefe=7; #3
select puesto, nombre, apellido1, apellido2, email from empleado where codigo_jefe is null; #4
select nombre, apellido1,apellido2, puesto from empleado where puesto != "representante ventas";#5
select nombre_cliente from cliente where pais = "spain"; #6
select * from cliente;
select * from pago;
select estado from pedido group by estado;#7
select codigo_cliente from pago where year(fecha_pago) = 2008 group by codigo_cliente;#8 year
select codigo_cliente from pago where date_format(fecha_pago,"%Y") = 2008 group by codigo_cliente;#8 date format
select codigo_cliente from pago where fecha_pago like "2008%" group by codigo_cliente;#8 sin year ni date_format
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido 
where fecha_entrega>fecha_esperada; #9
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido 
where adddate(fecha_entrega, interval 2 day)<= fecha_esperada; #10 adddate
use jardineria;
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido 
where adddate(fecha_entrega, interval 2 day)<= fecha_esperada;
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido 
where datediff(fecha_esperada,fecha_entrega)>= 2; #10 datediff
select * from pedido where estado = "rechazado" and fecha_pedido like "2009%"; #11
select * from pedido where month(fecha_entrega)="01" and estado="entregado" ; #12
select * from pago where year(fecha_pago)="2008" and forma_pago="paypal" order by total desc; #13
select forma_pago from pago group by forma_pago;#14
select * from producto where gama="ornamentales" and cantidad_en_stock > 100 order by precio_venta desc;#15
select * from cliente where ciudad = "madrid" and codigo_empleado_rep_ventas in (11,30); #16

/*
Consultas multitabla (Composición interna)
Las consultas se deben resolver con INNER JOIN.
*/

select nombre_cliente, nombre, apellido1, apellido2 
from cliente inner join empleado on empleado.codigo_empleado=cliente.codigo_empleado_rep_ventas; #1
select nombre_cliente from cliente inner join pago on 


/*
Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus
representantes de ventas.
*/