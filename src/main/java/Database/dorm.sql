/*
SQLyog Community v13.2.0 (64 bit)
MySQL - 10.4.32-MariaDB : Database - dormitory
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dormitory` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `dormitory`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `TenantID` int(11) NOT NULL AUTO_INCREMENT,
  `Tenant_Name` varchar(50) DEFAULT NULL,
  `Tenant_Address` varchar(100) DEFAULT NULL,
  `Tenant_ContactNo` int(50) DEFAULT NULL,
  `Contract_Period` date DEFAULT NULL,
  `RoomNo` int(50) DEFAULT NULL,
  `VisitorID` int(11) DEFAULT NULL,
  PRIMARY KEY (`TenantID`),
  KEY `VisitorID` (`VisitorID`),
  CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`VisitorID`) REFERENCES `visitor` (`VisitorID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `admin` */

LOCK TABLES `admin` WRITE;

UNLOCK TABLES;

/*Table structure for table `billing_t` */

DROP TABLE IF EXISTS `billing_t`;

CREATE TABLE `billing_t` (
  `TenantID` int(11) DEFAULT NULL,
  `BillingID` int(11) NOT NULL AUTO_INCREMENT,
  `Electric_Bill` float DEFAULT NULL,
  `Water_Bill` float DEFAULT NULL,
  `Room_Rent` float DEFAULT NULL,
  `Maintenance_Bill` float DEFAULT NULL,
  `Total_Billing` float DEFAULT NULL,
  `Payment_Stat` varchar(50) DEFAULT NULL,
  `Payment_Method` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`BillingID`),
  CONSTRAINT `billing_t_ibfk_1` FOREIGN KEY (`BillingID`) REFERENCES `admin` (`TenantID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `billing_t` */

LOCK TABLES `billing_t` WRITE;

UNLOCK TABLES;

/*Table structure for table `visitor` */

DROP TABLE IF EXISTS `visitor`;

CREATE TABLE `visitor` (
  `VisitorID` int(11) NOT NULL AUTO_INCREMENT,
  `Visitor_Name` varchar(100) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `Time_In` time DEFAULT NULL,
  `Time_Out` time DEFAULT NULL,
  `Visitor_Address` varchar(100) DEFAULT NULL,
  `Visitor_ContactNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`VisitorID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `visitor` */

LOCK TABLES `visitor` WRITE;

insert  into `visitor`(`VisitorID`,`Visitor_Name`,`Date`,`Time_In`,`Time_Out`,`Visitor_Address`,`Visitor_ContactNo`) values 
(2,'CEssa','2024-06-19',NULL,NULL,NULL,NULL),
(3,'princess','2024-06-20',NULL,NULL,NULL,NULL);

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
