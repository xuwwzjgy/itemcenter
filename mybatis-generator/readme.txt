#�������ɲ�����
java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml 

#�������ɸ���
#java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite


#�����������
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) default NULL,
  `age` int(11) default NULL,
  `password` varchar(255) default NULL
  PRIMARY KEY  (`id`)
);