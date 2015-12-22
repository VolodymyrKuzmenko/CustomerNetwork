

DROP TABLE UserRole IF EXISTS;
DROP TABLE UserRole IF EXISTS ;
DROP TABLE User IF EXISTS ;
DROP TABLE UserInfo IF EXISTS ;
DROP TABLE SessionHistory IF EXISTS ;
DROP TABLE Status IF EXISTS ;
DROP TABLE File IF EXISTS ;
DROP TABLE Comment IF EXISTS ;
DROP TABLE User_File IF EXISTS ;
DROP TABLE Project IF EXISTS ;
DROP TABLE Task IF EXISTS ;
DROP TABLE Comment_Task IF EXISTS ;
DROP TABLE Comment_Project IF EXISTS ;
DROP TABLE User_Comment IF EXISTS;
DROP TABLE File_Task IF EXISTS ;


CREATE TABLE UserRole (
  role_id INTEGER NOT NULL,
  role_name VARCHAR(45) NOT NULL,
  PRIMARY KEY (role_id) );


CREATE TABLE User (
  user_id INTEGER NOT NULL IDENTITY,
  email VARCHAR(45) NOT NULL,
  password VARCHAR(100) NOT NULL,
  role INTEGER NOT NULL,
  manager INTEGER NULL);

CREATE TABLE UserInfo (
  info_id INTEGER NOT NULL IDENTITY,
  name VARCHAR(45),
  surname VARCHAR(45),
  birthday DATE,
  photo VARCHAR(2083),
  user_id INTEGER);

CREATE TABLE SessionHistory (
  idSessionHistory INTEGER NOT NULL IDENTITY,
  date TIMESTAMP(6) NOT NULL,
  user INTEGER NOT NULL,
  ip_address VARCHAR(45) NOT NULL,
  brouser_type VARCHAR(45) NULL);

CREATE TABLE Status (
  status_id INTEGER NOT NULL IDENTITY,
  statusName VARCHAR(45) NOT NULL,
  type VARCHAR(45) NOT NULL);

CREATE TABLE File (
  idFile INTEGER NOT NULL,
  fileName VARCHAR(45) NULL,
  pathToFile VARCHAR(100) NULL,
  PRIMARY KEY (idFile) );

CREATE TABLE Comment (
  idComment INTEGER NOT NULL IDENTITY,
  text VARCHAR(1000) NULL,
  date_created TIMESTAMP(6) NULL,
  date_updated TIMESTAMP(6) NULL,
  deleted INTEGER NULL);

CREATE TABLE User_File (
  User_user_id INTEGER NOT NULL,
  File_idFile INTEGER NOT NULL,
  PRIMARY KEY (User_user_id, File_idFile) );


CREATE TABLE Project (
  project_id INTEGER NOT NULL IDENTITY,
  name VARCHAR(45) NULL,
  status INTEGER NOT NULL,
  parrent_project INTEGER NULL ,
  description VARCHAR(1000) NULL,
  date_created TIMESTAMP(6) NULL,
  date_updated TIMESTAMP(6) NULL,
  responsible INTEGER NOT NULL);


CREATE TABLE Task (
  task_id INTEGER NOT NULL IDENTITY,
  name VARCHAR(100) NULL,
  date_created TIMESTAMP(6) NULL,
  date_updated TIMESTAMP(6) NULL,
  deleted INTEGER NULL,
  responsible INTEGER NULL,
  project INTEGER NOT NULL,
  status INTEGER NOT NULL);

ALTER TABLE Task ADD CONSTRAINT fk_b FOREIGN KEY (project) references Project(project_id);

CREATE TABLE Comment_Task (
  Comment_idComment INTEGER NOT NULL,
  Task_task_id INTEGER NOT NULL,
  PRIMARY KEY (Comment_idComment, Task_task_id) );

CREATE TABLE File_Task (
  File_idFile INTEGER NOT NULL,
  Task_task_id INTEGER NOT NULL,
  PRIMARY KEY (File_idFile, Task_task_id) );

CREATE TABLE Comment_Project (
  comment_id INTEGER NOT NULL,
  project_id INTEGER NOT NULL,
  PRIMARY KEY (comment_id, project_id) );

CREATE TABLE User_Comment (
  User_user_id INTEGER NOT NULL,
  Comment_idComment INTEGER NOT NULL,
  PRIMARY KEY (User_user_id, Comment_idComment) );




