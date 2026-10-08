ALTER TABLE users
    ADD COLUMN email       VARCHAR(255) NOT NULL,
    ADD COLUMN identity_id UUID         NOT NULL UNIQUE;
