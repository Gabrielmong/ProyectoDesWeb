create table TacosConRepollo
(ingrediente varchar(30) not null,
cantidad int not null,
PRIMARY KEY (ingrediente));

create table Chifrijo
(ingrediente varchar(30) not null,
cantidad int not null,
PRIMARY KEY (ingrediente));

create table ArrozConLeche
(ingrediente varchar(30) not null,
cantidad int not null,
PRIMARY KEY (ingrediente));

create table Pati
(ingrediente varchar(30) not null,
cantidad int not null,
PRIMARY KEY (ingrediente));

create table GalloPinto
(ingrediente varchar(30) not null,
cantidad int not null,
PRIMARY KEY (ingrediente));

create table Vigoron
(ingrediente varchar(30) not null,
cantidad int not null,
PRIMARY KEY (ingrediente));

create table NovilloAlegre
(platos varchar(30) not null,
id_plato int not null auto_increment,
ubicacion varchar(30) not null,
PRIMARY KEY (id_plato));

create table Chicharronera
(platos varchar(30) not null,
id_plato int not null auto_increment,
ubicacion varchar(30) not null,
PRIMARY KEY (id_plato));

create table Pasteleria
(platos varchar(30) not null,
id_plato int not null auto_increment,
ubicacion varchar(30) not null,
PRIMARY KEY (id_plato));