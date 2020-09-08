CREATE TABLE territorios
(
    id_territorio integer NOT NULL,
    nombre_territorio varchar(50),
    CONSTRAINT pk_territorio PRIMARY KEY (id_territorio)
);

CREATE TABLE telefonos
(
    numero varchar(10) COLLATE pg_catalog."default" NOT NULL,
    nombre_completo varchar(50) COLLATE pg_catalog."default",
    id_territorio integer,
    CONSTRAINT pk_numero PRIMARY KEY (numero),
    CONSTRAINT fk_numero_territorio FOREIGN KEY (id_territorio)
        REFERENCES public.territorios (id_territorio)
);

CREATE TABLE users (
 id integer,
 username varchar(80),
 password varchar(80),
 constraint pk_user primary key (id)
);

CREATE SEQUENCE public.users_sequence
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;


