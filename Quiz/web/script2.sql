-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema aerolinea
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema aerolinea
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `aerolinea` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `aerolinea` ;

-- -----------------------------------------------------
-- Table `aerolinea`.`Aerolinea`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `aerolinea`.`Aerolinea` ;

CREATE TABLE IF NOT EXISTS `aerolinea`.`Aerolinea` (
  `nombre` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`nombre`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `aerolinea`.`Vuelo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `aerolinea`.`Vuelo` ;

CREATE TABLE IF NOT EXISTS `aerolinea`.`Vuelo` (
  `codigo` VARCHAR(45) NOT NULL COMMENT '',
  `fecha` DATETIME NULL COMMENT '',
  `capacidad` INT NULL COMMENT '',
  `disponiblesPromo` INT NULL COMMENT '',
  `disponiblesEcono` INT NULL COMMENT '',
  `disponiblesFlexi` INT NULL COMMENT '',
  `Aerolinea_nombre` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`codigo`)  COMMENT '',
  INDEX `fk_Vuelo_Aerolinea_idx` (`Aerolinea_nombre` ASC)  COMMENT '',
  CONSTRAINT `fk_Vuelo_Aerolinea`
    FOREIGN KEY (`Aerolinea_nombre`)
    REFERENCES `aerolinea`.`Aerolinea` (`nombre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
