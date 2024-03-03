use libreria;
select * from libro;
select a.*, e.* from autor a, editorial e;
select * from editorial;

INSERT INTO libro (isbn, titulo, anio, ejemplares, ejemplaresprestados, ejemplaresrestantes, autor_id, editorial_id)
VALUES ('9781234567890', 'Título del Libro', 2023, 10, 0, 10, 1, 1), ('97812342390', 'Como esquivar balas', 956, 100, 50, 50, 3, 3)
, ('67890', 'Otro libro mas', 1999, 20, 10, 10, 2, 4)
, ('97234', 'Integrales y Derivadas', 1950, 1000, 650, 350, 1, 2)
, ('78134578', 'Contando hasta 1000', 2020, 100, 70, 30, 2, 1)
, ('9717890', 'Seguimos agregando', 2020, 10, 0, 10, 5, 3)
, ('945555890', 'Uno más del monton', 2023, 10, 0, 10, 6, 1)
, ('97890', 'No se que más poner', 2023, 10, 0, 10, 7, 1)
, ('31456640', 'Cosas random', 2023, 10, 0, 10, 8, 1)
, ('978123', 'Cosas random 2: La venganza', 2023, 10, 0, 10, 8, 1);
