CREATE TABLE IF NOT EXISTS specialties (
  id         int PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(50)  NOT NULL
);


ALTER TABLE developers DROP specialty;
ALTER TABLE developers ADD COLUMN specialty_id INT;

ALTER TABLE developers
  ADD CONSTRAINT developers_specialty_fk
FOREIGN KEY (specialty_id) REFERENCES specialties (id);
