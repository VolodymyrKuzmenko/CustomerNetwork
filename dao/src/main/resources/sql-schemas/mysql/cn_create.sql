CREATE TABLE IF NOT EXISTS UserRole (
  role_id   INT         NOT NULL,
  role_name VARCHAR(45) NOT NULL,
  PRIMARY KEY (role_id)
);

-- -----------------------------------------------------
-- Table social_network.User
-- -----------------------------------------------------
DROP TABLE IF EXISTS Users;
drop SEQUENCE IF EXISTS user_id ;
CREATE SEQUENCE user_id;
CREATE TABLE IF NOT EXISTS Users (
  user_id  INTEGER PRIMARY KEY DEFAULT NEXTVAL('user_id'),
  email    CHAR(45),
  password CHAR(100),
  role     INTEGER NUll,
  manager  INTEGER NUll
);

-- -----------------------------------------------------
-- Table social_network.UserInfo
-- -----------------------------------------------------
DROP TABLE IF EXISTS UserInfo;
DROP SEQUENCE IF EXISTS info_id;
CREATE SEQUENCE info_id;
CREATE TABLE IF NOT EXISTS UserInfo (
  info_id  INTEGER    NOT NULL DEFAULT nextval('info_id'),
  name     CHAR(45)   NULL     DEFAULT NULL,
  surname  CHAR(45)   NULL     DEFAULT NULL,
  birthday DATE       NULL     DEFAULT NULL,
  photo    CHAR(2083) NULL     DEFAULT NULL,
  user_id  INTEGER    NULL     DEFAULT NULL,
  PRIMARY KEY (info_id)
);

-- -----------------------------------------------------
-- Table social_network.SessionHistory
-- -----------------------------------------------------
DROP TABLE IF EXISTS SessionHistory;
drop SEQUENCE IF EXISTS idSessionHistory;
CREATE SEQUENCE idSessionHistory;
CREATE TABLE SessionHistory (
  idSessionHistory INTEGER     NOT NULL DEFAULT nextval('idSessionHistory'),
  DATE             TIMESTAMP   NOT NULL,
  USER_num             INT         NOT NULL,
  ip_address       VARCHAR(45) NOT NULL,
  brouser_type     VARCHAR(45) NULL,
  PRIMARY KEY (idSessionHistory)
);

-- -----------------------------------------------------
-- Table social_network.Status
-- -----------------------------------------------------
DROP TABLE IF EXISTS Status;
DROP SEQUENCE IF EXISTS status_id;
CREATE SEQUENCE status_id;
CREATE TABLE IF NOT EXISTS Status (
  status_id  INT         NOT NULL DEFAULT nextval('status_id'),
  statusName VARCHAR(45) NOT NULL,
  TYPE       VARCHAR(45) NOT NULL,
  PRIMARY KEY (status_id)
);

-- -----------------------------------------------------
-- Table social_network.File
-- -----------------------------------------------------
DROP TABLE IF EXISTS File;
DROP SEQUENCE IF EXISTS id_file;
CREATE SEQUENCE id_file;
CREATE TABLE IF NOT EXISTS File (
  idFile     INT          NOT NULL,
  fileName   VARCHAR(45)  NULL,
  pathToFile VARCHAR(100) NULL,
  PRIMARY KEY (idFile)
);

-- -----------------------------------------------------
-- Table social_network.Comment
-- -----------------------------------------------------
DROP TABLE IF EXISTS Comment;

CREATE TABLE IF NOT EXISTS Comment (
  idComment    INT       NOT NULL,
  TEXT         TEXT      NULL,
  date_created TIMESTAMP NULL,
  date_updated TIMESTAMP NULL,
  deleted      SMALLINT   NULL,
  PRIMARY KEY (idComment)
);

-- -----------------------------------------------------
-- Table social_network.User_File
-- -----------------------------------------------------
DROP TABLE IF EXISTS User_File;

CREATE TABLE IF NOT EXISTS User_File (
  User_user_id INT NOT NULL,
  File_idFile  INT NOT NULL,
  PRIMARY KEY (User_user_id, File_idFile)
);

-- -----------------------------------------------------
-- Table social_network.Project
-- -----------------------------------------------------
DROP TABLE IF EXISTS Project;
DROP SEQUENCE IF EXISTS id_project;
CREATE SEQUENCE id_project;
CREATE TABLE IF NOT EXISTS Project (
  project_id      INT           NOT NULL DEFAULT nextval('id_project'),
  NAME            VARCHAR(45)   NULL,
  status          INT           NOT NULL,
  parrent_project INT           NULL,
  description     VARCHAR(1000) NULL,
  date_created    TIMESTAMP     NULL,
  date_updated    TIMESTAMP     NULL,
  responsible     INT           NOT NULL,
  PRIMARY KEY (project_id)
);

-- -----------------------------------------------------
-- Table social_network.Task
-- -----------------------------------------------------
DROP TABLE IF EXISTS Task;
DROP SEQUENCE IF EXISTS task_id;
CREATE SEQUENCE task_id;
--Note for FK_B!!!!!!!!!!!!!!!!!!!!!!
CREATE TABLE IF NOT EXISTS Task (
  task_id      INT         NOT NULL DEFAULT nextval('task_id'),
  NAME         VARCHAR(45) NULL,
  date_created TIMESTAMP   NULL,
  date_updated TIMESTAMP   NULL,
  deleted      SMALLINT     NULL,
  responsible  INT         NULL,
  project      INT         NOT NULL,
  status       INT         NOT NULL,
  fk_b INT  ,
  PRIMARY KEY (task_id),
  FOREIGN KEY (fk_b) REFERENCES Project(project_id)
);
-- ALTER TABLE Task ADD CONSTRAINT fk_b FOREIGN KEY Task(project) REFERENCES Project(project_id);

-- -----------------------------------------------------
-- Table social_network.Comment_Task
-- -----------------------------------------------------
DROP TABLE IF EXISTS Comment_Task;

CREATE TABLE IF NOT EXISTS Comment_Task (
  Comment_idComment INT NOT NULL,
  Task_task_id      INT NOT NULL,
  PRIMARY KEY (Comment_idComment, Task_task_id)
);

-- -----------------------------------------------------
-- Table social_network.File_Task
-- -----------------------------------------------------
DROP TABLE IF EXISTS File_Task;

CREATE TABLE IF NOT EXISTS File_Task (
  File_idFile  INT NOT NULL,
  Task_task_id INT NOT NULL,
  PRIMARY KEY (File_idFile, Task_task_id)
);

-- -----------------------------------------------------
-- Table social_network.Comment_Project
-- -----------------------------------------------------
DROP TABLE IF EXISTS Comment_Project;

CREATE TABLE IF NOT EXISTS Comment_Project (
  comment_id INT NOT NULL,
  project_id INT NOT NULL,
  PRIMARY KEY (comment_id, project_id)
);

-- -----------------------------------------------------
-- Table social_network.User_Comment
-- -----------------------------------------------------
DROP TABLE IF EXISTS User_Comment;

CREATE TABLE IF NOT EXISTS User_Comment (
  User_user_id      INT NOT NULL,
  Comment_idComment INT NOT NULL,
  PRIMARY KEY (User_user_id, Comment_idComment)
);

-- SET SQL_MODE =@ OLD_SQL_MODE;
-- SET FOREIGN_KEY_CHECKS =@ OLD_FOREIGN_KEY_CHECKS;
-- SET UNIQUE_CHECKS =@ OLD_UNIQUE_CHECKS;
