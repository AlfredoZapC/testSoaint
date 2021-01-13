INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Zapata', 47117811, 'alfredo@gmail.com', 'Alfredo', '986932867');
INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Drago', 47127912, 'adrago@gmail.com', 'Alonso', '986932867');
INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Romero', 52125913, 'cromero@gmail.com', 'Carlos', '916732860');
INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Vidaurre', 32145917, 'rvidaurre@gmail.com', 'Robin', '996732862');
INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Salcedo', 53725915, 'jpsalcedo@gmail.com', 'JP', '954732823');

INSERT INTO productos (nombre, precio) VALUES('Gaseosa', 10);
INSERT INTO productos (nombre, precio) VALUES('Chocolate', 5);

INSERT INTO usuarios (username, password, enabled) VALUES ('alfredo', '$2a$10$.IG52XUJOmv9V9ZXLGZnne89B4/GiyYcqVLPJBKvu5/XST5PR2Nou', 1);
INSERT INTO usuarios (username, password, enabled) VALUES ('admin', '$2a$10$v9D4BgtDq5GeeQDxGvKuk.h3R9SQ0sTrRvipWtALaA.5jQtnw0guy', 1);

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, roles_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id, roles_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuario_id, roles_id) VALUES (2,1);
