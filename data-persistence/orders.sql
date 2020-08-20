use `jdnd-c3`;

create table orders (
	order_id int auto_increment,
    item_name varchar(100) not null,
    item_count int not null,
    customer_name varchar(200) not null,
    customer_address varchar(500) not null,
    created_time timestamp not null,
    constraint order_pk 
		primary key (order_id)
);

desc orders;

select * from orders;

CREATE TABLE animals (
     id MEDIUMINT NOT NULL AUTO_INCREMENT,
     name CHAR(30) NOT NULL,
     PRIMARY KEY (id)
);

INSERT INTO animals (name) VALUES
    ('dog'),('cat'),('penguin'),
    ('lax'),('whale'),('ostrich');

SELECT * FROM animals;

CREATE TABLE post (
     id MEDIUMINT NOT NULL AUTO_INCREMENT,
     title VARCHAR(255) NOT NULL,
     text VARCHAR(1000) NOT NULL,
     created_time timestamp not null,
     PRIMARY KEY (id)
);

desc post;

drop table post;

alter table post modify column text VARCHAR(10000) NOT NULL;

alter table post add column like_count int not null;


