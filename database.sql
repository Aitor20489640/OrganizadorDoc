create table AUDIO_LIBRO
(
    ID           BIGINT auto_increment
        primary key,
    DURATION     CHARACTER VARYING(255) not null,
    TITLE        CHARACTER VARYING(255) not null,
    URL          CHARACTER VARYING(255),
    CURRENT_PAGE INTEGER                not null,
    MAX_PAGES    INTEGER,
    NARRATED_BY  CHARACTER VARYING(255)
);

create table LIBRO
(
    ID           BIGINT auto_increment
        primary key,
    CURRENT_PAGE INTEGER                not null,
    IS_PHYSIC    BOOLEAN                not null,
    MAX_PAGES    INTEGER                not null,
    TITLE        CHARACTER VARYING(255) not null,
    URL          CHARACTER VARYING(255)
);

create table PELICULA
(
    ID             BIGINT auto_increment
        primary key,
    DURATION       CHARACTER VARYING(255) not null,
    TITLE          CHARACTER VARYING(255) not null,
    URL            CHARACTER VARYING(255),
    CURRENT_MINUTE INTEGER                not null
);

create table ROLES
(
    ID   INTEGER auto_increment
        primary key,
    NAME CHARACTER VARYING(20)
);

create table SERIE
(
    ID              BIGINT auto_increment
        primary key,
    DURATION        CHARACTER VARYING(255) not null,
    TITLE           CHARACTER VARYING(255) not null,
    URL             CHARACTER VARYING(255),
    CURRENT_CHAPTER INTEGER                not null,
    CURRENT_SEASON  INTEGER                not null,
    MAX_CHAPTER     INTEGER,
    MAX_SEASONS     INTEGER
);

create table USUARIO
(
    ID       BIGINT auto_increment
        primary key,
    PASSWORD CHARACTER VARYING(255),
    USERNAME CHARACTER VARYING(20)
        constraint UK863N1Y3X0JALATOIR4325EHAL
            unique
);

create table USER_ROLES
(
    USER_ID BIGINT  not null,
    ROLE_ID INTEGER not null,
    primary key (USER_ID, ROLE_ID),
    constraint FK6HDCXIG28SJUX082EKDAE5WNJ
        foreign key (USER_ID) references USUARIO,
    constraint FKH8CIRAMU9CC9Q3QCQIV4UE8A6
        foreign key (ROLE_ID) references ROLES
);

create table VIDEO
(
    ID             BIGINT auto_increment
        primary key,
    DURATION       CHARACTER VARYING(255) not null,
    TITLE          CHARACTER VARYING(255) not null,
    URL            CHARACTER VARYING(255),
    CURRENT_MINUTE INTEGER                not null
);

INSERT INTO LIBRO (ID, CURRENT_PAGE, IS_PHYSIC, MAX_PAGES, TITLE, URL) VALUES (1, 1, true, 1, 'Titulo', null);

INSERT INTO AUDIO_LIBRO (DURATION, TITLE, URL, CURRENT_PAGE, MAX_PAGES, NARRATED_BY) VALUES ('1', 'Test', null, 1, 100, 'Me');

INSERT INTO ROLES (NAME) VALUES ('ROLE_USER');

INSERT INTO USUARIO (PASSWORD, USERNAME) VALUES ('$2a$10$7Uejg1fuzPvrVbAa3Mw25O3nSmqpwScpMvTs0zYAhHfXqOMQsIxTu', 'aitor');

INSERT INTO USER_ROLES (USER_ID, ROLE_ID) VALUES (4, 1);


