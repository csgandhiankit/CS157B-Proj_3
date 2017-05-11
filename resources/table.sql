CREATE TABLE `salesdata`.`data`(
	`Date` DATE NOT NULL,
	`ProductName` VARCHAR(45) NOT NULL,
	`Quantity` INT NOT NULL,
	`UnitCost` DOUBLE NOT NULL,
	`TotalCost` DOUBLE NOT NULL,
	PRIMARY KEY('Date')
);