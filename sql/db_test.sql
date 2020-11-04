/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : db_test

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2020-11-04 16:01:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `name` varchar(32) NOT NULL,
  `money` double(32,0) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('hailin', '500');
INSERT INTO `account` VALUES ('lisi', '5000');

-- ----------------------------
-- Table structure for `customer`
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` tinyint(32) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `jobs` varchar(50) DEFAULT NULL,
  `phone` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', 'hailin', 'Staff', '123');
INSERT INTO `customer` VALUES ('2', 'Park', 'Staff', '8086');
INSERT INTO `customer` VALUES ('3', 'Halen', 'Manger', '8483 2000');
INSERT INTO `customer` VALUES ('4', 'Alan', 'Staff', '8483 0000');
INSERT INTO `customer` VALUES ('5', '傲寒', 'Manger', '8483');
INSERT INTO `customer` VALUES ('6', '子衿', 'Employer', '8483 0002');
