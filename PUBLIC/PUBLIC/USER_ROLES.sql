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

