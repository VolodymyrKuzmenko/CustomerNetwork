
delete from UserRole where role_id>0;
delete from SessionHistory where idSessionHistory > 0;
delete from User where User_id >0;
delete from Task where Task_id>0;
delete from Project where Project_id >0;
delete from Status where Status_id>0;
DELETE FROM UserInfo WHERE info_id>0;

INSERT INTO UserRole (role_id,role_name)VALUES(1,'User');
INSERT INTO UserRole (role_id,role_name)VALUES(2,'admin');
INSERT INTO UserRole (role_id,role_name)VALUES(3,'superadmin');
INSERT INTO UserRole (role_id,role_name)VALUES(4,'manager');
/*email = admin@gmail.com  password = admin */
INSERT INTO User (User_id,email,password,role,manager)VALUES(1,'admin@gmail.com','$2a$12$ocIwWFnIY1yRJPRYgKgsBu10OcLFEKEe1I1SrZrxW/GQ3KXUZ/1X6',2,0);
/*email = User@gmail.com  password = User */
INSERT INTO User (User_id,email,password,role,manager)VALUES(2,'User@gmail.com','$2a$12$zO6v3C2MyjTFQuwiJpM4VO/28wX081keJ7brprmYxJrvJ1hdz.7f6',1,0);
/*email = vasiar@gmail.com  password = vasia44 */
INSERT INTO User (User_id,email,password,role,manager)VALUES(3,'vasia@gmail.com','$2a$12$jGl7pa/fZJ395z8cOFsogeS5cmN/7ZeEkIsgCutZOnUhf2nUhSBzS',1,0);
/*email = ivan@gmail.com  password = ivan34 */
INSERT INTO User (User_id,email,password,role,manager)VALUES(4,'ivan@gmail.com','$2a$12$wJH.ZyGEdg7ftlFah9NxA.i3GkgqzzCDky/pR4GfQAitXnQz9YhQS',1,0);

INSERT INTO UserInfo(info_id,name,surname,birthday,photo,User_id)VALUES(1,'Admin','Adminkovich','1996-09-08',234234234234,1);
INSERT INTO UserInfo(info_id,name,surname,birthday,photo,User_id)VALUES(2,'Vova','Kuzmenko','1995-05-08',234234234234,2);
INSERT INTO UserInfo(info_id,name,surname,birthday,photo,User_id)VALUES(3,'Vasia','Pupkin','1996-09-08',234234234234,3);
INSERT INTO UserInfo(info_id,name,surname,birthday,photo,User_id)VALUES(4,'Ivan','Ivanovich','1991-01-08',234234234234,4);

INSERT INTO Status(Status_id,StatusName,type)VALUES(1,'Todo','Task');
INSERT INTO Status(Status_id,StatusName,type)VALUES(2,'In Progress','Task');
INSERT INTO Status(Status_id,StatusName,type)VALUES(3,'Done','Task');
INSERT INTO Status(Status_id,StatusName,type)VALUES(4,'Testing','Task');
INSERT INTO Status(Status_id,StatusName,type)VALUES(5,'Review','Task');


INSERT INTO Status(Status_id,StatusName,type)VALUES(6,'Todo','Project');
INSERT INTO Status(Status_id,StatusName,type)VALUES(7,'In Progress','Project');
INSERT INTO Status(Status_id,StatusName,type)VALUES(8,'Done','Project');
INSERT INTO Status(Status_id,StatusName,type)VALUES(9,'Testing','Project');
INSERT INTO Status(Status_id,StatusName,type)VALUES(10,'Production','Project');
INSERT INTO Status(Status_id,StatusName,type)VALUES(11,'Integration','Project');

INSERT INTO Project(Project_id,name,Status,parrent_Project,description,date_created,date_updated,responsible)
VALUES(1,'customer network',7,0,'creating customer network with crm and issue traking','2012-02-14 12:30:44','2012-02-14 12:30:44',1);
INSERT INTO Project(Project_id,name,Status,parrent_Project,description,date_created,date_updated,responsible)
VALUES(2,'customer network - dao',7,1,'creating dao','2012-02-14 12:30:44','2012-02-14 12:30:44',2);
INSERT INTO Project(Project_id,name,Status,parrent_Project,description,date_created,date_updated,responsible)
VALUES(3,'customer network - service',7,1,'creating service','2012-02-14 12:30:44','2012-02-14 12:30:44',3);
INSERT INTO Project(Project_id,name,Status,parrent_Project,description,date_created,date_updated,responsible)
VALUES(4,'customer network - database',8,1,'modify database','2012-02-14 12:30:44','2012-02-14 12:30:44',4);

INSERT INTO Task(Task_id,name,date_created,date_updated,deleted,responsible,Project,Status)
VALUES(1,'Table for User','2012-02-14 12:30:44','2012-02-14 12:30:44',0,2,4,2);
INSERT INTO Task(Task_id,name,date_created,date_updated,deleted,responsible,Project,Status)
VALUES(2,'Table for Task','2012-02-14 12:30:44','2012-02-14 12:30:44',0,3,4,2);
INSERT INTO Task(Task_id,name,date_created,date_updated,deleted,responsible,Project,Status)
VALUES(3,'Table for File and coment','2012-02-14 12:30:44','2012-02-14 12:30:44',0,1,4,2);
INSERT INTO Task(Task_id,name,date_created,date_updated,deleted,responsible,Project,Status)
VALUES(4,'DAO for User','2012-02-14 12:30:44','2012-02-14 12:30:44',0,2,2,3);
INSERT INTO Task(Task_id,name,date_created,date_updated,deleted,responsible,Project,Status)
VALUES(5,'DAO for Task','2012-02-14 12:30:44','2012-02-14 12:30:44',0,4,2,3);
INSERT INTO Task(Task_id,name,date_created,date_updated,deleted,responsible,Project,Status)
VALUES(6,'DAO for File and Comment','2012-02-14 12:30:44','2012-02-14 12:30:44',0,1,2,3);
INSERT INTO Task(Task_id,name,date_created,date_updated,deleted,responsible,Project,Status)
VALUES(7,'Service for User','2012-02-14 12:30:44','2012-02-14 12:30:44',0,2,3,2);
INSERT INTO Task(Task_id,name,date_created,date_updated,deleted,responsible,Project,Status)
VALUES(8,'Service for File and Comment','2012-02-14 12:30:44','2012-02-14 12:30:44',0,2,3,2);
INSERT INTO Task(Task_id,name,date_created,date_updated,deleted,responsible,Project,Status)
VALUES(9,'Service for Task','2012-02-14 12:30:44','2012-02-14 12:30:44',0,2,3,2);



