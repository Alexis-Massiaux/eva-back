--liquibase formatted sql

--changeset amx:dataset-table-test:1
INSERT INTO test (id, name) VALUES (1, 'test1');

--changeset amx:update-dataset-table-test:1
update test set name = 'test2' where id = 1;