/*
Navicat MySQL Data Transfer

Source Server         : aaa
Source Server Version : 50520
Source Host           : localhost:3306
Source Database       : studentshome

Target Server Type    : MYSQL
Target Server Version : 50520
File Encoding         : 65001

Date: 2020-06-30 19:32:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for baoxiulist
-- ----------------------------
DROP TABLE IF EXISTS `baoxiulist`;
CREATE TABLE `baoxiulist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sushehao` varchar(255) NOT NULL,
  `baoxiuxinxi` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of baoxiulist
-- ----------------------------
INSERT INTO `baoxiulist` VALUES ('1', '123', '风扇嗨了阿萨大大');
INSERT INTO `baoxiulist` VALUES ('2', '202', '空调又坏了阿');
INSERT INTO `baoxiulist` VALUES ('3', '111', '门锁1232131');

-- ----------------------------
-- Table structure for denglu
-- ----------------------------
DROP TABLE IF EXISTS `denglu`;
CREATE TABLE `denglu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of denglu
-- ----------------------------
INSERT INTO `denglu` VALUES ('1', 'admin', '123456');
INSERT INTO `denglu` VALUES ('2', 'admin2', '123456');

-- ----------------------------
-- Table structure for shiwulist
-- ----------------------------
DROP TABLE IF EXISTS `shiwulist`;
CREATE TABLE `shiwulist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sushehao` varchar(255) NOT NULL,
  `shiwuxinxi` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shiwulist
-- ----------------------------
INSERT INTO `shiwulist` VALUES ('1', '201', '丢了个表');
INSERT INTO `shiwulist` VALUES ('2', '202', '丢了个狗');
INSERT INTO `shiwulist` VALUES ('3', '203', '丢了个猫');
INSERT INTO `shiwulist` VALUES ('4', '204', '丢了个人222');
INSERT INTO `shiwulist` VALUES ('5', '222', '123122131');
INSERT INTO `shiwulist` VALUES ('6', '123', '1435432543');
INSERT INTO `shiwulist` VALUES ('12', '123', '213');
INSERT INTO `shiwulist` VALUES ('15', '123', '21432');
INSERT INTO `shiwulist` VALUES ('16', '213', '323');
INSERT INTO `shiwulist` VALUES ('21', '213', '21321');

-- ----------------------------
-- Table structure for sushelist
-- ----------------------------
DROP TABLE IF EXISTS `sushelist`;
CREATE TABLE `sushelist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sushehao` varchar(255) NOT NULL,
  `renshu` varchar(255) NOT NULL,
  `shezhang` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sushelist
-- ----------------------------
INSERT INTO `sushelist` VALUES ('1', '201', '6', '哈皮', '11111');
INSERT INTO `sushelist` VALUES ('2', '202', '6', '哈狗', '22222');
INSERT INTO `sushelist` VALUES ('3', '203', '6', '哈比', '33333');
INSERT INTO `sushelist` VALUES ('4', '204', '6', '哈批', '44444');
INSERT INTO `sushelist` VALUES ('5', '205', '6', '憨批', '55555111');
INSERT INTO `sushelist` VALUES ('6', '620', '6', 'LYB', '13666666666');
INSERT INTO `sushelist` VALUES ('10', '666', '6', '666', '15555555555');

-- ----------------------------
-- Table structure for wanguilist
-- ----------------------------
DROP TABLE IF EXISTS `wanguilist`;
CREATE TABLE `wanguilist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sushehao` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `riqi` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wanguilist
-- ----------------------------
INSERT INTO `wanguilist` VALUES ('1', '123', '21321', '3213213');
INSERT INTO `wanguilist` VALUES ('2', '234', '2432', '111');
INSERT INTO `wanguilist` VALUES ('3', '213', '324324', '32432432');
INSERT INTO `wanguilist` VALUES ('4', '435', '3435', '45345435');

-- ----------------------------
-- Table structure for xueshenglist
-- ----------------------------
DROP TABLE IF EXISTS `xueshenglist`;
CREATE TABLE `xueshenglist` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `sushehao` varchar(255) NOT NULL,
  `xuehao` varchar(255) NOT NULL,
  `zhuanye` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of xueshenglist
-- ----------------------------
INSERT INTO `xueshenglist` VALUES ('1', '哈皮', '201', 'CB201', '软件1', '11111213213');
INSERT INTO `xueshenglist` VALUES ('2', '哈狗', '202', 'CB202', '软件2', '22222');
INSERT INTO `xueshenglist` VALUES ('3', '哈比', '203', 'CB203', '软件3', '33333');
INSERT INTO `xueshenglist` VALUES ('10', '李浩坚', '620', 'CB17131807', '软件工程', '13333333333');
INSERT INTO `xueshenglist` VALUES ('11', '廖浩东', '620', 'CB17131704', '软件工程', '14444444444');
INSERT INTO `xueshenglist` VALUES ('12', '邹宗辛', '620', 'CB17131802', '软件工程', '15555555555');
