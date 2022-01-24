CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1;

CREATE TABLE USER
(
    id              BIGINT NOT NULL,
    firstName       VARCHAR(255),
    lastNameeeeee   VARCHAR(255),
    birth           DATE,
    someUselessField DATE,
    PRIMARY KEY (id)
);
