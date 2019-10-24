CREATE TABLE users(
    id serial primary key,
    email text unique not null,
    password varchar not null
);

CREATE TABLE news(
    id serial primary key,
    header text,
    content text,
    created_at bigint
);