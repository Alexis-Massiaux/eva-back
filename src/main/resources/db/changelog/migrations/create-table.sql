--liquibase formatted sql

--changeset amx:create-table-test:1
CREATE TABLE test
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);
--rollback DROP TABLE test