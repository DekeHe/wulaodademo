CREATE TABLE `user` (
                        `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
                        `name` varchar(255) DEFAULT NULL COMMENT '姓名',
                        `age` int(11) DEFAULT NULL COMMENT '年龄',
                        `sex` varchar(255) DEFAULT NULL COMMENT '性别',
                        `phone` varchar(255) DEFAULT NULL COMMENT '电话',
                        `city` varchar(255) DEFAULT NULL COMMENT '城市',
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `db_cruddemo`.`user` (`name`, `age`, `sex`, `phone`, `city`) VALUES ('james', '10', 'male', '13790664912', 'dongguan');
INSERT INTO `db_cruddemo`.`user` (`name`, `age`, `sex`, `phone`, `city`) VALUES ('tim', '12', 'male', '13790774913', 'shenzhen');
