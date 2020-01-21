# structure
CREATE TABLE `mybatis_test`
(
    `id`          int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name`        varchar(20)      DEFAULT NULL,
    `hobbies`     varchar(100)     DEFAULT NULL,
    `idols`       varchar(100)     DEFAULT NULL,
    `create_time` int(11) NOT NULL DEFAULT '0',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 7
  DEFAULT CHARSET = utf8;

# content
insert into mybatis_test(name, hobbies, idols, create_time)
values ('十七', '旅行', '苏轼,成龙', 1579616237),
       ('张昕宇', '侣行', '未知', 1579616237);