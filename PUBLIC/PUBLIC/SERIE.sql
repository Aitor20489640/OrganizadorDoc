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

