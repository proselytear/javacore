create table if not exists developers (
  id         int PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(30)  NOT NULL,
  last_name  VARCHAR(50)  NOT NULL,
  specialty  VARCHAR(100) NOT NULL
);