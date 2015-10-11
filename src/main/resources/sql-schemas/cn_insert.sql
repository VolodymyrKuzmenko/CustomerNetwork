DELETE FROM social_network.userinfo where info_id > 0;
DELETE FROM social_network.user where user_id > 0;

/* ----------------------------  INSERTING DATA TO INTO USER  ---------------------------- */
INSERT INTO `social_network`.`user`
(`user_id`,`email`, `password`,`status`) VALUES (1,"admin@mail.com","qwerty","1");

INSERT INTO `social_network`.`user`
(`user_id`,`email`, `password`,`status`) VALUES (2,"adminko@mail.com","1234556","2");

INSERT INTO `social_network`.`user`
(`user_id`,`email`, `password`,`status`) VALUES (3,"lily@mail.com","lily94","3");

INSERT INTO `social_network`.`user`
(`user_id`,`email`, `password`,`status`) VALUES (4,"kuzmenklo@gmail.com","kuzmenko95","4");

/* ---------------------------- INSERTING USER INFO -------------------------------------  */
INSERT INTO `social_network`.`userinfo`
(`info_id`,`name`,`surname`,`birthday`,`position`,`photo`,`user_id`)
VALUES
(1, "Adminko","Adminkovich",'2015-12-13',"Slave","link to photo",1);

INSERT INTO `social_network`.`userinfo`
(`name`,`surname`,`birthday`,`position`,`photo`,`user_id`)
VALUES
("Admin","Adminovoch",'2015-10-13',"Slave","link to photo",2);

INSERT INTO `social_network`.`userinfo`
(`name`,`surname`,`birthday`,`position`,`photo`,`user_id`)
VALUES
("Lilya","Lyubarskaya",'2015-09-13',"Java DEveloper","link to photo",3);

INSERT INTO `social_network`.`userinfo`
(`name`,`surname`,`birthday`,`position`,`photo`,`user_id`)
VALUES
("Vollodymyr","Kuzmenko",'2015-05-08',"Java Developer","link to photo",4);


