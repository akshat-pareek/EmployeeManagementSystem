CREATE TABLE IF NOT EXISTS employee{
    employee_id big int,
    employee_name varchar(255) not null,
    date_of_birth date not null,
    primary key (employee_id)
};