SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema social_network
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `social_network` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `social_network` ;

-- -----------------------------------------------------
-- Table `social_network`.`userInfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `social_network`.`userInfo` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `birthday` DATE NOT NULL,
  `position` VARCHAR(45) NOT NULL,
  `photo` BLOB NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `social_network`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `social_network`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `status` TINYINT NOT NULL DEFAULT 0,
  `userInfo_id` INT NULL,
  PRIMARY KEY (`id`, `userInfo_id`),
  UNIQUE INDEX `login_UNIQUE` (`email` ASC),
  INDEX `fk_user_userInfo1_idx` (`userInfo_id` ASC),
  CONSTRAINT `fk_user_userInfo1`
    FOREIGN KEY (`userInfo_id`)
    REFERENCES `social_network`.`userInfo` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
