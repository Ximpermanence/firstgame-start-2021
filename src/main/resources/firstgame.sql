/*
 Navicat MySQL Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : firstgame

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 04/02/2021 16:18:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for game_monster_property
-- ----------------------------
DROP TABLE IF EXISTS `game_monster_property`;
CREATE TABLE `game_monster_property`  (
  `level` int(11) NOT NULL AUTO_INCREMENT COMMENT '等级',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名字',
  `ad` int(11) NULL DEFAULT NULL COMMENT '攻击',
  `armor` int(11) NULL DEFAULT NULL COMMENT '防御',
  `hp` int(11) NULL DEFAULT NULL COMMENT '生命值',
  `crit` float NULL DEFAULT NULL COMMENT '暴击率',
  `dropexp` int(11) NULL DEFAULT NULL COMMENT '掉落经验',
  `dropgp` int(11) NULL DEFAULT NULL COMMENT '掉落金币',
  `create_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `create_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `modify_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `modify_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `is_deleted` tinyint(3) NULL DEFAULT 1 COMMENT '是否删除 - 1:未删除 0:删除',
  PRIMARY KEY (`level`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '怪物属性表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of game_monster_property
-- ----------------------------
INSERT INTO `game_monster_property` VALUES (1, '1级小怪', 3, 1, 5, 0, 1, 1, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (2, '2级小怪', 4, 2, 10, 0, 2, 2, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (3, '3级小怪', 5, 3, 15, 0, 3, 3, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (4, '4级小怪', 6, 4, 20, 0, 4, 4, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (5, '5级小怪', 7, 5, 30, 0.25, 5, 5, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (6, '6级小怪', 8, 6, 35, 0, 6, 6, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (7, '7级小怪', 9, 7, 40, 0, 7, 7, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (8, '8级小怪', 10, 8, 45, 0, 8, 8, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (9, '9级小怪', 11, 9, 50, 0, 9, 9, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (10, '10级大怪', 12, 10, 70, 0.25, 10, 10, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (11, '11级小怪', 17, 15, 85, 0, 11, 11, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (12, '12级小怪', 19, 17, 100, 0, 12, 12, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (13, '13级小怪', 21, 19, 115, 0, 13, 13, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (14, '14级小怪', 23, 21, 130, 0, 14, 14, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (15, '15级大怪', 25, 23, 160, 0.3, 15, 15, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (16, '16级小怪', 27, 25, 180, 0, 16, 16, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (17, '17级小怪', 29, 27, 200, 0, 17, 17, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (18, '18级小怪', 31, 29, 220, 0, 18, 18, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (19, '19级小怪', 33, 31, 240, 0, 19, 19, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (20, '20级大怪', 39, 37, 280, 0.35, 20, 20, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (21, '21级小怪', 44, 42, 300, 0, 21, 21, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (22, '22级小怪', 50, 48, 325, 0, 22, 22, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (23, '23级小怪', 57, 55, 350, 0, 23, 23, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (24, '24级小怪', 65, 63, 375, 0, 24, 24, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (25, '25级大怪', 77, 75, 420, 0.4, 25, 25, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (26, '26级小怪', 86, 84, 480, 0.1, 26, 26, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (27, '27级小怪', 95, 93, 530, 0.2, 27, 27, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (28, '28级小怪', 105, 103, 580, 0.3, 28, 28, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (29, '29级小怪', 116, 114, 680, 0.4, 29, 29, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);
INSERT INTO `game_monster_property` VALUES (30, '30级大怪', 132, 130, 800, 0.5, 30, 30, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', NULL);

-- ----------------------------
-- Table structure for game_player_property
-- ----------------------------
DROP TABLE IF EXISTS `game_player_property`;
CREATE TABLE `game_player_property`  (
  `level` int(11) NOT NULL AUTO_INCREMENT COMMENT '等级',
  `ad` int(11) NULL DEFAULT NULL COMMENT '攻击',
  `armor` int(11) NULL DEFAULT NULL COMMENT '防御',
  `hp` int(11) NULL DEFAULT NULL COMMENT '生命值',
  `crit` float NULL DEFAULT NULL COMMENT '暴击率',
  `needexp` int(11) NULL DEFAULT NULL COMMENT '所需经验',
  `create_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `create_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `modify_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `modify_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `is_deleted` tinyint(3) NULL DEFAULT 1 COMMENT '是否删除 - 1:未删除 0:删除',
  PRIMARY KEY (`level`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '玩家属性表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of game_player_property
-- ----------------------------
INSERT INTO `game_player_property` VALUES (1, 6, 1, 10, 0.25, 0, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (2, 7, 2, 20, 0.25, 1, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (3, 8, 3, 30, 0.25, 2, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (4, 9, 4, 40, 0.25, 3, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (5, 10, 5, 50, 0.25, 10, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (6, 11, 6, 60, 0.25, 12, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (7, 12, 7, 70, 0.25, 14, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (8, 13, 8, 80, 0.25, 16, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (9, 14, 9, 90, 0.25, 18, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (10, 15, 10, 100, 0.25, 30, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (11, 20, 15, 110, 0.25, 33, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (12, 22, 17, 120, 0.25, 36, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (13, 24, 19, 130, 0.25, 39, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (14, 26, 21, 140, 0.25, 42, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (15, 28, 23, 150, 0.25, 60, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (16, 30, 25, 160, 0.25, 64, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (17, 32, 27, 170, 0.25, 68, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (18, 34, 29, 180, 0.25, 72, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (19, 36, 31, 190, 0.25, 76, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (20, 38, 33, 200, 0.25, 100, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (21, 50, 45, 210, 0.25, 120, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (22, 53, 48, 220, 0.25, 140, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (23, 56, 51, 230, 0.25, 160, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (24, 59, 54, 240, 0.25, 180, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (25, 62, 57, 250, 0.25, 220, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (26, 66, 61, 260, 0.25, 260, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (27, 70, 65, 270, 0.25, 300, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (28, 74, 69, 280, 0.25, 340, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (29, 78, 73, 290, 0.25, 380, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `game_player_property` VALUES (30, 85, 80, 300, 0.25, 500, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);

-- ----------------------------
-- Table structure for gp_strong
-- ----------------------------
DROP TABLE IF EXISTS `gp_strong`;
CREATE TABLE `gp_strong`  (
  `gpprice` int(11) NULL DEFAULT NULL COMMENT '金币价格',
  `ad` int(11) NULL DEFAULT NULL COMMENT '增加攻击',
  `armor` int(11) NULL DEFAULT NULL COMMENT '增加防御',
  `hp` int(11) NULL DEFAULT NULL COMMENT '增加生命值',
  `create_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `create_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `modify_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `modify_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `is_deleted` tinyint(3) NULL DEFAULT 1 COMMENT '是否删除 - 1:未删除 0:删除'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '金币提升表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gp_strong
-- ----------------------------
INSERT INTO `gp_strong` VALUES (30, 1, 0, 0, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `gp_strong` VALUES (30, 0, 1, 0, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `gp_strong` VALUES (30, 0, 0, 15, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `gp_strong` VALUES (80, 1, 1, 15, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);

-- ----------------------------
-- Table structure for money_strong
-- ----------------------------
DROP TABLE IF EXISTS `money_strong`;
CREATE TABLE `money_strong`  (
  `rmbprice` int(11) NULL DEFAULT NULL COMMENT '现金价格',
  `ad` int(11) NULL DEFAULT NULL COMMENT '增加攻击',
  `armor` int(11) NULL DEFAULT NULL COMMENT '增加防御',
  `hp` int(11) NULL DEFAULT NULL COMMENT '增加生命值',
  `create_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `create_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `modify_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `modify_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `is_deleted` tinyint(3) NULL DEFAULT 1 COMMENT '是否删除 - 1:未删除 0:删除'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '充值现金提升' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of money_strong
-- ----------------------------
INSERT INTO `money_strong` VALUES (5, 1, 1, 10, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `money_strong` VALUES (20, 5, 5, 50, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `money_strong` VALUES (100, 30, 30, 150, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);

-- ----------------------------
-- Table structure for player_info
-- ----------------------------
DROP TABLE IF EXISTS `player_info`;
CREATE TABLE `player_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `level` int(11) NULL DEFAULT NULL COMMENT '等级',
  `ad` int(11) NULL DEFAULT NULL COMMENT '攻击',
  `armor` int(11) NULL DEFAULT NULL COMMENT '防御',
  `hp` int(11) NULL DEFAULT NULL COMMENT '生命值',
  `crit` float NULL DEFAULT NULL COMMENT '暴击率',
  `nowexp` int(11) NULL DEFAULT NULL COMMENT '现在经验',
  `nowgp` int(11) NULL DEFAULT NULL COMMENT '现在金币',
  `usemoney` int(11) NULL DEFAULT NULL COMMENT '充值现金',
  `create_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `create_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `modify_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `modify_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `is_deleted` tinyint(3) NULL DEFAULT 1 COMMENT '是否删除 - 1:未删除 0:删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '玩家属性' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of player_info
-- ----------------------------
INSERT INTO `player_info` VALUES (1, 'admin', 100, 1000, 1000, 10000, 1, 10000, 10000, 10000, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `player_info` VALUES (2, 'ch', 10, 10, 10, 10, 0.25, 10, 10, 10, '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);

-- ----------------------------
-- Table structure for player_user
-- ----------------------------
DROP TABLE IF EXISTS `player_user`;
CREATE TABLE `player_user`  (
  `id` int(11) NULL DEFAULT NULL,
  `username` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `create_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `create_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `modify_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',
  `modify_user` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人',
  `is_deleted` tinyint(3) NULL DEFAULT 1 COMMENT '是否删除 - 1:未删除 0:删除'
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户属性' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of player_user
-- ----------------------------
INSERT INTO `player_user` VALUES (1, 'admin', 'admin', '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);
INSERT INTO `player_user` VALUES (1, 'ch', 'ch', '2021-01-27 00:00:00', 'ch', '2021-01-27 00:00:00', 'ch', 1);

-- ----------------------------
-- Procedure structure for add_5default_word
-- ----------------------------
DROP PROCEDURE IF EXISTS `add_5default_word`;
delimiter ;;
CREATE PROCEDURE `add_5default_word`(IN tab VARCHAR(100))
BEGIN
IF NOT EXISTS(SELECT 1 FROM information_schema.columns WHERE table_name=tab AND COLUMN_NAME='create_date') THEN
SET @exe = CONCAT('ALTER TABLE ',tab," ADD create_date DATE COMMENT '创建时间'");
PREPARE sql1 FROM @exe;
EXECUTE sql1;
END IF;
IF NOT EXISTS(SELECT 1 FROM information_schema.columns WHERE table_name=tab AND COLUMN_NAME='create_user') THEN
SET @exe = CONCAT('ALTER TABLE ',tab," ADD create_user VARCHAR(50) COMMENT '创建人'");
PREPARE sql1 FROM @exe;
EXECUTE sql1;
END IF;
IF NOT EXISTS(SELECT 1 FROM information_schema.columns WHERE table_name=tab AND COLUMN_NAME='modify_date') THEN
SET @exe = CONCAT('ALTER TABLE ',tab," ADD modify_date DATE COMMENT '修改时间'");
PREPARE sql1 FROM @exe;
EXECUTE sql1;
END IF;
IF NOT EXISTS(SELECT 1 FROM information_schema.columns WHERE table_name=tab AND COLUMN_NAME='modify_user') THEN
SET @exe = CONCAT('ALTER TABLE ',tab," ADD modify_user VARCHAR(50) COMMENT '修改人'");
PREPARE sql1 FROM @exe;
EXECUTE sql1;
END IF;
IF NOT EXISTS(SELECT 1 FROM information_schema.columns WHERE table_name=tab AND COLUMN_NAME='is_deleted') THEN
SET @exe = CONCAT('ALTER TABLE ',tab," ADD is_deleted tinyint(3) DEFAULT '1' COMMENT '是否删除 - 1:未删除 0:删除'");
PREPARE sql1 FROM @exe;
EXECUTE sql1;
END IF;
END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
