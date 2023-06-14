CREATE TABLE usuarios (
  id bigint NOT NULL auto_increment,
  usuario varchar(100) NOT NULL,
  contraseña varchar(100) NOT NULL,
  rol varchar(100) NOT NULL,
  docente_id bigint NOT NULL,
  primary key (id),
  foreign key (docente_id) references docentes(id)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;