/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.19 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `sys_resource` */

DROP TABLE IF EXISTS `sys_resource`;

CREATE TABLE `sys_resource` (
  `fid` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统资源配置信息表id',
  `fparent_id` int(111) NOT NULL DEFAULT '0' COMMENT '父菜单id，一级为0',
  `fname` varchar(32) NOT NULL COMMENT '资源名称',
  `fcode` varchar(32) NOT NULL COMMENT '资源代码',
  `fpermission_code` varchar(100) DEFAULT NULL COMMENT '权限资源代码',
  `ftype` int(11) DEFAULT NULL COMMENT '类型（1模块 2按钮）',
  `ficon` varchar(32) DEFAULT NULL COMMENT '图标',
  `froute_url` varchar(32) DEFAULT NULL COMMENT '跳转url',
  `forder` varchar(32) DEFAULT NULL COMMENT '排序字段',
  `fsystem_id` int(11) DEFAULT NULL COMMENT '所属系统id',
  `fcreator` varchar(32) DEFAULT NULL,
  `fcreate_time` date DEFAULT NULL,
  `fupdator` varchar(32) DEFAULT NULL,
  `fupdate_time` date DEFAULT NULL,
  `fis_delete` tinyint(1) DEFAULT '0',
  `fext` text,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

/*Data for the table `sys_resource` */

insert  into `sys_resource`(`fid`,`fparent_id`,`fname`,`fcode`,`fpermission_code`,`ftype`,`ficon`,`froute_url`,`forder`,`fsystem_id`,`fcreator`,`fcreate_time`,`fupdator`,`fupdate_time`,`fis_delete`,`fext`) values (1,0,'系统管理','system_manage','sys',1,'el-icon-setting','/system','1',NULL,NULL,NULL,NULL,NULL,0,NULL),(2,1,'用户管理','system_user_maneage','sys:user',1,'el-icon-edit','/system/user','1',NULL,NULL,NULL,NULL,NULL,0,NULL),(3,2,'用户管理-新增','system_user_manage_add','sys:user:select,sys:user:add',2,NULL,'/system/user/add','1',NULL,NULL,NULL,NULL,NULL,0,NULL),(4,2,'用户管理-删除','system_user_manage_delete','sys:user:select,sys:user:delete',2,NULL,'/system/user/delete','2',NULL,NULL,NULL,NULL,NULL,0,NULL),(5,2,'用户管理-修改','system_user_manage_update','sys:user:select,sys:user:update',2,'el-icon-edit','/system/user/update','3',NULL,NULL,NULL,NULL,NULL,0,NULL),(6,2,'用户管理-查看','system_user_manage_select','sys:user:select',2,NULL,'/system/user/select','4',NULL,NULL,NULL,NULL,NULL,0,NULL),(7,1,'角色管理','system_role_manage','sys:role',1,'el-icon-edit','/system/role','2',NULL,NULL,NULL,NULL,NULL,0,NULL),(8,7,'角色管理-新增','system_role_add','sys:role:select,sys:role:add',2,NULL,'/system/role/add','1',NULL,NULL,NULL,NULL,NULL,0,NULL),(9,7,'角色管理-删除','system_role_delete','sys:role:select,sys:role:delete',2,NULL,'/system/role/delete','2',NULL,NULL,NULL,NULL,NULL,0,NULL),(10,7,'角色管理-修改','system_role_update','sys:role:select,sys:role:update',2,'el-icon-edit','/system/role/update','3',NULL,NULL,NULL,NULL,NULL,0,NULL),(11,7,'角色管理-查看','system_role_select','sys:role:select',2,NULL,'/system/role/update','4',NULL,NULL,NULL,NULL,NULL,0,NULL),(12,0,'文件管理','file_manage','file',1,'el-icon-document\n','/file','2',NULL,NULL,NULL,NULL,NULL,0,NULL),(13,12,'文件管理-增加','file_manage_add','file:view,file:add',2,NULL,'/file/add','1',NULL,NULL,NULL,NULL,NULL,0,NULL),(14,12,'文件管理-删除','file_manage_delete','file:view,file:delete',2,NULL,'/file/delete','2',NULL,NULL,NULL,NULL,NULL,0,NULL),(15,12,'文件管理-修改','file_manage_update','file:view,file:update',2,'el-icon-edit','/file/update','3',NULL,NULL,NULL,NULL,NULL,0,NULL),(16,12,'文件管理-查看','file_manage_view','file:view',2,NULL,'/file/view','4',NULL,NULL,NULL,NULL,NULL,0,NULL),(17,0,'test','test',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2017-08-18',NULL,NULL,0,NULL),(18,0,'test','test',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2017-08-18',NULL,NULL,0,NULL),(19,0,'test','test',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2017-08-18',NULL,NULL,0,NULL),(20,0,'test','test',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2017-08-18',NULL,NULL,0,NULL),(21,0,'test','test',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2017-08-18',NULL,NULL,0,NULL);

/*Table structure for table `sys_role` */

DROP TABLE IF EXISTS `sys_role`;

CREATE TABLE `sys_role` (
  `fid` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统角色id',
  `fname` varchar(32) DEFAULT NULL COMMENT '角色名',
  `fcode` varchar(32) DEFAULT NULL COMMENT '角色代码',
  `fupdate_time` date DEFAULT NULL,
  `fupdator` varchar(32) DEFAULT NULL,
  `fcreate_time` date DEFAULT NULL,
  `fcreator` varchar(32) DEFAULT NULL,
  `fis_delete` tinyint(1) NOT NULL DEFAULT '0',
  `fext` text,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `sys_role` */

insert  into `sys_role`(`fid`,`fname`,`fcode`,`fupdate_time`,`fupdator`,`fcreate_time`,`fcreator`,`fis_delete`,`fext`) values (1,'管理员','ROLE_ADMIN','2017-05-29',NULL,'2017-05-29',NULL,0,NULL),(2,'用户','ROLE_USER','2017-05-29',NULL,'2017-05-29',NULL,0,NULL);

/*Table structure for table `sys_role_resource` */

DROP TABLE IF EXISTS `sys_role_resource`;

CREATE TABLE `sys_role_resource` (
  `fid` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色资源关联表id',
  `frole_id` int(11) NOT NULL COMMENT '角色id',
  `fresource_id` int(11) NOT NULL COMMENT '资源id',
  `fcreator` varchar(32) DEFAULT NULL,
  `fcreate_time` date DEFAULT NULL,
  `fupdator` varchar(32) DEFAULT NULL,
  `fupdate_time` date DEFAULT NULL,
  `fis_delete` tinyint(1) DEFAULT '0',
  `fext` text,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `sys_role_resource` */

insert  into `sys_role_resource`(`fid`,`frole_id`,`fresource_id`,`fcreator`,`fcreate_time`,`fupdator`,`fupdate_time`,`fis_delete`,`fext`) values (1,1,1,NULL,NULL,NULL,NULL,0,NULL),(2,1,2,NULL,NULL,NULL,NULL,0,NULL),(3,1,3,NULL,NULL,NULL,NULL,0,NULL),(4,1,4,NULL,NULL,NULL,NULL,0,NULL),(5,1,5,NULL,NULL,NULL,NULL,0,NULL),(6,1,6,NULL,NULL,NULL,NULL,0,NULL),(7,1,7,NULL,NULL,NULL,NULL,0,NULL),(8,1,8,NULL,NULL,NULL,NULL,0,NULL),(9,1,9,NULL,NULL,NULL,NULL,0,NULL),(10,1,10,NULL,NULL,NULL,NULL,0,NULL),(11,1,11,NULL,NULL,NULL,NULL,0,NULL),(12,2,12,NULL,NULL,NULL,NULL,0,NULL);

/*Table structure for table `sys_user` */

DROP TABLE IF EXISTS `sys_user`;

CREATE TABLE `sys_user` (
  `fid` int(11) NOT NULL AUTO_INCREMENT COMMENT '系统用户id',
  `fusername` varchar(32) NOT NULL COMMENT '用户名',
  `fpassword` varchar(60) NOT NULL COMMENT '密码',
  `flastpassword_reset_date` date DEFAULT NULL COMMENT '最后一次更改密码时间',
  `fenabled` tinyint(1) DEFAULT '1' COMMENT '是否可用',
  `femail` varchar(32) DEFAULT NULL COMMENT '邮箱',
  `flastname` varchar(32) DEFAULT NULL,
  `ffirstname` varchar(32) DEFAULT NULL,
  `fcreator` varchar(32) DEFAULT NULL,
  `fcreate_time` date DEFAULT NULL,
  `fupdator` varchar(32) DEFAULT NULL,
  `fupdate_time` date DEFAULT NULL,
  `fis_delete` tinyint(1) NOT NULL DEFAULT '0',
  `fext` text,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `sys_user` */

insert  into `sys_user`(`fid`,`fusername`,`fpassword`,`flastpassword_reset_date`,`fenabled`,`femail`,`flastname`,`ffirstname`,`fcreator`,`fcreate_time`,`fupdator`,`fupdate_time`,`fis_delete`,`fext`) values (1,'admin','$2a$10$COK2IzmwCXBUHCFODRzp1eYBNS34r490ggjyn5nGMATyzUnhs.WYa',NULL,1,NULL,NULL,NULL,NULL,'2017-05-29',NULL,'2017-05-29',0,'1234'),(2,'user1','$2a$10$COK2IzmwCXBUHCFODRzp1eYBNS34r490ggjyn5nGMATyzUnhs.WYa',NULL,1,NULL,NULL,NULL,NULL,'2017-05-29',NULL,'2017-05-29',0,'2'),(3,'user2','$2a$10$COK2IzmwCXBUHCFODRzp1eYBNS34r490ggjyn5nGMATyzUnhs.WYa',NULL,1,NULL,NULL,NULL,NULL,'2017-05-29',NULL,'2017-05-29',0,'3 '),(4,'user3','$2a$10$COK2IzmwCXBUHCFODRzp1eYBNS34r490ggjyn5nGMATyzUnhs.WYa',NULL,1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,NULL);

/*Table structure for table `sys_user_role` */

DROP TABLE IF EXISTS `sys_user_role`;

CREATE TABLE `sys_user_role` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `fuser_id` int(11) DEFAULT NULL,
  `frole_id` int(11) DEFAULT NULL,
  `fupdate_time` date DEFAULT NULL,
  `fupdator` varchar(32) DEFAULT NULL,
  `fcreate_time` date DEFAULT NULL,
  `fcreator` varchar(32) DEFAULT NULL,
  `fis_delete` tinyint(1) NOT NULL DEFAULT '0',
  `fext` text,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `sys_user_role` */

insert  into `sys_user_role`(`fid`,`fuser_id`,`frole_id`,`fupdate_time`,`fupdator`,`fcreate_time`,`fcreator`,`fis_delete`,`fext`) values (1,1,1,'2017-05-29',NULL,'2017-05-29',NULL,0,NULL),(2,2,2,'2017-05-29',NULL,'2017-05-29',NULL,0,NULL),(3,3,2,'2017-05-29',NULL,'2017-05-29',NULL,0,NULL),(4,2,1,'2017-05-29',NULL,'2017-05-29',NULL,0,NULL),(5,1,2,'2017-08-19',NULL,'2017-08-19',NULL,0,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
