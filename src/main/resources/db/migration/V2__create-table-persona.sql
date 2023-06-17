CREATE TABLE personas (
  id bigint NOT NULL auto_increment,
  nombres varchar(100) NOT NULL,
  apellidos varchar(100) NOT NULL,
  correo_institucional varchar(100) NOT NULL,
  primary key (id)
);