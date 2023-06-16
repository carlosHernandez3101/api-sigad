CREATE TABLE docentes (
  id bigint NOT NULL auto_increment,
  nombres varchar(100) NOT NULL,
  apellidos varchar(100) NOT NULL,
  tipoIdentificacion varchar(20) NOT NULL,
  identificacion varchar(20) NOT NULL,
  tipoDocente varchar(20) NOT NULL,
  correoInstitucional varchar(100) NOT NULL,
  ultimoTituloAcademico varchar(100) NOT NULL,
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