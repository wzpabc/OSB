CREATE DATABASE  IF NOT EXISTS `it` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `it`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 192.168.10.175    Database: it
-- ------------------------------------------------------
-- Server version	5.6.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `job_config`
--

DROP TABLE IF EXISTS `job_config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `job_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `config_code` varchar(255) DEFAULT NULL,
  `config_name` varchar(255) DEFAULT NULL,
  `freq` int(11) DEFAULT '1',
  `retry_time` int(11) DEFAULT NULL,
  `email` varchar(1024) DEFAULT NULL,
  `config_status` char(1) DEFAULT NULL,
  `ktr_name` varchar(1024) DEFAULT NULL,
  `remark` varchar(1024) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `run_status` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job_config`
--

LOCK TABLES `job_config` WRITE;
/*!40000 ALTER TABLE `job_config` DISABLE KEYS */;
INSERT INTO `job_config` VALUES (1,'1','SalesOrder_Inbound.kjb',2,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:07:01','2017-01-26 12:45:13','2'),(2,'2','SalesOrder_Outbound.kjb',1,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:07:47','2017-01-26 12:45:13','2'),(3,'3','Address_Book.kjb',5,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:08:22','2017-01-26 12:32:20','1'),(4,'4','stock_balance.kjb',1,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:09:06','2017-01-26 12:32:21','1'),(5,'5','ItemBranch_job.kjb',2,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:10:08','2017-01-26 12:32:20','1'),(6,'6','item_base_price.kjb',3,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:10:36','2017-01-26 12:32:20','1'),(7,'7','BOMSalesOfficeKIT_job.kjb',1,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:11:10','2017-01-26 12:32:23','1'),(8,'8','AddressBydatejob.kjb',32,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:11:48','2017-01-26 12:32:22','1'),(9,'9','deteleOrderDetail_in_repeat.kjb',1,0,'patrickwang@tupperware.com','1','run_for_each_row.kjb','1','2016-03-31 11:01:00','2017-01-26 12:32:22','1'),(10,'10','StockAdjust',2,0,'patrickwang@tupperware.com','1','run_for_each_row.kjb','','2016-07-18 10:43:27','2017-01-26 12:32:06','1'),(11,'1','SalesOrder_Inbound.kjb',2,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:07:01','2017-01-26 12:32:18','1'),(12,'2','SalesOrder_Outbound.kjb',1,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:07:47','2017-01-26 12:45:12','2'),(13,'3','Address_Book.kjb',5,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:08:22','2017-01-26 12:45:12','2'),(14,'4','stock_balance.kjb',1,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:09:06','2017-01-26 12:45:14','2'),(15,'5','ItemBranch_job.kjb',2,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:10:08','2017-01-26 12:32:09','1'),(16,'6','item_base_price.kjb',3,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:10:36','2017-01-26 12:32:19','1'),(17,'7','BOMSalesOfficeKIT_job.kjb',1,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:11:10','2017-01-26 12:32:19','1'),(18,'8','AddressBydatejob.kjb',32,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:11:48','2017-01-26 12:32:20','1'),(19,'9','deteleOrderDetail_in_repeat.kjb',1,0,'patrickwang@tupperware.com','1','run_for_each_row.kjb','1','2016-03-31 11:01:00','2017-01-26 12:32:10','1'),(20,'10','StockAdjust',2,0,'patrickwang@tupperware.com','1','run_for_each_row.kjb','','2016-07-18 10:43:27','2017-01-26 12:32:09','1'),(21,'1','SalesOrder_Inbound.kjb',2,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:07:01','2017-01-26 12:32:10','1'),(22,'2','SalesOrder_Outbound.kjb',1,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:07:47','2017-01-26 12:32:11','1'),(23,'3','Address_Book.kjb',5,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:08:22','2017-01-26 12:32:10','1'),(24,'4','stock_balance.kjb',1,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:09:06','2017-01-26 12:32:21','1'),(25,'5','ItemBranch_job.kjb',2,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:10:08','2017-01-26 12:32:12','1'),(26,'6','item_base_price.kjb',3,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:10:36','2017-01-26 12:32:23','1'),(27,'7','BOMSalesOfficeKIT_job.kjb',1,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:11:10','2017-01-26 12:32:12','1'),(28,'8','AddressBydatejob.kjb',32,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:11:48','2017-01-26 12:32:09','1'),(29,'9','deteleOrderDetail_in_repeat.kjb',1,0,'patrickwang@tupperware.com','1','run_for_each_row.kjb','1','2016-03-31 11:01:00','2017-01-26 12:32:11','1'),(30,'10','StockAdjust',2,0,'patrickwang@tupperware.com','1','run_for_each_row.kjb','','2016-07-18 10:43:27','2017-01-26 12:32:14','1'),(31,'1','SalesOrder_Inbound.kjb',2,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:07:01','2017-01-26 12:32:13','1'),(32,'2','SalesOrder_Outbound.kjb',1,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:07:47','2017-01-26 12:32:10','1'),(33,'3','Address_Book.kjb',5,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:08:22','2017-01-26 12:32:12','1'),(34,'4','stock_balance.kjb',1,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:09:06','2017-01-26 12:32:15','1'),(35,'5','ItemBranch_job.kjb',2,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:10:08','2017-01-26 12:32:12','1'),(36,'6','item_base_price.kjb',3,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:10:36','2017-01-26 12:32:15','1'),(37,'7','BOMSalesOfficeKIT_job.kjb',1,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:11:10','2017-01-26 12:32:14','1'),(38,'8','AddressBydatejob.kjb',32,0,'patrickwang@tupperware.com','1','master.kjb','','2015-12-09 16:11:48','2017-01-26 12:32:16','1'),(39,'9','deteleOrderDetail_in_repeat.kjb',1,0,'patrickwang@tupperware.com','1','run_for_each_row.kjb','1','2016-03-31 11:01:00','2017-01-26 12:32:15','1'),(40,'10','StockAdjust',2,0,'patrickwang@tupperware.com','1','run_for_each_row.kjb','','2016-07-18 10:43:27','2017-01-26 12:32:18','1');
/*!40000 ALTER TABLE `job_config` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-15 12:13:54
