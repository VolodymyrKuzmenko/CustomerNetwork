
CREATE TABLE Users (
  user_id  INTEGER PRIMARY KEY DEFAULT NEXTVAL('user_id'),
  email    CHAR(45),
  password CHAR(100),
  role     INTEGER,
  manager  INTEGER
);



CREATE TABLE SessionHistory (
  idSessionHistory INTEGER NOT NULL DEFAULT nextval('idSessionHistory'),
  DATE_time  TIMESTAMP NOT NULL,
  user  INTEGER NOT NULL,
  ip_address VARCHAR (45) NOT NULL,
  brouser_type VARCHAR (45) NULL,
  PRIMARY KEY (idSessionHistory));