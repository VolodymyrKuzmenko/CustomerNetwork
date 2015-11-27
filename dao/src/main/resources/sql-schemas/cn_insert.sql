delete from userrole where role_id>0;
SET foreign_key_checks = 0;
delete from sessionhistory where idSessionHistory > 0;
delete from user where user_id >0;
delete from task where task_id>0;
delete from project where project_id >0;
delete from status where status_id>0;

DELETE FROM `social_network`.`userinfo` WHERE user_id>0;

INSERT INTO `social_network`.`userrole` (`role_id`,`role_name`)VALUES(1,'user');
INSERT INTO `social_network`.`userrole` (`role_id`,`role_name`)VALUES(2,'admin');
INSERT INTO `social_network`.`userrole` (`role_id`,`role_name`)VALUES(3,'superadmin');
INSERT INTO `social_network`.`userrole` (`role_id`,`role_name`)VALUES(4,'manager');

INSERT INTO `social_network`.`user` (`user_id`,`email`,`password`,`role`,`manager`)VALUES(1,"admin@gmail.com","admin",2,0);
INSERT INTO `social_network`.`user` (`user_id`,`email`,`password`,`role`,`manager`)VALUES(2,"user@gmail.com","user",1,0);
INSERT INTO `social_network`.`user` (`user_id`,`email`,`password`,`role`,`manager`)VALUES(3,"vasia@gmail.com","vasia44",1,0);
INSERT INTO `social_network`.`user` (`user_id`,`email`,`password`,`role`,`manager`)VALUES(4,"ivan@gmail.com","ivan34",1,0);

INSERT INTO `social_network`.`userinfo`(`info_id`,`name`,`surname`,`birthday`,`photo`,`user_id`)VALUES(1,"Admin","Adminkovich",'1996-09-08',234234234234,1);
INSERT INTO `social_network`.`userinfo`(`info_id`,`name`,`surname`,`birthday`,`photo`,`user_id`)VALUES(2,"Vova","Kuzmenko",'1995-05-08',234234234234,2);
INSERT INTO `social_network`.`userinfo`(`info_id`,`name`,`surname`,`birthday`,`photo`,`user_id`)VALUES(3,"Vasia","Pupkin",'1996-09-08',234234234234,3);
INSERT INTO `social_network`.`userinfo`(`info_id`,`name`,`surname`,`birthday`,`photo`,`user_id`)VALUES(4,"Ivan","Ivanovich",'1991-01-08',234234234234,4);

INSERT INTO `social_network`.`status`(`status_id`,`statusName`,`type`)VALUES(1,"Todo","task");
INSERT INTO `social_network`.`status`(`status_id`,`statusName`,`type`)VALUES(2,"In Progress","task");
INSERT INTO `social_network`.`status`(`status_id`,`statusName`,`type`)VALUES(3,"Done","task");
INSERT INTO `social_network`.`status`(`status_id`,`statusName`,`type`)VALUES(4,"Testing","task");
INSERT INTO `social_network`.`status`(`status_id`,`statusName`,`type`)VALUES(5,"Review","task");


INSERT INTO `social_network`.`status`(`status_id`,`statusName`,`type`)VALUES(6,"Todo","project");
INSERT INTO `social_network`.`status`(`status_id`,`statusName`,`type`)VALUES(7,"In Progress","project");
INSERT INTO `social_network`.`status`(`status_id`,`statusName`,`type`)VALUES(8,"Done","project");
INSERT INTO `social_network`.`status`(`status_id`,`statusName`,`type`)VALUES(9,"Testing","project");
INSERT INTO `social_network`.`status`(`status_id`,`statusName`,`type`)VALUES(10,"Production","project");
INSERT INTO `social_network`.`status`(`status_id`,`statusName`,`type`)VALUES(11,"Integration","project");

INSERT INTO `social_network`.`project`(`project_id`,`name`,`status`,`parrent_project`,`description`,`date_created`,`date_updated`,`responsible`)
VALUES(1,"customer network",7,0,"creating customer network with crm and issue traking",'2015-10-11','2015-11-11',1);
INSERT INTO `social_network`.`project`(`project_id`,`name`,`status`,`parrent_project`,`description`,`date_created`,`date_updated`,`responsible`)
VALUES(2,"customer network - dao",7,1,"creating dao",'2015-10-11','2015-11-11',2);
INSERT INTO `social_network`.`project`(`project_id`,`name`,`status`,`parrent_project`,`description`,`date_created`,`date_updated`,`responsible`)
VALUES(3,"customer network - service",7,1,"creating service",'2015-10-11','2015-11-11',3);
INSERT INTO `social_network`.`project`(`project_id`,`name`,`status`,`parrent_project`,`description`,`date_created`,`date_updated`,`responsible`)
VALUES(4,"customer network - database",8,1,"modify database",'2015-10-11','2015-11-11',4);

INSERT INTO `social_network`.`task`(`task_id`,`name`,`date_created`,`date_updated`,`deleted`,`responsible`,`project`,`status`)
VALUES(1,"Table for user",'2015-10-20','2015-10-21',0,2,4,2);
INSERT INTO `social_network`.`task`(`task_id`,`name`,`date_created`,`date_updated`,`deleted`,`responsible`,`project`,`status`)
VALUES(2,"Table for task",'2015-10-20','2015-10-21',0,3,4,2);
INSERT INTO `social_network`.`task`(`task_id`,`name`,`date_created`,`date_updated`,`deleted`,`responsible`,`project`,`status`)
VALUES(3,"Table for file and coment",'2015-10-20','2015-10-21',0,1,4,2);
INSERT INTO `social_network`.`task`(`task_id`,`name`,`date_created`,`date_updated`,`deleted`,`responsible`,`project`,`status`)
VALUES(4,"DAO for user",'2015-10-20','2015-10-21',0,2,2,3);
INSERT INTO `social_network`.`task`(`task_id`,`name`,`date_created`,`date_updated`,`deleted`,`responsible`,`project`,`status`)
VALUES(5,"DAO for task",'2015-10-20','2015-10-21',0,4,2,3);
INSERT INTO `social_network`.`task`(`task_id`,`name`,`date_created`,`date_updated`,`deleted`,`responsible`,`project`,`status`)
VALUES(6,"DAO for file and comment",'2015-10-20','2015-10-21',0,1,2,3);
INSERT INTO `social_network`.`task`(`task_id`,`name`,`date_created`,`date_updated`,`deleted`,`responsible`,`project`,`status`)
VALUES(7,"Service for user",'2015-10-20','2015-10-21',0,2,3,2);
INSERT INTO `social_network`.`task`(`task_id`,`name`,`date_created`,`date_updated`,`deleted`,`responsible`,`project`,`status`)
VALUES(8,"Service for file and comment",'2015-10-20','2015-10-21',0,2,3,2);
INSERT INTO `social_network`.`task`(`task_id`,`name`,`date_created`,`date_updated`,`deleted`,`responsible`,`project`,`status`)
VALUES(9,"Service for task",'2015-10-20','2015-10-21',0,2,3,2);



