/*
 Navicat Premium Data Transfer

 Source Server         :  192.168.1.103
 Source Server Type    : MySQL
 Source Server Version : 50642
 Source Host           : localhost:3306
 Source Schema         : video

 Target Server Type    : MySQL
 Target Server Version : 50642
 File Encoding         : 65001

 Date: 22/01/2019 16:05:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bgm
-- ----------------------------
DROP TABLE IF EXISTS `bgm`;
CREATE TABLE `bgm`  (
  `id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `author` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '播放地址',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of bgm
-- ----------------------------
INSERT INTO `bgm` VALUES ('181227A5K3KBNF80', 'aa', 'Analog-dream', '\\bgm\\Analog-dream.mp3');
INSERT INTO `bgm` VALUES ('181227A5K3KBNF83', 'bb', 'Autumn-day', '\\bgm\\Autumn-day.mp3');
INSERT INTO `bgm` VALUES ('181227A5K3KJNF80', 'cc', 'Lounge-deep-house-chillout', '\\bgm\\Lounge-deep-house-chillout.mp3');
INSERT INTO `bgm` VALUES ('181227A5P4PKW6W0', 'dd', 'Magical-path-melodic', '\\bgm\\Magical-path-melodic.mp3');
INSERT INTO `bgm` VALUES ('181227AG53KBNF80', 'ee', 'Relaxing-thinking', '\\bgm\\Relaxing-thinking.mp3');

-- ----------------------------
-- Table structure for comments
-- ----------------------------
DROP TABLE IF EXISTS `comments`;
CREATE TABLE `comments`  (
  `id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `father_comment_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `to_user_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `video_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '视频id',
  `from_user_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '留言者，评论的用户id',
  `comment` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '评论内容',
  `create_time` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '课程评论表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of comments
-- ----------------------------
INSERT INTO `comments` VALUES ('190118B7XSZF09S8', 'undefined', 'undefined', '190118870HMGCZC0', '190117B56PXYMB7C', 'hahaha', '2019-01-18 15:48:33');
INSERT INTO `comments` VALUES ('190118B7YX8T111P', 'undefined', 'undefined', '190118870HMGCZC0', '190117B56PXYMB7C', 'test', '2019-01-18 15:48:40');
INSERT INTO `comments` VALUES ('190118B8030NNPSW', '190118B7YX8T111P', '190117B56PXYMB7C', '190118870HMGCZC0', '190117B56PXYMB7C', '!!', '2019-01-18 15:48:48');
INSERT INTO `comments` VALUES ('190118B8391W4C28', 'undefined', 'undefined', '19011886XKD8RHPH', '190117B56PXYMB7C', 'hah', '2019-01-18 15:49:09');
INSERT INTO `comments` VALUES ('190118B84K84XFCH', 'undefined', 'undefined', '19011886MHTNRPZC', '190117B56PXYMB7C', 'hah', '2019-01-18 15:49:17');
INSERT INTO `comments` VALUES ('190118B850RZRGR4', 'undefined', 'undefined', '19011886MHTNRPZC', '190117B56PXYMB7C', 'wa', '2019-01-18 15:49:20');
INSERT INTO `comments` VALUES ('190118B86CT1A0DP', 'undefined', 'undefined', '19011886H3G528ZC', '190117B56PXYMB7C', 'test test', '2019-01-18 15:49:29');

-- ----------------------------
-- Table structure for search_records
-- ----------------------------
DROP TABLE IF EXISTS `search_records`;
CREATE TABLE `search_records`  (
  `id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '搜索的内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '视频搜索的记录表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of search_records
-- ----------------------------
INSERT INTO `search_records` VALUES ('1901188FB8H9C5WH', '猫');
INSERT INTO `search_records` VALUES ('1901188FD59962RP', '二哈');
INSERT INTO `search_records` VALUES ('1901188FFY72FDGC', '物理');
INSERT INTO `search_records` VALUES ('1901188GFY72BDYW', '回首掏');
INSERT INTO `search_records` VALUES ('190118B8906XM7MW', '回首掏');
INSERT INTO `search_records` VALUES ('190118B89Z9T12A8', '回首掏');
INSERT INTO `search_records` VALUES ('190118B8AS999M14', '猫');
INSERT INTO `search_records` VALUES ('190118B8BNCGDKP0', '回首掏');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  `face_image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '我的头像，如果没有默认给一张',
  `nickname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '昵称',
  `fans_counts` int(11) NULL DEFAULT 0 COMMENT '我的粉丝数量',
  `follow_counts` int(11) NULL DEFAULT 0 COMMENT '我关注的人总数',
  `receive_like_counts` int(11) NULL DEFAULT 0 COMMENT '我接受到的赞美/收藏 的数量',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `id`(`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('190117B56PXYMB7C', 'linz', 'kH5qrZWxFZOUbij24phgqg==', '/190117B56PXYMB7C/face/wxe066ee49382f67ba.o6zAJsxZm3bYnvcw5bMZlqBYJ6Uo.9G0kEsjOBPMCa699959155972f3e2961c3fdc32ff2f2.jpg', 'linz', 1, 2, 1);
INSERT INTO `users` VALUES ('19011886RHFYTDKP', 'lin', 'yTFp8eub5yRvmQaQteZrLQ==', '/19011886RHFYTDKP/face/wxe066ee49382f67ba.o6zAJsxZm3bYnvcw5bMZlqBYJ6Uo.HUJnCziCp9jj71d2a9aba29ab10d3c25ea88d649fc14.jpg', 'lin', 1, 0, 1);

-- ----------------------------
-- Table structure for users_fans
-- ----------------------------
DROP TABLE IF EXISTS `users_fans`;
CREATE TABLE `users_fans`  (
  `id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `user_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户',
  `fan_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '粉丝',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_id`(`user_id`, `fan_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户粉丝关联关系表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users_fans
-- ----------------------------
INSERT INTO `users_fans` VALUES ('190118AK3KRRBPSW', '190117B56PXYMB7C', '190117B56PXYMB7C');
INSERT INTO `users_fans` VALUES ('190118AHS8H98DAW', '19011886RHFYTDKP', '190117B56PXYMB7C');

-- ----------------------------
-- Table structure for users_like_videos
-- ----------------------------
DROP TABLE IF EXISTS `users_like_videos`;
CREATE TABLE `users_like_videos`  (
  `id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `user_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户',
  `video_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '视频',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_video_rel`(`user_id`, `video_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '用户喜欢的/赞过的视频' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of users_like_videos
-- ----------------------------
INSERT INTO `users_like_videos` VALUES ('190118AK110DMNC0', '190117B56PXYMB7C', '19011886MHTNRPZC');
INSERT INTO `users_like_videos` VALUES ('190118AHWC8RS428', '190117B56PXYMB7C', '19011886XKD8RHPH');

-- ----------------------------
-- Table structure for users_report
-- ----------------------------
DROP TABLE IF EXISTS `users_report`;
CREATE TABLE `users_report`  (
  `id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `deal_user_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '被举报用户id',
  `deal_video_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `title` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '类型标题，让用户选择，详情见 枚举',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '内容',
  `userid` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '举报人的id',
  `create_date` datetime(0) NOT NULL COMMENT '举报时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '举报用户表' ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for videos
-- ----------------------------
DROP TABLE IF EXISTS `videos`;
CREATE TABLE `videos`  (
  `id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `user_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '发布者id',
  `audio_id` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户使用音频的信息',
  `video_desc` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '视频描述',
  `video_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '视频存放的路径',
  `video_seconds` float(6, 2) NULL DEFAULT NULL COMMENT '视频秒数',
  `video_width` int(6) NULL DEFAULT NULL COMMENT '视频宽度',
  `video_height` int(6) NULL DEFAULT NULL COMMENT '视频高度',
  `cover_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '视频封面图',
  `like_counts` bigint(20) NOT NULL DEFAULT 0 COMMENT '喜欢/赞美的数量',
  `status` int(1) NOT NULL COMMENT '视频状态：\r\n1、发布成功\r\n2、禁止播放，管理员操作',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '视频信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of videos
-- ----------------------------
INSERT INTO `videos` VALUES ('190117GH7Y7PMR1P', '190117B56PXYMB7C', '', '回首掏', '/190117B56PXYMB7C/video/wxe066ee49382f67ba.o6zAJsxZm3bYnvcw5bMZlqBYJ6Uo.5JJsTQZX1Jmd267624d0649c1b7d68f9c2845ec278b2.mp4', 4.55, 480, 852, '/190117B56PXYMB7C/video/wxe066ee49382f67bao6zAJsxZm3bYnvcw5bMZlqBYJ6Uo5JJsTQZX1Jmd267624d0649c1b7d68f9c2845ec278b2.jpg', 0, 1, '2019-01-17 21:49:56');
INSERT INTO `videos` VALUES ('190118869SM8FGF8', '190117B56PXYMB7C', '', '二哈', '/190117B56PXYMB7C/video/tmp_78f6e6fc3a123fc98868face7a5e481ed427fb46dd224368.mp4', 7.00, 272, 480, '/190117B56PXYMB7C/video/tmp_78f6e6fc3a123fc98868face7a5e481ed427fb46dd224368.jpg', 0, 1, '2019-01-18 11:31:38');
INSERT INTO `videos` VALUES ('19011886H3G528ZC', '190117B56PXYMB7C', '', '神奇的物理现象', '/190117B56PXYMB7C/video/tmp_96bce4a9b75a4cb1d165e1c229499f28e4dca55e912ffcd6.mp4', 11.00, 368, 640, '/190117B56PXYMB7C/video/tmp_96bce4a9b75a4cb1d165e1c229499f28e4dca55e912ffcd6.jpg', 0, 1, '2019-01-18 11:32:18');
INSERT INTO `videos` VALUES ('19011886MHTNRPZC', '190117B56PXYMB7C', '', '熊猫', '/190117B56PXYMB7C/video/tmp_f37d2b56c89a54353897e9aa522618e16169efdb4843b46f.mp4', 13.00, 272, 480, '/190117B56PXYMB7C/video/tmp_f37d2b56c89a54353897e9aa522618e16169efdb4843b46f.jpg', 1, 1, '2019-01-18 11:32:34');
INSERT INTO `videos` VALUES ('19011886XKD8RHPH', '19011886RHFYTDKP', '', '神奇的物理现象', '/19011886RHFYTDKP/video/tmp_ead131c7593806fa0547f26ea5fd174315da170f432a9f28.mp4', 13.00, 272, 480, '/19011886RHFYTDKP/video/tmp_ead131c7593806fa0547f26ea5fd174315da170f432a9f28.jpg', 1, 1, '2019-01-18 11:33:19');
INSERT INTO `videos` VALUES ('190118870HMGCZC0', '19011886RHFYTDKP', '', '猫', '/19011886RHFYTDKP/video/tmp_518f9b515854dbedf5260d4dc2eff8e54d215211a1021c85.mp4', 11.00, 272, 368, '/19011886RHFYTDKP/video/tmp_518f9b515854dbedf5260d4dc2eff8e54d215211a1021c85.jpg', 0, 1, '2019-01-18 11:33:38');

SET FOREIGN_KEY_CHECKS = 1;
