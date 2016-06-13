#代码生成不覆盖
java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml 

#代码生成覆盖
#java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite


#样例建表语句
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) default NULL,
  `age` int(11) default NULL,
  `password` varchar(255) default NULL
  PRIMARY KEY  (`id`)
);