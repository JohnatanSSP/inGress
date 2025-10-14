-- V1_create_table_ticket.sql

CREATE TABLE Tickets_DB (
    id BIGSERIAL PRIMARY KEY,
    description TEXT,
    location VARCHAR(255),
    title VARCHAR(255) NOT NULL,
    creator VARCHAR(255) NOT NULL,
    category VARCHAR(100) NOT NULL,
    start_date TIMESTAMP,
    end_date TIMESTAMP,
    organization VARCHAR(255),
    url VARCHAR(500),
    identify VARCHAR(255) NOT NULL UNIQUE,
    image VARCHAR(500),
    status VARCHAR(50),
    rated VARCHAR(50)
);