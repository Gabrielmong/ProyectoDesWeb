CREATE SCHEMA Comidas;

CREATE TABLE `Comidas`.`posts`(
		`id_pub` INT NOT NULL AUTO_INCREMENT, 
        `titulo` VARCHAR(40) NOT NULL, 
		`autor` VARCHAR(30) NOT NULL, 
        `review` varchar(250) null, 
        `post_date` DATE, PRIMARY KEY 
        (`id_pub`));

INSERT INTO `Comidas`.`posts` (`titulo`, `autor`, `review`, `post_date`)
	VALUES ('Title Test', 'Author Test', 'Review Here', '2022-03-10');
    

CREATE USER 'user123'@'%' IDENTIFIED BY 'password123';

GRANT ALL PRIVILEGES ON Comidas.* to 'user123'@'%';
flush privileges;