delete from ServicioEntity;
  
insert into ServicioEntity  (nombre, categorias, descripcion, imagen) values ('Plomeria', 'agua y tuberias', 'Aqui va una descripcion detallada del servicio', 'data/images/servicio1.png');
insert into ServicioEntity  (nombre, categorias, descripcion, imagen) values ('Climatizacion', 'Aire Acondicionado', 'Aqui va una descripcion detallada del servicio', 'data/images/Acondicionamiento.png');
insert into ServicioEntity  (nombre, categorias, descripcion, imagen) values ('Pintura', 'Pintura', 'Aqui va una descripcion detallada del servicio', 'data/images/Pintura.png');
insert into ServicioEntity  (nombre, categorias, descripcion, imagen) values ('Gas', 'Servicios Basicos', 'Aqui va una descripcion detallada del servicio', 'data/images/Gas.png');
insert into ServicioEntity  (nombre, categorias, descripcion, imagen) values ('Electricidad', 'Servicios Básicos', 'Aqui va una descripcion detallada del servicio', 'data/images/Electricidad.jpg');
insert into ServicioEntity  (nombre, categorias, descripcion, imagen) values ('Mudanza', 'Servicios Premium', 'Aqui va una descripcion detallada del servicio', 'data/images/Mudanza.png');


delete from USUARIOENTITY;
insert into USUARIOENTITY (dtype,nombre, correo, usuario, contrasena, disponibilidad) values ('ContratistaEntity' ,'Christi Lamanby', 'clamanby0@youtube.com', 'clamanby0', 'FmAhX0zkz9WQ', 1);
insert into USUARIOENTITY (dtype ,nombre, correo, usuario, contrasena, disponibilidad) values ( 'ContratistaEntity' ,'Gill Heisman', 'gheisman1@nymag.com', 'gheisman1', 'LOUAd68', 1);
insert into USUARIOENTITY (dtype ,nombre, correo, usuario, contrasena, disponibilidad) values ('ContratistaEntity' , 'Saundra Bonhan', 'sbonhan2@mashable.com', 'sbonhan2', 'CjeMX5YG', 1);
insert into USUARIOENTITY (dtype ,nombre, correo, usuario, contrasena, disponibilidad) values ('ContratistaEntity' ,'Sybil Ivanenko', 'sivanenko3@friendfeed.com', 'sivanenko3', 'tr2esTLJ', 1);
insert into USUARIOENTITY (dtype ,nombre, correo, usuario, contrasena, disponibilidad) values ('ContratistaEntity' ,'Reuben Skerman', 'rskerman4@odnoklassniki.ru', 'rskerman4', 'XS6EEX9E', 1);
insert into USUARIOENTITY (dtype,nombre, correo, usuario, contrasena, disponibilidad) values ('ContratistaEntity' , 'Francis Mum', 'fmum5@loc.gov', 'fmum5', 'DKKORXeqYPni', 1);
insert into USUARIOENTITY (dtype ,nombre, correo, usuario, contrasena, disponibilidad) values ('ContratistaEntity' ,'Noam Leeds', 'nleeds6@free.fr', 'nleeds6', 'yWFNDCET9TAU', 1);
insert into USUARIOENTITY (dtype ,nombre, correo, usuario, contrasena, disponibilidad) values ('ContratistaEntity' , 'Redford Hugle', 'rhugle7@google.cn', 'rhugle7', 'UxYmUlEAm', 1);
insert into USUARIOENTITY (dtype ,nombre, correo, usuario, contrasena, disponibilidad) values ('ContratistaEntity' , 'Catrina Currie', 'ccurrie8@quantcast.com', 'ccurrie8', 'pfWjXOB', 1);
insert into USUARIOENTITY (dtype,nombre, correo, usuario, contrasena, disponibilidad) values ('ContratistaEntity' , 'Karalynn Feveryear', 'kfeveryear9@fc2.com', 'kfeveryear9', 'ty4ew9k5fq', 1);

insert into CONTRATOENTITY(fechainicio, descripcion, contratista_id) values('3/31/2018', 'sigma cum laude', 1);
insert into CONTRATOENTITY(fechainicio, descripcion, contratista_id) values('2/15/2018', 'una descripcion', 2);
insert into CONTRATOENTITY(fechainicio, descripcion, contratista_id) values('4/15/2018', ' Colibri', 3);
insert into CONTRATOENTITY(fechainicio, descripcion, contratista_id) values('1/15/2018', 'iPhone 8', 4);
insert into CONTRATOENTITY(fechainicio, descripcion, contratista_id) values('3/12/2018', 'Uniandes', 5);
insert into CONTRATOENTITY(fechainicio, descripcion, contratista_id) values('2/12/2018', 'Raberata ushna', 6);
insert into CONTRATOENTITY(fechainicio, descripcion, contratista_id) values('4/12/2018', 'Pavarotti Lasso', 7);
insert into CONTRATOENTITY(fechainicio, descripcion, contratista_id) values('1/12/2018', 'Lasrana risno', 8);
insert into CONTRATOENTITY(fechainicio, descripcion, contratista_id) values('3/25/2018', 'Poscotif lae sun', 9);
insert into CONTRATOENTITY(fechainicio, descripcion, contratista_id) values('2/14/2018', 'Laude cum sigma', 10);

insert into USUARIOENTITY (nombre, usuario, contrasena, correo, fecha_nacimiento, forma_pago, direccion, dtype) values ('Malva Ubee', 'mubee0', 'LGP6NIL5FX3E', 'mubee0@sakura.ne.jp', '3/31/1957', 'Energy', '076 New Castle Center', 'ClienteEntity');
insert into USUARIOENTITY (nombre, usuario, contrasena, correo, fecha_nacimiento, forma_pago, direccion, dtype) values ('Gearalt Barles', 'gbarles1', 'UXRBQhR', 'gbarles1@spotify.com', '4/18/1987', 'Technology', '145 Superior Parkway', 'ClienteEntity');
insert into USUARIOENTITY (nombre, usuario, contrasena, correo, fecha_nacimiento, forma_pago, direccion, dtype) values ('Patrick Fradson', 'pfradson2', '8tDcDTtQA3', 'pfradson2@google.com', '10/27/1989', 'Consumer Services', '68885 Thierer Park', 'ClienteEntity');
insert into USUARIOENTITY (nombre, usuario, contrasena, correo, fecha_nacimiento, forma_pago, direccion, dtype) values ('Frederic True', 'ftrue3', 'NGRcAg28pI', 'ftrue3@wikipedia.org', '1/2/1978', 'Health Care', '60 Troy Street', 'ClienteEntity');
insert into USUARIOENTITY (nombre, usuario, contrasena, correo, fecha_nacimiento, forma_pago, direccion, dtype) values ('Farrah Massen', 'fmassen4', 'Nxl5Re0', 'fmassen4@ning.com', '8/8/1995', 'Energy', '37 Riverside Pass', 'ClienteEntity');
insert into USUARIOENTITY (nombre, usuario, contrasena, correo, fecha_nacimiento, forma_pago, direccion, dtype) values ('Bibi Duerdin', 'bduerdin5', '5aJPCIe5', 'bduerdin5@amazon.de', '5/5/1953', 'Consumer Services', '8857 Gateway Park', 'ClienteEntity');
insert into USUARIOENTITY (nombre, usuario, contrasena, correo, fecha_nacimiento, forma_pago, direccion, dtype) values ('Cart Ingley', 'cingley6', 'SElp3AIzvsE', 'cingley6@ustream.tv', '5/21/1985', 'Public Utilities', '3851 Nobel Plaza', 'ClienteEntity');
insert into USUARIOENTITY (nombre, usuario, contrasena, correo, fecha_nacimiento, forma_pago, direccion, dtype) values ('Barbaraanne Mallows', 'bmallows7', 'J1Jy0vSbLsK9', 'bmallows7@sbwire.com', '1/12/1990', 'Capital Goods', '346 Johnson Lane', 'ClienteEntity');
insert into USUARIOENTITY (nombre, usuario, contrasena, correo, fecha_nacimiento, forma_pago, direccion, dtype) values ('Claretta Shipperbottom', 'cshipperbottom8', 'DfwQ3GMpfv', 'cshipperbottom8@oracle.com', '5/2/1985', 'Health Care', '164 Hermina Circle', 'ClienteEntity');
insert into USUARIOENTITY (nombre, usuario, contrasena, correo, fecha_nacimiento, forma_pago, direccion, dtype) values ('Gayelord Di Bartolomeo', 'gdi9', 'dB4PcLkSe', 'gdi9@facebook.com', '4/18/1964', 'n/a', '1 2nd Terrace', 'ClienteEntity');

delete from hojadevidaentity;
insert into HOJADEVIDAENTITY (contratista_id, nombre, edad, empleos, especialidad, experiencia, referencias) values (1, 'Christi Lamanby', 18, 'Vanguard Russell 2000 ETF', 'n/a', 'n/a', '860-311-0663');
insert into HOJADEVIDAENTITY (contratista_id, nombre, edad, empleos, especialidad, experiencia, referencias) values (2, 'Gill Heisman', 18, 'Corbus Pharmaceuticals Holdings, Inc.', 'Major Pharmaceuticals', 'Health Care', '447-435-0883');
insert into HOJADEVIDAENTITY (contratista_id, nombre, edad, empleos, especialidad, experiencia, referencias) values (3, 'Saundra Bonhan', 41, 'Seneca Foods Corp.', 'Packaged Foods', 'Consumer Non-Durables', '922-743-9251');
insert into HOJADEVIDAENTITY (contratista_id, nombre, edad, empleos, especialidad, experiencia, referencias) values (4, 'Sybil Ivanenko', 37, 'Newtek Business Services Corp.', 'n/a', 'n/a', '677-519-2483');
insert into HOJADEVIDAENTITY (contratista_id, nombre, edad, empleos, especialidad, experiencia, referencias) values (5, 'Reuben Skerman', 28, 'Remark Holdings, Inc.', 'Telecommunications Equipment', 'Consumer Services', '753-878-6376');
insert into HOJADEVIDAENTITY (contratista_id, nombre, edad, empleos, especialidad, experiencia, referencias) values (6, 'Francis Mum', 53, 'QIWI plc', 'Business Services', 'Miscellaneous', '545-778-5437');
insert into HOJADEVIDAENTITY (contratista_id, nombre, edad, empleos, especialidad, experiencia, referencias) values (7, 'Noam Leeds', 22, 'PS Business Parks, Inc.', 'n/a', 'n/a', '152-736-9540');
insert into HOJADEVIDAENTITY (contratista_id, nombre, edad, empleos, especialidad, experiencia, referencias) values (8, 'Redford Hugle', 61, 'FIRST REPUBLIC BANK', 'n/a', 'n/a', '540-190-8182');
insert into HOJADEVIDAENTITY (contratista_id, nombre, edad, empleos, especialidad, experiencia, referencias) values (9, 'Catrina Currie', 38, 'Activision Blizzard, Inc', 'Computer Software: Prepackaged Software', 'Technology', '584-583-0893');
insert into HOJADEVIDAENTITY (contratista_id, nombre, edad, empleos, especialidad, experiencia, referencias) values (10, 'Karalynn Feveryear', 49, 'Reading International Inc', 'Movies/Entertainment', 'Consumer Services', '566-350-0112');

delete from FACTURAENTITY;
insert into FACTURAENTITY (FORMAPAGO, NAME, PRODUCTO, SUBTOTAL, TOTAL) values ('Efectivo', 'name','Plomeria',100, 110);
insert into FACTURAENTITY (FORMAPAGO, NAME, PRODUCTO, SUBTOTAL, TOTAL) values ('Efectivo', 'name','Plomeria',100, 110);
insert into FACTURAENTITY (FORMAPAGO, NAME, PRODUCTO, SUBTOTAL, TOTAL) values ('TarjetaCredito', 'ayuda','Limpieza',200, 220);
insert into FACTURAENTITY (FORMAPAGO, NAME, PRODUCTO, SUBTOTAL, TOTAL) values ('TarjetaDebito', 'ayuda','Lavanderia',200, 220);


delete from PAGOENTITY;
insert into PAGOENTITY (CODIGOTARJETA, COMPROBANTEPAGOMEDIO, COMPROBANTEPAGOTOTAL, DESCRIPCION, FECHATARJETA,NAME, NUMTARJETA, factura_id) values ( '123', 1, 1,  'pago de tarjeta con num 123',  '19/02/2018', null, '123456789123',1);
insert into PAGOENTITY (CODIGOTARJETA, COMPROBANTEPAGOMEDIO, COMPROBANTEPAGOTOTAL, DESCRIPCION, FECHATARJETA,NAME, NUMTARJETA, factura_id) values ('523', 1, 0,  'pago de tarjeta con num 468',  '19/02/2018', null, '4681624557223',2);
insert into PAGOENTITY (CODIGOTARJETA, COMPROBANTEPAGOMEDIO, COMPROBANTEPAGOTOTAL, DESCRIPCION, FECHATARJETA,NAME, NUMTARJETA, factura_id) values ('534', 0, 1,  'pago de tarjeta con num 163',  '19/02/2018', null, '1631485457956',3);
insert into PAGOENTITY (CODIGOTARJETA, COMPROBANTEPAGOMEDIO, COMPROBANTEPAGOTOTAL, DESCRIPCION, FECHATARJETA,NAME, NUMTARJETA, factura_id) values ( '547', 0, 0,  'pago de tarjeta con num 641',  '19/02/2018', null, '6413484641983',4);


delete from calificacionentity;
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (4, 'Gas', 'Donec vitae nisi.', 9, 21);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (2, 'Climatizacion', 'In est risus, auctor sed, tristique in, tempus sit amet, sem.', 7, 18);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (1, 'Pintura', 'Curabitur convallis.', 8, 14);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (1, 'Pintura', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', 2, 16);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (1, 'Climatizacion', 'Cras in purus eu magna vulputate luctus.', 5, 12);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (3, 'Pintura', 'Morbi non quam nec dui luctus rutrum.', 1, 13);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (5, 'Plomeria', 'Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci.', 2, 19);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (1, 'Pintura', 'Nunc rhoncus dui vel sem.', 2, 20);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (4, 'Climatizacion', 'Vivamus in felis eu sapien cursus vestibulum.', 8, 11);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (2, 'Pintura', 'Quisque arcu libero, rutrum ac, lobortis vel, dapibus at, diam.', 3, 19);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (5, 'Electricidad', 'In hac habitasse platea dictumst.', 2, 18);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (5, 'Pintura', 'Cras non velit nec nisi vulputate nonummy.', 7, 16);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (5, 'Climatizacion', 'Morbi non lectus.', 10, 21);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (1, 'Pintura', 'Aliquam erat volutpat.', 5, 21);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (2, 'Pintura', 'Pellentesque eget nunc.', 8, 11);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (1, 'Mudanza', 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', 3, 14);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (4, 'Plomeria', 'Proin eu mi.', 1, 12);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (5, 'Climatizacion', 'Proin leo odio, porttitor id, consequat in, consequat ut, nulla.', 1, 13);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (5, 'Gas', 'Maecenas ut massa quis augue luctus tincidunt.', 3, 15);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (2, 'Mudanza', 'Pellentesque ultrices mattis odio.', 6, 16);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (5, 'Mudanza', 'Lorem ipsum dolor sit amet, consectetuer adipiscing elit.', 8, 16);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (3, 'Pintura', 'Phasellus sit amet erat.', 7, 16);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (2, 'Electricidad', 'Suspendisse potenti.', 4, 20);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (3, 'Plomeria', 'Morbi quis tortor id nulla ultrices aliquet.', 3, 15);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (4, 'Mudanza', 'Morbi a ipsum.', 7, 11);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (3, 'Gas', 'Nulla mollis molestie lorem.', 9, 21);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (3, 'Plomeria', 'Morbi porttitor lorem id ligula.', 4, 19);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (5, 'Mudanza', 'In est risus, auctor sed, tristique in, tempus sit amet, sem.', 8, 14);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (5, 'Mudanza', 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', 9, 14);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (2, 'Plomeria', 'In est risus, auctor sed, tristique in, tempus sit amet, sem.', 9, 11);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (5, 'Mudanza', 'Mauris enim leo, rhoncus sed, vestibulum sit amet, cursus id, turpis.', 10, 18);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (4, 'Pintura', 'Donec quis orci eget orci vehicula condimentum.', 7, 12);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (2, 'Plomeria', 'Integer ac leo.', 7, 11);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (5, 'Mudanza', 'Mauris lacinia sapien quis libero.', 10, 15);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (4, 'Mudanza', 'Morbi non quam nec dui luctus rutrum.', 5, 18);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (3, 'Plomeria', 'Quisque porta volutpat erat.', 7, 20);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (3, 'Gas', 'Nulla tempus.', 10, 12);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (4, 'Climatizacion', 'Suspendisse ornare consequat lectus.', 6, 11);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (2, 'Pintura', 'Phasellus id sapien in sapien iaculis congue.', 2, 13);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (1, 'Gas', 'Nulla tempus.', 9, 18);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (2, 'Mudanza', 'Curabitur convallis.', 10, 20);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (2, 'Climatizacion', 'Proin at turpis a pede posuere nonummy.', 3, 16);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (3, 'Gas', 'Vestibulum quam sapien, varius ut, blandit non, interdum in, ante.', 10, 13);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (3, 'Pintura', 'Nullam sit amet turpis elementum ligula vehicula consequat.', 6, 12);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (2, 'Gas', 'Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.', 9, 19);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (3, 'Mudanza', 'Duis bibendum, felis sed interdum venenatis, turpis enim blandit mi, in porttitor pede justo eu massa.', 10, 12);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (4, 'Pintura', 'Morbi porttitor lorem id ligula.', 3, 15);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (4, 'Plomeria', 'Mauris sit amet eros.', 7, 19);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (5, 'Electricidad', 'Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla dapibus dolor vel est.', 5, 11);
insert into CALIFICACIONENTITY (numEstrellas, tipoServicio, comentario, contratista_id, cliente_id) values (3, 'Plomeria', 'Nulla tempus.', 9, 14);

delete from USUARIOENTITY_SERVICIOENTITY;
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (1, 1);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (1, 2);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (1, 3);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (1, 4);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (2, 1);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (2, 2);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (2, 3);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (2, 4);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (3, 5);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (3, 6);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (3, 7);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (3, 8);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (4, 5);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (4, 6);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (4, 7);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (4, 8);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (5, 9);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (5, 10);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (5, 1);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (5, 2);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (5, 3);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (5, 4);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (5, 5);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (5, 6);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (6, 1);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (6, 2);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (6, 3);
INSERT INTO USUARIOENTITY_SERVICIOENTITY (servicios_ID, contratistas_ID) VALUES (1, 5);


Delete from cotizacionEntity;
Insert into cotizacionEntity(servicio, valor, descripcion) values('Plomería',160000, 'Arreglar de tuberias del hogar por obstaculacion a causa de acumulacion de comida');
Insert into cotizacionEntity(servicio, valor, descripcion) values('Climatizacion',170000, 'Arreglar de aire acondicionado en 4 habitaciones de una cas muy grande');
Insert into cotizacionEntity(servicio, valor, descripcion) values('Pintura',50000, 'Pintar las paredes externas de una casa con alrededor 800 m2 de construccion');
Insert into cotizacionEntity(servicio, valor, descripcion) values('Gas',200000, 'Arreglo de tuberias de gas del hogar');
Insert into cotizacionEntity(servicio, valor, descripcion) values('Electricidad',5000000, 'Arreglo de corto circuito generado por un daño en una pared');
Insert into cotizacionEntity(servicio, valor, descripcion) values('Mudanza',80000, 'Traslado de muebles y electrodómesticos junto con la instalación de estos a la carrera 5 #62-08');

Delete from SOLICITUDENTITY;
INSERT INTO SOLICITUDENTITY ( cantidad_contratistas, cod_seguridad, descripcion, fecha_inicio, requerimientos, tipo_servicio, cliente_id, contratista_id, servicio_id) VALUES ( 1, 323, 'aqui va una descripcion detallada', '01/06/2018', 'plomeria', 1, 14, 1, 1);
INSERT INTO SOLICITUDENTITY ( cantidad_contratistas, cod_seguridad, descripcion, fecha_inicio, requerimientos, tipo_servicio, cliente_id, contratista_id, servicio_id) VALUES ( 1, 485, 'aqui va una descripcion detallada', '08/08/2018', 'electricidad', 3, 15, 5, 3);

