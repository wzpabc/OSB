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
-- Table structure for table `resource`
--

DROP TABLE IF EXISTS `resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resource` (
  `id` bigint(19) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(64) NOT NULL COMMENT '资源名称',
  `url` varchar(100) DEFAULT NULL COMMENT '资源路径',
  `open_mode` varchar(32) DEFAULT NULL COMMENT '打开方式 ajax,iframe',
  `description` varchar(255) DEFAULT NULL COMMENT '资源介绍',
  `icon` varchar(32) DEFAULT NULL COMMENT '资源图标',
  `pid` bigint(19) DEFAULT NULL COMMENT '父级资源id',
  `seq` tinyint(2) NOT NULL DEFAULT '0' COMMENT '排序',
  `status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '状态',
  `resource_type` tinyint(2) NOT NULL DEFAULT '0' COMMENT '资源类别',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=252 DEFAULT CHARSET=utf8 COMMENT='资源';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resource`
--

LOCK TABLES `resource` WRITE;
/*!40000 ALTER TABLE `resource` DISABLE KEYS */;
INSERT INTO `resource` VALUES (1,'权限管理','','ajax','系统管理','fi-folder',NULL,0,0,0,'2014-02-19 01:00:00'),(11,'资源管理','/resource/manager','ajax','资源管理','fi-database',1,1,0,0,'2014-02-19 01:00:00'),(12,'角色管理','/role/manager','ajax','角色管理','fi-torso-business',1,2,0,0,'2014-02-19 01:00:00'),(13,'用户管理','/user/manager','ajax','用户管理','fi-torsos-all',1,3,0,0,'2014-02-19 01:00:00'),(14,'部门管理','/organization/manager','ajax','部门管理','fi-results-demographics',1,4,0,0,'2014-02-19 01:00:00'),(111,'列表','/resource/treeGrid','ajax','资源列表','fi-list',11,0,0,1,'2014-02-19 01:00:00'),(112,'添加','/resource/add','ajax','资源添加','fi-page-add',11,0,0,1,'2014-02-19 01:00:00'),(113,'编辑','/resource/edit','ajax','资源编辑','fi-page-edit',11,0,0,1,'2014-02-19 01:00:00'),(114,'删除','/resource/delete','ajax','资源删除','fi-page-delete',11,0,0,1,'2014-02-19 01:00:00'),(121,'列表','/role/dataGrid','ajax','角色列表','fi-list',12,0,0,1,'2014-02-19 01:00:00'),(122,'添加','/role/add','ajax','角色添加','fi-page-add',12,0,0,1,'2014-02-19 01:00:00'),(123,'编辑','/role/edit','ajax','角色编辑','fi-page-edit',12,0,0,1,'2014-02-19 01:00:00'),(124,'删除','/role/delete','ajax','角色删除','fi-page-delete',12,0,0,1,'2014-02-19 01:00:00'),(125,'授权','/role/grant','ajax','角色授权','fi-check',12,0,0,1,'2014-02-19 01:00:00'),(131,'列表','/user/dataGrid','ajax','用户列表','fi-list',13,0,0,1,'2014-02-19 01:00:00'),(132,'添加','/user/add','ajax','用户添加','fi-page-add',13,0,0,1,'2014-02-19 01:00:00'),(133,'编辑','/user/edit','ajax','用户编辑','fi-page-edit',13,0,0,1,'2014-02-19 01:00:00'),(134,'删除','/user/delete','ajax','用户删除','fi-page-delete',13,0,0,1,'2014-02-19 01:00:00'),(141,'列表','/organization/treeGrid','ajax','用户列表','fi-list',14,0,0,1,'2014-02-19 01:00:00'),(142,'添加','/organization/add','ajax','部门添加','fi-page-add',14,0,0,1,'2014-02-19 01:00:00'),(143,'编辑','/organization/edit','ajax','部门编辑','fi-page-edit',14,0,0,1,'2014-02-19 01:00:00'),(144,'删除','/organization/delete','ajax','部门删除','fi-page-delete',14,0,0,1,'2014-02-19 01:00:00'),(221,'日志监控','','ajax','日志监控','fi-folder',NULL,2,0,0,'2015-12-01 11:44:20'),(222,'日常运维','','ajax','日常运维','fi-folder',NULL,1,0,0,'2015-12-06 12:40:42'),(223,'特百惠','/m_tup','ajax','特百惠','fi-home',222,0,0,0,'2015-12-06 12:42:42'),(224,'财务报表','/report/manager','ajax','财务报表','fi-yen',222,1,0,0,'2015-12-06 12:45:28'),(226,'修改密码','/user/editPwdPage','ajax','修改密码','fi-unlock',NULL,3,0,1,'2015-12-07 20:23:06'),(227,'登录日志','/sysLog/manager','ajax','登录日志','fi-info',221,0,0,0,'2016-09-30 22:10:53'),(228,'Druid监控','/druid','iframe','Druid监控','fi-monitor',221,0,0,0,'2016-09-30 22:12:50'),(229,'系统图标','/icons.html','ajax','系统图标','fi-photo',221,0,0,0,'2016-12-24 15:53:47'),(230,'系统接口','','ajax','系统接口','fi-folder',NULL,3,0,0,'2017-01-18 11:55:13'),(231,'订单同步','/order','ajax','订单同步','fi-refresh',230,4,0,0,'2017-01-18 11:57:07'),(233,'作业管理','/jobconfig/manage','ajax','作业管理','fi-wrench',230,10,0,0,'2017-01-18 12:07:32'),(234,'状态监控','/job/monitor','ajax','状态监控','fi-laptop',230,20,0,0,'2017-01-18 15:22:32'),(236,'邮件服务','/jobEmail/manager','ajax','邮件服务','fi-mail',222,0,0,0,'2017-01-18 15:58:41'),(237,'开发测试','',NULL,NULL,'fi-folder',NULL,0,0,0,'2017-01-23 20:16:45'),(238,'报表映射','/reportmapping/manager',NULL,NULL,'fi-refresh',237,0,0,0,'2017-01-23 20:17:47'),(239,'报表分类','/reportcls/manager',NULL,NULL,'fi-refresh',237,0,0,0,'2017-01-23 20:18:42'),(240,'fms用户','/fmsuser/manager',NULL,NULL,'fi-refresh',237,0,0,0,'2017-01-23 20:19:16'),(241,'Tableau','/tableauuser/manager',NULL,NULL,'fi-refresh',237,0,0,0,'2017-01-23 20:20:07'),(242,'用户映射','/usermapping/manager',NULL,NULL,'fi-refresh',237,0,0,0,'2017-01-23 20:21:30'),(243,'库存盘点','/outletstock/manager',NULL,NULL,'fi-refresh',237,0,0,0,'2017-02-04 14:18:32'),(244,'信息填报','/outletstock/stockcacl',NULL,NULL,'fi-star',237,0,0,0,'2017-02-04 14:58:26'),(245,'查询','/ordersync/search','ajax',NULL,'fi-magnifying-glass',230,1,0,1,'2017-02-07 14:37:59'),(246,'同步选定订单','/ordersync/update','ajax',NULL,'fi-link',230,2,0,1,'2017-02-07 14:46:43'),(247,'同步所有订单','/ordersync/updateAll','ajax',NULL,'fi-fast-forward',230,3,0,1,'2017-02-07 14:47:57'),(248,'定时邮件','/maillist/manager',NULL,NULL,'fi-mail',222,0,0,0,'2017-05-27 10:34:08'),(249,'邮件缓冲','/mailtemp/manager',NULL,NULL,'fi-mail',222,0,0,0,'2017-05-27 10:44:35'),(250,'test','/reportsByTime/manager',NULL,NULL,'fi-refresh',237,0,0,0,'2018-03-13 16:13:40'),(251,'informationSchemaTables','/informationSchemaTables/manager',NULL,NULL,'fi-refresh',237,0,0,0,'2018-03-13 17:21:36');
/*!40000 ALTER TABLE `resource` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-15 12:13:44
