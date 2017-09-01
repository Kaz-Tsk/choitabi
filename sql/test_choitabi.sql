set foreign_key_checks = 0;

//*ちょいたびデータベース作成(お試し版)*//
drop database if exists test_choitabi;
create database test_choitabi;
use test_choitabi;

//*カテゴリー(エリア)テーブル*//
drop table if exists categories_area;
create table categories_area(
categories_a_id int not null auto_increment primary key,
categories_a_name varchar(100) not null
);

//*カテゴリー(テーマ)テーブル*//
drop table if exists categories_theme;
create table categories_theme(
categories_t_id int not null auto_increment primary key,
categories_t_name varchar(100) not null
);

//*ツアーテーブル*//
drop table if exists tour;
create table tour(
tour_name varchar(100) not null,
tour_id int primary key not null auto_increment,
price decimal not null,
persons int not null,
date date not null,
departure varchar(100) not null
);


drop table if exists purchases_history;
create table purchase_history(
user_id int not null,
tour_id int not null,
purchases_date datetime not null,
total_price decimal(9,2) not null
);


drop table if exists cart;
create table cart(
user_id int,
tour_id int,
quantity int not null,
total_price decimal(9,2) not null
);

