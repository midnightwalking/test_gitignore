/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2018-10-31 22:59:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for organization
-- ----------------------------
DROP TABLE IF EXISTS `organization`;
CREATE TABLE `organization` (
  `org_code` int(11) NOT NULL,
  `name` varchar(255) default NULL COMMENT '单位名称',
  `province` varchar(255) default NULL COMMENT '单位所在省份或者直辖市',
  PRIMARY KEY  (`org_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of organization
-- ----------------------------
INSERT INTO `organization` VALUES ('1', '供电局', '海南');
INSERT INTO `organization` VALUES ('2', '深圳大学', '深圳');
INSERT INTO `organization` VALUES ('3', '保税局', '广州');
INSERT INTO `organization` VALUES ('4', '警察局', '北京');

-- ----------------------------
-- Table structure for people
-- ----------------------------
DROP TABLE IF EXISTS `people`;
CREATE TABLE `people` (
  `tellphone` varchar(255) default NULL,
  `name` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of people
-- ----------------------------
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234560', '0');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234561', '1');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234562', '2');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234563', '3');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234564', '4');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234565', '5');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234566', '6');
INSERT INTO `people` VALUES ('1311234567', '7');
INSERT INTO `people` VALUES ('1311234567', '7');
INSERT INTO `people` VALUES ('1311234567', '7');
INSERT INTO `people` VALUES ('1311234567', '7');
INSERT INTO `people` VALUES ('1311234567', '7');
INSERT INTO `people` VALUES ('1311234567', '7');
INSERT INTO `people` VALUES ('1311234567', '7');
INSERT INTO `people` VALUES ('1311234567', '7');
INSERT INTO `people` VALUES ('1311234567', '7');
INSERT INTO `people` VALUES ('1311234567', '7');
INSERT INTO `people` VALUES ('1311234567', '7');
INSERT INTO `people` VALUES ('1311234567', '7');
INSERT INTO `people` VALUES ('1311234567', '7');
INSERT INTO `people` VALUES ('1311234568', '8');
INSERT INTO `people` VALUES ('1311234568', '8');
INSERT INTO `people` VALUES ('1311234568', '8');
INSERT INTO `people` VALUES ('1311234568', '8');
INSERT INTO `people` VALUES ('1311234568', '8');
INSERT INTO `people` VALUES ('1311234568', '8');
INSERT INTO `people` VALUES ('1311234568', '8');
INSERT INTO `people` VALUES ('1311234568', '8');
INSERT INTO `people` VALUES ('1311234568', '8');
INSERT INTO `people` VALUES ('1311234568', '8');
INSERT INTO `people` VALUES ('1311234568', '8');
INSERT INTO `people` VALUES ('1311234568', '8');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `pcode` int(11) NOT NULL,
  `name` varchar(255) default NULL,
  `gender` varchar(255) default NULL,
  `age` int(11) default NULL,
  `org_code` int(11) default NULL,
  `email` varchar(255) default NULL,
  PRIMARY KEY  (`pcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '张三', '男', '30', '4', 'zhangshan@szdx.edu.cn');
INSERT INTO `person` VALUES ('2', '李四', '男', '40', '2', '李四@szu.edu.cn');
INSERT INTO `person` VALUES ('3', '王五', '男', '40', '2', 'wangwu@szu.edu.cn');
INSERT INTO `person` VALUES ('4', '猪猪', '男', '25', '4', 'zhuzhu@hkdx.edu.cn');
INSERT INTO `person` VALUES ('5', '刚刚', '男', '45', '4', 'gg@szdx.edu.cn');

-- ----------------------------
-- Table structure for roles_permissions
-- ----------------------------
DROP TABLE IF EXISTS `roles_permissions`;
CREATE TABLE `roles_permissions` (
  `id` varchar(8) NOT NULL,
  `role_name` varchar(32) NOT NULL,
  `permission` varchar(32) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of roles_permissions
-- ----------------------------
INSERT INTO `roles_permissions` VALUES ('1', 'admin', 'user:delete');
INSERT INTO `roles_permissions` VALUES ('2', 'admin', 'user:update');

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `id` varchar(8) NOT NULL,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_user
-- ----------------------------
INSERT INTO `test_user` VALUES ('1', 'xiaozhi', '654321');

-- ----------------------------
-- Table structure for usergroup
-- ----------------------------
DROP TABLE IF EXISTS `usergroup`;
CREATE TABLE `usergroup` (
  `pcode` int(11) NOT NULL,
  `group_no` varchar(10) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usergroup
-- ----------------------------
INSERT INTO `usergroup` VALUES ('1', '10');
INSERT INTO `usergroup` VALUES ('2', '10');
INSERT INTO `usergroup` VALUES ('3', '10');
INSERT INTO `usergroup` VALUES ('4', '10');
INSERT INTO `usergroup` VALUES ('5', '10');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` varchar(32) NOT NULL,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'qiuzhi', '123456');

-- ----------------------------
-- Table structure for user_roles
-- ----------------------------
DROP TABLE IF EXISTS `user_roles`;
CREATE TABLE `user_roles` (
  `id` varchar(8) NOT NULL,
  `username` varchar(32) NOT NULL,
  `role_name` varchar(32) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_roles
-- ----------------------------
INSERT INTO `user_roles` VALUES ('1', 'qiuzhi', 'admin');
INSERT INTO `user_roles` VALUES ('2', 'qiuzhi', 'group');
