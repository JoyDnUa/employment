CREATE DATABASE IF NOT EXISTS employment CHARACTER SET utf8 COLLATE utf8_bin;
USE `employment`;
GRANT ALL PRIVILEGES ON employment.* TO 'root'@'localhost' IDENTIFIED BY '1234';

DROP TABLE IF EXISTS `users_skills`;
DROP TABLE IF EXISTS `users`;
DROP TABLE IF EXISTS `skills`;

CREATE TABLE `users` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(30) COLLATE utf8_bin NOT NULL,
  `firstname` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  `lastname` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `workload` tinyint(3) DEFAULT NULL,
  `creation_time` datetime NOT NULL,
  `modification_time` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `skills` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8_bin NOT NULL,
  `creation_time` datetime NOT NULL,
  `modification_time` datetime NOT NULL,
   PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `users_skills` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `id_user` bigint(20) unsigned NOT NULL,
  `id_skill` bigint(20) unsigned NOT NULL,
  `level` varchar(15) COLLATE utf8_bin DEFAULT NULL,
  `period` float unsigned DEFAULT NULL,
  `creation_time` datetime NOT NULL,
  `modification_time` datetime NOT NULL,
  `wish` tinyint(3) unsigned DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_user_idx` (`id_user`),
  KEY `id_skill_idx` (`id_skill`),
  CONSTRAINT `id_skill` FOREIGN KEY (`id_skill`) REFERENCES `skills` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `id_user` FOREIGN KEY (`id_user`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

