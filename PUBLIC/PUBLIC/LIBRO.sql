create table LIBRO
(
    ID           BIGINT auto_increment
        primary key,
    CURRENT_PAGE INTEGER                not null,
    IS_PHYSIC    BOOLEAN                not null,
    MAX_PAGES    INTEGER,
    TITLE        CHARACTER VARYING(255) not null,
    URL          CHARACTER VARYING(255)
);

