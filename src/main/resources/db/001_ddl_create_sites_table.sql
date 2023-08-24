create table sites (
    id serial primary key not null,
    site varchar(2000) not null unique,
    login varchar(2000),
    password varchar(2000),
    registration boolean
);