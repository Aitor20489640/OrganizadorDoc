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

