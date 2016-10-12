drop table if exists products;

create table products (
  id integer primary key,
  description varchar(255),
  price decimal(15,2)
);
