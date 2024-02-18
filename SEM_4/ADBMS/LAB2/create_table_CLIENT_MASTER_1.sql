create table CLIENT_MASTER_1
(clientno varchar(6) check (clientno like 'C%') primary key, Name varchar(20) not null,
address_1 varchar(30), address_2 varchar(30), city varchar(15), pincode number(8), state varchar(15), baldue number(10,2))
