INSERT INTO tbl_categorias (id, name) VALUES (1, 'libros');
INSERT INTO tbl_categorias (id, name) VALUES (2, 'Revistas');
INSERT INTO tbl_categorias (id, name) VALUES (3, 'Periodicos');
INSERT INTO tbl_categorias (id, name) VALUES (4, 'Ebooks');

INSERT INTO tbl_productos (id, name, description,stock,price,Status,categorias_id)
VALUES (1, 'Java','Java desde cero', 5,500, 'CREATED',1);

INSERT INTO tbl_productos (id, name, description,stock,price,Status,categorias_id)
VALUES (1, 'React','React desde cero', 5,1000, 'CREATED',1);