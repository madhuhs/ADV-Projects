CREATE TABLE `ems`.`emp` (
                             `empno` INT NOT NULL AUTO_INCREMENT,
                             `ename` VARCHAR(45) NOT NULL,
                             `job` VARCHAR(45) NOT NULL,
                             `mgr` INT NULL,
                             `hiredate` DATETIME NOT NULL,
                             `sal` INT NOT NULL,
                             `comm` INT NULL,
                             `deptno` INT NULL,
                             PRIMARY KEY (`empno`),
                             UNIQUE INDEX `empno_UNIQUE` (`empno` ASC) VISIBLE);