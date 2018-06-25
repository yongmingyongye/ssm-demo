DROP DATABASE IF EXISTS school;
create database school default charset utf8 collate utf8_unicode_ci;
use school;
create table student(
	id int(10) UNSIGNED not null PRIMARY key AUTO_INCREMENT,
	name VARCHAR(20) not null,
	sex VARCHAR(10),
  age int(4),
	address VARCHAR(255),
	class_id int(10)
);
CREATE table classes(
	id int(10) UNSIGNED not null PRIMARY key AUTO_INCREMENT,
	class_name VARCHAR(60) not null	
)