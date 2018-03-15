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
-- Table structure for table `role_resource`
--

DROP TABLE IF EXISTS `role_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_resource` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `role_id` bigint(19) NOT NULL COMMENT '角色id',
  `resource_id` bigint(19) NOT NULL COMMENT '资源id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=599 DEFAULT CHARSET=utf8 COMMENT='角色资源';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_resource`
--

LOCK TABLES `role_resource` WRITE;
/*!40000 ALTER TABLE `role_resource` DISABLE KEYS */;
INSERT INTO `role_resource` VALUES (158,3,1),(159,3,11),(160,3,111),(161,3,112),(162,3,113),(163,3,114),(164,3,12),(165,3,121),(166,3,122),(167,3,123),(168,3,124),(169,3,125),(170,3,13),(171,3,131),(172,3,132),(173,3,133),(174,3,134),(175,3,14),(176,3,141),(177,3,142),(178,3,143),(179,3,144),(359,7,1),(360,7,14),(361,7,141),(362,7,142),(363,7,143),(364,7,222),(365,7,223),(366,7,224),(367,7,221),(368,7,226),(437,2,1),(438,2,13),(439,2,131),(440,2,132),(441,2,133),(442,2,222),(443,2,223),(444,2,224),(445,2,221),(446,2,227),(447,2,228),(448,8,1),(449,8,11),(450,8,111),(451,8,12),(452,8,121),(453,8,13),(454,8,131),(455,8,14),(456,8,141),(457,8,222),(458,8,223),(459,8,224),(460,8,221),(461,8,227),(462,8,228),(478,8,229),(534,1,1),(535,1,11),(536,1,111),(537,1,112),(538,1,113),(539,1,114),(540,1,12),(541,1,121),(542,1,122),(543,1,123),(544,1,124),(545,1,125),(546,1,13),(547,1,131),(548,1,132),(549,1,133),(550,1,134),(551,1,14),(552,1,141),(553,1,142),(554,1,143),(555,1,144),(556,1,222),(557,1,223),(558,1,224),(559,1,221),(560,1,227),(561,1,228),(562,1,230),(563,1,245),(564,1,246),(565,1,247),(566,1,231),(583,10,222),(584,10,223),(585,10,236),(586,10,224),(587,10,230),(588,10,245),(589,10,246),(590,10,247),(591,10,231),(592,10,233),(593,9,132),(594,9,226),(595,9,230),(596,9,245),(597,9,246),(598,9,231);
/*!40000 ALTER TABLE `role_resource` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-15 12:13:08