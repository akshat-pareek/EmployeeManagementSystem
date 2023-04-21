create database employee_management;
use employee_management;
create table employee( 
employee_id bigint, 
employee_name varchar(255) not null, 
date_of_birth date not null, 
primary key(employee_id));
INSERT INTO employee ( `employee_id`,`employee_name`, `date_of_birth`) VALUES
(101,'Liam King','1994-06-14'),
(102,'John Hill','1998-04-19'),
(103,'Luke Hall','1988-11-02'),
(104,'Levi Diaz','1999-03-21'),
(105,'Jose Cook','1992-09-09'),
(106,'Jase Cruz','1991-12-31'),
(107,'Jack Wood','2000-07-01');