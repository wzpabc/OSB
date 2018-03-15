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
-- Table structure for table `mailtemp`
--

DROP TABLE IF EXISTS `mailtemp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mailtemp` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subject` varchar(273) DEFAULT NULL,
  `content` varchar(10) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  `emailTo` varchar(255) DEFAULT NULL,
  `emailCC` varchar(255) DEFAULT NULL,
  `emailBC` varchar(255) DEFAULT NULL,
  `attPath` varchar(100) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `execDate` datetime DEFAULT NULL,
  `lastexecDate` datetime DEFAULT NULL,
  `retrytimes` int(11) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `updateTime` datetime DEFAULT NULL,
  `deleteFlag` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mailtemp`
--

LOCK TABLES `mailtemp` WRITE;
/*!40000 ALTER TABLE `mailtemp` DISABLE KEYS */;
INSERT INTO `mailtemp` VALUES (1,'test1','','mail001','patrickwang@tupperware.com','patrickwang@tupperware.com;121354381@qq.com','patrickwang@tupperware.com','123.txt',3,'2017-05-27 00:00:00','2017-05-27 00:00:00',0,'2017-05-27 00:00:00','2017-05-27 00:00:00',0),(2,'test1','','mail001','patrickwang@tupperware.com','patrickwang@tupperware.com;121354381@qq.com','patrickwang@tupperware.com','123.txt',3,'2017-05-27 00:00:00','2017-05-27 00:00:00',0,'2017-05-27 00:00:00','2017-05-27 00:00:00',0),(3,'test1','','mail001','patrickwang@tupperware.com','patrickwang@tupperware.com;121354381@qq.com','patrickwang@tupperware.com','123.txt',3,'2017-05-27 00:00:00','2017-05-27 00:00:00',0,'2017-05-27 00:00:00','2017-05-27 00:00:00',0),(4,'test1','','mail001','patrickwang@tupperware.com','patrickwang@tupperware.com;121354381@qq.com','patrickwang@tupperware.com','123.txt',3,'2017-05-27 00:00:00','2017-05-27 00:00:00',0,'2017-05-27 00:00:00','2017-05-27 00:00:00',0),(5,'test1','','mail001','patrickwang@tupperware.com','patrickwang@tupperware.com;121354381@qq.com','patrickwang@tupperware.com','123.txt',3,'2017-05-27 00:00:00','2017-05-27 00:00:00',0,'2017-05-27 00:00:00','2017-05-27 00:00:00',0),(6,'test1','','mail001','patrickwang@tupperware.com','patrickwang@tupperware.com;121354381@qq.com','patrickwang@tupperware.com','123.txt',3,'2017-05-27 00:00:00','2017-05-27 00:00:00',0,'2017-05-27 00:00:00','2017-05-27 00:00:00',0),(7,'test1','','mail001','patrickwang@tupperware.com','patrickwang@tupperware.com;121354381@qq.com','patrickwang@tupperware.com','123.txt',3,'2017-05-27 00:00:00','2017-05-27 00:00:00',0,'2017-05-27 00:00:00','2017-05-27 00:00:00',0),(8,'test1','','mail001','patrickwang@tupperware.com','patrickwang@tupperware.com;121354381@qq.com','patrickwang@tupperware.com','123.txt',3,'2017-05-27 00:00:00','2017-05-27 00:00:00',0,'2017-05-27 00:00:00','2017-05-27 00:00:00',0),(9,'test1','','mail001','patrickwang@tupperware.com','patrickwang@tupperware.com;121354381@qq.com','patrickwang@tupperware.com','123.txt',3,'2017-05-27 00:00:00','2017-05-27 00:00:00',0,'2017-05-27 00:00:00','2017-05-27 00:00:00',0),(10,'test1','','mail001','patrickwang@tupperware.com','patrickwang@tupperware.com;121354381@qq.com','patrickwang@tupperware.com','123.txt',3,'2017-05-27 00:00:00','2017-05-27 00:00:00',0,'2017-05-27 00:00:00','2017-05-27 00:00:00',0),(11,'test1','','mail001','patrickwang@tupperware.com','patrickwang@tupperware.com;121354381@qq.com','patrickwang@tupperware.com','123.txt',3,'2017-05-27 00:00:00','2017-05-27 00:00:00',0,'2017-05-27 00:00:00','2017-05-27 00:00:00',0);
/*!40000 ALTER TABLE `mailtemp` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-15 12:12:25
