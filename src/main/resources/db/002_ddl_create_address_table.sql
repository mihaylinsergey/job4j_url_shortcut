create table address (
    id serial primary key not null,
    url varchar(2000) not null unique,
    code varchar(2000),
    total int
);