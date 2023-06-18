CREATE TABLE docentes (
  id bigint NOT NULL auto_increment,
  nombres varchar(100) NOT NULL,
  apellidos varchar(100) NOT NULL,
  tipo_identificacion varchar(20) NOT NULL,
  identificacion varchar(20) NOT NULL,
  tipo_docente varchar(20) NOT NULL,
  correo_institucional varchar(100) NOT NULL,
  ultimo_titulo_academico varchar(100) NOT NULL,
  primary key (id)
);
CREATE TABLE usuarios (
    id bigint NOT NULL auto_increment,
    usuario varchar(100) NOT NULL,
    contrasenia varchar(100) NOT NULL,
    rol varchar(100) NOT NULL,
    docente_id bigint NOT NULL,
    primary key (id),
    foreign key (docente_id) references docentes(id)
 );

  CREATE TABLE periodoacademico (
    id int(11) NOT NULL AUTO_INCREMENT,
    Nombre varchar(100) NOT NULL,
    Anio int(11) NOT NULL,
    Semestre int(11) NOT NULL,
    Fecha_Inicio date NOT NULL,
    Fecha_Final date NOT NULL,
    primary key (id)
);