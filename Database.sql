/*
SQLyog Ultimate v8.82 
MySQL - 5.1.45-community : Database - pharmacy
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`pharmacy` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `pharmacy`;

/*Table structure for table `emp_mstr` */

DROP TABLE IF EXISTS `emp_mstr`;

CREATE TABLE `emp_mstr` (
  `ecode` varchar(30) NOT NULL,
  `ename` varchar(30) DEFAULT NULL,
  `edob` varchar(20) DEFAULT NULL,
  `egen` varchar(30) DEFAULT NULL,
  `equal` varchar(30) DEFAULT NULL,
  `eaddr` varchar(150) DEFAULT NULL,
  `econt` decimal(10,0) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `id_name` varchar(30) DEFAULT NULL,
  `id_number` decimal(12,0) DEFAULT NULL,
  `user` varchar(20) DEFAULT NULL,
  `doj` varchar(20) DEFAULT NULL,
  `dol` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ecode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `emp_mstr` */

insert  into `emp_mstr`(`ecode`,`ename`,`edob`,`egen`,`equal`,`eaddr`,`econt`,`email`,`id_name`,`id_number`,`user`,`doj`,`dol`) values ('123','soni','2003','Female','bca','lko','1234567','vikram@123','aaa','12345678876','vikram','2024-03-17','2024-03-17'),('125','ravi','2002','Male','btech','lko','12345678','ravi@123','aadhar','12345678','ravi','2024-03-17',NULL);

/*Table structure for table `invoice_mstr` */

DROP TABLE IF EXISTS `invoice_mstr`;

CREATE TABLE `invoice_mstr` (
  `invc_no` int(10) NOT NULL,
  `cust_name` varchar(30) DEFAULT NULL,
  `cust_number` varchar(15) DEFAULT NULL,
  `pay_amt` varchar(40) DEFAULT NULL,
  `invc_date` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`invc_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `invoice_mstr` */

insert  into `invoice_mstr`(`invc_no`,`cust_name`,`cust_number`,`pay_amt`,`invc_date`) values (1,'sujeet','8809609198','2175','Wed Apr 03 02:55:35 IST 2024'),(2,'vikram','6200967872','1175','Mon Apr 15 02:27:50 IST 2024'),(3,'vikash','7250694561','1100','Mon Apr 15 02:30:16 IST 2024'),(4,'Dheeraj','8877871648','1500','Fri Apr 19 07:27:12 IST 2024');

/*Table structure for table `invoice_tras` */

DROP TABLE IF EXISTS `invoice_tras`;

CREATE TABLE `invoice_tras` (
  `invc` varchar(30) DEFAULT NULL,
  `med_name` varchar(30) DEFAULT NULL,
  `mfd_date` varchar(30) DEFAULT NULL,
  `exp_date` varchar(30) DEFAULT NULL,
  `qty` varchar(30) DEFAULT NULL,
  `price` varchar(40) DEFAULT NULL,
  `dsc` varchar(40) DEFAULT NULL,
  `pay_amt` varchar(40) DEFAULT NULL,
  `date` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `invoice_tras` */

insert  into `invoice_tras`(`invc`,`med_name`,`mfd_date`,`exp_date`,`qty`,`price`,`dsc`,`pay_amt`,`date`) values ('1','sujeet','2002','2024','2','200',NULL,'400','2024-04-03'),('2','paracitamol','2002','2026','2','125',NULL,'250','2024-04-05'),('4','Dolo','2020','2025','10','100',NULL,'1000','2024-04-19'),('6','Droops','2023','2026','10','80',NULL,'800','2024-04-19');

/*Table structure for table `login` */

DROP TABLE IF EXISTS `login`;

CREATE TABLE `login` (
  `user_id` varchar(30) NOT NULL,
  `password` varchar(30) DEFAULT NULL,
  `utype` varchar(30) DEFAULT NULL,
  `ac_status` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `login` */

insert  into `login`(`user_id`,`password`,`utype`,`ac_status`) values ('admin','admin','Admin','1'),('dheeraj','4321','Employee','1'),('ravi','1234','Employee','1');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `med_name` varchar(30) NOT NULL,
  `med_formula` varchar(30) DEFAULT NULL,
  `med_company` varchar(30) DEFAULT NULL,
  `comp_add` varchar(50) DEFAULT NULL,
  `comp_contact` decimal(10,0) DEFAULT NULL,
  `vend_name` varchar(30) DEFAULT NULL,
  `vend_contact` decimal(10,0) DEFAULT NULL,
  `med_use` varchar(30) DEFAULT NULL,
  `reg_date` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`med_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `product` */

insert  into `product`(`med_name`,`med_formula`,`med_company`,`comp_add`,`comp_contact`,`vend_name`,`vend_contact`,`med_use`,`reg_date`) values ('calpal','paracitamol','micro','lko','2323232323','vikas','3434343434','fever pain','2024-04-18'),('Dolo','aaa','Analyze','lko2','8809609198','sujeet','8809609198','fiver','2024-04-18'),('Droops','abc','hcl','lko','6200967872','vikram','8809607172','all','2024-04-19'),('paracitamol','aaa','analyze','lko','8809609198','sujeet','9908797587','migran','2024-03-18'),('sujeet','abc','tcs','kan','12345678','skdas','2345678','fiv','2024-03-18');

/*Table structure for table `stock` */

DROP TABLE IF EXISTS `stock`;

CREATE TABLE `stock` (
  `med_name` varchar(30) NOT NULL,
  `med_formula` varchar(30) DEFAULT NULL,
  `Comp_name` varchar(30) DEFAULT NULL,
  `mfd_date` varchar(30) DEFAULT NULL,
  `exp_date` varchar(30) DEFAULT NULL,
  `price` varchar(30) DEFAULT NULL,
  `dsc` varchar(20) DEFAULT NULL,
  `qult` varchar(30) DEFAULT NULL,
  `reorder` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`med_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stock` */

insert  into `stock`(`med_name`,`med_formula`,`Comp_name`,`mfd_date`,`exp_date`,`price`,`dsc`,`qult`,`reorder`) values ('Dolo','aaa','Analyze','2020','2025','100','10','55','60'),('Droops','abc','hcl','2023','2026','80','10','45','10'),('paracitamol','aaa','analyze','2002','2026','125','10','15','210'),('sujeet','abc','tcs','2002','2024','200','10','9','504');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
