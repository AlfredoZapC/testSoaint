# testSoaint
Prueba de la empresa SOAINT

### TEST DE LA APLICACIÓN

Solo ejecutar la aplicación Run -> SpringBoot App y probar por SOAPUI. 
En la capa "controllers" se tiene mapeado todas las rutas.
La ruta principal es /api/
desde allí se puede consultar y hacer las diferentes pruebas para /clientes, /ventas, /productos y /productos/{id}

### Para el outh en Postman
1) Authorization -> Basic Auth
username: clientedummy
password: 12345


2) Body (x-www-form-urlencoded):
- username - alfredo
- password - 12345
- grant_type - password

POST  -> http://localhost:8090/oauth/token


### PREGUNTA 4. Con sus propias palabras indique de qué forma podría mejorar la seguridad y optimizar el carrito de compras.
- Agregar seguridad Outh2 (el mas actual) antes de logearse en la aplicación de carrito de compras.
- Escanear las vulnerabilidades de la aplicación con las diferentes herramientas que existen (Skipfish, Zed Attack Proxy) tomando en cuenta las buenas practicas de OWASP


#### BD - Data de prueba
create datatable db_test;

INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Zapata', 47117811, 'alfredo@gmail.com', 'Alfredo', '986932867');
INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Drago', 47127912, 'adrago@gmail.com', 'Alonso', '986932867');
INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Romero', 52125913, 'cromero@gmail.com', 'Carlos', '916732860');
INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Vidaurre', 32145917, 'rvidaurre@gmail.com', 'Robin', '996732862');
INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Salcedo', 53725915, 'jpsalcedo@gmail.com', 'JP', '954732823');

INSERT INTO productos (nombre, precio) VALUES('Gaseosa', 10);
INSERT INTO productos (nombre, precio) VALUES('Chocolate', 5);

INSERT INTO ventas (fecha, id_cliente) VALUES(2018-05-02, 1);
INSERT INTO ventas (fecha, id_cliente) VALUES(2018-07-18, 2);

INSERT INTO usuarios (username, password, enabled) VALUES ('alfredo', '$2a$10$.IG52XUJOmv9V9ZXLGZnne89B4/GiyYcqVLPJBKvu5/XST5PR2Nou', 1);
INSERT INTO usuarios (username, password, enabled) VALUES ('admin', '$2a$10$v9D4BgtDq5GeeQDxGvKuk.h3R9SQ0sTrRvipWtALaA.5jQtnw0guy', 1);

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, roles_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id, roles_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuario_id, roles_id) VALUES (2,1);



### TEST JUNIT


**getCliente_OK**
![clienteok](https://user-images.githubusercontent.com/43482668/106643293-83a32780-6557-11eb-94aa-93c400784c1e.png)

**getCliente_error**
![clienteerror](https://user-images.githubusercontent.com/43482668/106643301-89007200-6557-11eb-91ea-6dd968a01ecb.png)

