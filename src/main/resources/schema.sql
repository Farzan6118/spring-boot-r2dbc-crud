CREATE TABLE if not exists Customer
(
    id           SERIAL PRIMARY KEY,
    first_name   VARCHAR(255),
    last_name    VARCHAR(255),
    phone_number VARCHAR(255),
    birth_date   VARCHAR(255)
);