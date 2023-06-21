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

  CREATE TABLE periodos_academicos (
    id int(11) NOT NULL AUTO_INCREMENT,
    nombre varchar(100) NOT NULL,
    anio int(11) NOT NULL,
    semestre int(11) NOT NULL,
    fecha_inicio date NOT NULL,
    fecha_final date NOT NULL,
    primary key (id)
);
CREATE TABLE tipos_labores (
  id int(11) NOT NULL AUTO_INCREMENT,
  codigo varchar(2) NOT NULL,
  descripcion varchar(100) NOT NULL,
  primary key (id)
);

CREATE TABLE labores_docentes (
  id int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(100) NOT NULL,
  horas_asignadas int(11) NOT NULL,
  descripcion varchar(200) NOT NULL,
  tipo_labor_id int(11) NOT NULL,
  primary key (id),
  foreign key (tipo_labor_id) references tipos_labores(id)
)