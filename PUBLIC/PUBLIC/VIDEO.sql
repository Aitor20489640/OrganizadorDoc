create table VIDEO
(
    ID             BIGINT auto_increment
        primary key,
    DURATION       CHARACTER VARYING(255) not null,
    TITLE          CHARACTER VARYING(255) not null,
    URL            CHARACTER VARYING(255),
    CURRENT_MINUTE INTEGER                not null
);

