create table USUARIO
(
    ID       BIGINT auto_increment
        primary key,
    PASSWORD CHARACTER VARYING(255),
    USERNAME CHARACTER VARYING(20)
        constraint UK863N1Y3X0JALATOIR4325EHAL
            unique
);

