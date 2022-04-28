DROP DATABASE Comidas;
CREATE DATABASE Comidas;
USE Comidas;
CREATE TABLE `Comidas`.`posts`(
		`id_pub` INT NOT NULL AUTO_INCREMENT, 
        `titulo` VARCHAR(40) NOT NULL, 
		`autor` VARCHAR(30) NOT NULL, 
        `review` varchar(1010) null, 
        `post_date` DATE, PRIMARY KEY 
        (`id_pub`));
INSERT INTO `Comidas`.`posts` (`titulo`, `autor`, `review`, `post_date`)
	VALUES ('Title Test', 'Author Test', 'Review Here', '2022-03-10');
DROP USER IF EXISTS 'user123'@'%';
CREATE USER 'user123'@'%' IDENTIFIED BY 'password123';
GRANT ALL PRIVILEGES ON Comidas.* to 'user123'@'%';
flush privileges;


create table Tacos_Con_Repollo
(id INT auto_increment NOT NULL,
ingrediente varchar(30) not null,
cantidad int not null,
PRIMARY KEY (id));

create table Chifrijo
(id INT auto_increment NOT NULL,
ingrediente varchar(30) not null,
cantidad int not null,
PRIMARY KEY (id));

create table Arroz_Con_Leche
(id INT auto_increment NOT NULL,
ingrediente varchar(30) not null,
cantidad int not null,
PRIMARY KEY (id));

create table Pati
(id INT auto_increment NOT NULL,
ingrediente varchar(30) not null,
cantidad int not null,
PRIMARY KEY (id));

create table Gallo_Pinto
(id INT auto_increment NOT NULL,
ingrediente varchar(30) not null,
cantidad int not null,
PRIMARY KEY (id));

create table Vigoron
(id INT auto_increment NOT NULL,
ingrediente varchar(30) not null,
cantidad int not null,
PRIMARY KEY (id));

create table Novillo_Alegre
(platos varchar(30) not null,
id int not null auto_increment,
ubicacion varchar(30) not null,
PRIMARY KEY (id));

create table Chicharronera
(platos varchar(30) not null,
id int not null auto_increment,
ubicacion varchar(30) not null,
PRIMARY KEY (id));

create table Pasteleria
(platos varchar(30) not null,
id int not null auto_increment,
ubicacion varchar(30) not null,
PRIMARY KEY (id));

insert into comidas.Arroz_Con_Leche (ingrediente, cantidad) values
('agua', 5),
('canela', 1),
('arroz', 3),
('leche condensada', 2);

insert into comidas.Chifrijo (ingrediente, cantidad) values
('arroz', 1),
('chicharon', 2),
('chicharon de concha', 1),
('frijoles', 2),
('tomate', 1),
('aguacate', 1);

insert into comidas.Gallo_Pinto (ingrediente, cantidad) values
('arroz', 5),
('culantro', 1),
('frijoles', 3),
('lizano', 2);

insert into comidas.Pati (ingrediente, cantidad) values
('chorizo', 3),
('chile', 1),
('leche de coco', 3),
('condimentos', 2);

insert into comidas.Tacos_Con_Repollo (ingrediente, cantidad) values
('tacos', 5),
('carne', 5),
('repollo', 3),
('salsas', 2);

insert into comidas.Chicharronera (platos, id, ubicacion) values
('chifrijo', 1, 'san jose'),
('arroz con pollo', 2, 'san jose'),
('vigoron', 3, 'san jose');

insert into comidas.Novillo_alegre (platos, id, ubicacion) values
('rib eye', 1, 'san Pedro'),
('mar y tierra', 2, 'san Pedro'),
('costilla', 3, 'san Pedro');

insert into comidas.Pasteleria (platos, id, ubicacion) values
('Cupcake', 1, 'san jose'),
('Cheesecake', 2, 'san jose'),
('Pie', 3, 'san jose');
