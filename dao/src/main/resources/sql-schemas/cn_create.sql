
/* Schema social_network */
/* last edited by Vova 10/11/2015 */
drop table if exists  social_network.userInfo  ;
drop table if exists social_network.user;

CREATE TABLE IF NOT EXISTS social_network.user (
  user_id INT NOT NULL AUTO_INCREMENT,
  email VARCHAR(45),
  password VARCHAR(45),
  status TINYINT DEFAULT 0,
  PRIMARY KEY (user_id)
)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS social_network.userInfo (
  info_id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(45),
  surname VARCHAR(45),
  birthday DATE,
  position VARCHAR(45),
  photo VARCHAR(2083),
  user_id int,
  PRIMARY KEY (info_id),
  FOREIGN  KEY (user_id) REFERENCES social_network.user(user_id)
  )
ENGINE = InnoDB;





