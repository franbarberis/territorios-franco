CREATE TABLE territorios
(
    id_territorio integer NOT NULL,
    nombre_territorio varchar(50),
    CONSTRAINT pk_territorio PRIMARY KEY (id_territorio)
);

create table estados_telefonos(
    id_estado_telefono integer,
    denom_estado_telefono varchar(40),
    constraint pk_estado_telefono primary key (id_estado_telefono)
);

insert into estados_telefonos(id_estado_telefono, denom_estado_telefono) values (1,'OK');
insert into estados_telefonos(id_estado_telefono, denom_estado_telefono) values (2,'Fuera de Servicio');
insert into estados_telefonos(id_estado_telefono, denom_estado_telefono) values (3,'Temporalmente Fuera de Servicio');
insert into estados_telefonos(id_estado_telefono, denom_estado_telefono) values (4,'No Contesto');
insert into estados_telefonos(id_estado_telefono, denom_estado_telefono) values (5,'No llamar');
insert into estados_telefonos(id_estado_telefono, denom_estado_telefono) values (6,'No Corresponde a un abonado en servicio');
insert into estados_telefonos(id_estado_telefono, denom_estado_telefono) values (7,'Revisita');


CREATE TABLE telefonos
(
    numero varchar(10) COLLATE pg_catalog."default" NOT NULL,
    nombre_completo varchar(50) COLLATE pg_catalog."default",
    id_territorio integer,
    CONSTRAINT pk_numero PRIMARY KEY (numero),
    CONSTRAINT fk_numero_territorio FOREIGN KEY (id_territorio)
        REFERENCES public.territorios (id_territorio)
);

alter table telefonos
add column id_estado_telefono integer;

alter table telefonos
add constraint fk_estado_telefono foreign key (id_estado_telefono) references estados_telefonos (id_estado_telefono);


CREATE TABLE users (
 id integer,
 username varchar(80),
 password varchar(80),
 constraint pk_user primary key (id)
);


alter table territorios
add column fecha_inicio timestamp;

alter table territorios
add column fecha_fin timestamp;

CREATE SEQUENCE public.users_sequence
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;


