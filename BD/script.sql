PRAGMA foreign_keys = ON;

DROP TABLE IF EXISTS socios;
CREATE TABLE socios (
id_socio INTEGER PRIMARY KEY AUTOINCREMENT,
nombre TEXT,
apellidos TEXT,
telefono INTEGER,
correo TEXT
);
DROP TABLE IF EXISTS libros;
CREATE TABLE libros (
ISBN TEXT PRIMARY KEY,
titulo TEXT,
autor TEXT,
num_paginas INTEGER,
editorial TEXT
);
DROP TABLE IF EXISTS prestamos;
CREATE TABLE prestamos (
id_prestamo INTEGER PRIMARY KEY AUTOINCREMENT,
ISBN_libro TEXT,
titulo_libro TEXT,
nombre_socio TEXT,
id_socio INTEGER,
fechaPrestamo NUMERIC,
FOREIGN KEY(ISBN_libro) REFERENCES libros(ISBN) ON DELETE CASCADE,
FOREIGN KEY(id_socio) REFERENCES socios(id_socios) ON DELETE CASCADE,
FOREIGN KEY(titulo_libro) REFERENCES libros(titulo) ON DELETE CASCADE,
FOREIGN KEY(nombre_socio) REFERENCES socios(nombre) ON DELETE CASCADE
);

INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Juan", "Pan Conajos",695934599,"juanga@hotmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Pepe", "Carilla Dura",624563457,"pepe@hotmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Jose", "Estocolmo Estolarrisa",635762397,"shulo@hotmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Pedro", "Papaya Zumo",662244876,"peterht@hotmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Federico", "Paraguas Parasol",698753467,"fedepede@hotmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Adrian", "Alejos Cerca",7182049385,"jadritan@hotmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Angustias", "Pimpum Conpan",692832342,"angu12@hotmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Maria", "Telemierda Entertainment",611223345,"mariten@hotmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Jose Maria", "Casa Sintecho",616083456,"josesin@hotmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Pepa", "Orco Mordor",639362489,"pipol@gmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Padre", "De Gemelas",632531456,"ptrillizasl@gmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Gastro", "Estramonium Puerta",718294756,"extra@gmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Tobi", "Banderas Peras",6193047452,"guau@gmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Jacinto", "Jhonsons Baby",600334463,"reich3@gmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Elvira", "Titulo Tombola",602474534,"klovds@gmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Manolo", "Apruebame Porfavor",622114352,"geqrg@gmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Oscar", "Copia Examenes",612345678,"gergre@gmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("Asco", "Cabras Salmonelosis",698765432,"pqerg@gmail.com");
INSERT INTO socios (nombre,apellidos,telefono,correo) VALUES ("David", "Tumadre Muerta",676543210,"pergqejiuioqgnj@gmail.com");
INSERT INTO libros (ISBN,titulo,autor,num_paginas,editorial) VALUES ("84-121-2310-1","El tránsito terreno","Juan Luis Plasencia",200,"Larrosa Mas, S.L.");
INSERT INTO libros (ISBN,titulo,autor,num_paginas,editorial) VALUES ("84-7489-146-9","Sistemas Operativos","Bazilian Eric",340,"GGG&G");
INSERT INTO libros (ISBN,titulo,autor,num_paginas,editorial) VALUES ("84-305-0473-7","Poemas intrínsecos","Llorens Antonia",460,"Deloria Editores");
INSERT INTO libros (ISBN,titulo,autor,num_paginas,editorial) VALUES ("84-473-0120-6","Avances en Arquitectura","Richter, Helmut",1500,"TechniBooks");
INSERT INTO libros (ISBN,titulo,autor,num_paginas,editorial) VALUES ("84-206-1704-0","Las balas del bien","Leverling, Janet",315,"GGG&G");
INSERT INTO libros (ISBN,titulo,autor,num_paginas,editorial) VALUES ("84-226-2128-2","La mente y el sentir","Juan Luis Plasencia",342,"Larrosa Mas, S.L.");
INSERT INTO libros (ISBN,titulo,autor,num_paginas,editorial) VALUES ("84-7908-349-2","Ensayos póstumos","Bertomeu, Andrés",127,"Deloria Editores");
INSERT INTO libros (ISBN,titulo,autor,num_paginas,editorial) VALUES ("84-578-0214-8","La dualidad aparente","Sanabria, Carmelo",290,"Larrosa Mas, S.L.");
INSERT INTO libros (ISBN,titulo,autor,num_paginas,editorial) VALUES ("84-02-08696-9","Arquitectura y arte","Richter, Helmut",700,"Grisham Publishing");
INSERT INTO libros (ISBN,titulo,autor,num_paginas,editorial) VALUES ("84-01-92101-5","Historia de Occidente","Dulac, George",479,"McCoy Hill");
INSERT INTO libros (ISBN,titulo,autor,num_paginas,editorial) VALUES ("84-7634-421-1","Sentimiento popular","Llorens, Antonia",310,"Larrosa Mas, S.L.");
INSERT INTO libros (ISBN,titulo,autor,num_paginas,editorial) VALUES ("84-444-0027-3","Canto de esperanza","JDavolio, Nancy",500,"Larrosa Mas, S.L.");



