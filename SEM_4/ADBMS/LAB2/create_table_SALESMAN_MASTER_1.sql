salesmanno varchar(6) check(salesmanno like 'S%') primary key,
salesman_name varchar(20) not null, address_1 varchar(30) not null, address_2 varchar(30),
city varchar(20), pincode number(8), state varchar(20),
salamt number(8,2) check(salamt!=0) not null , tgttoget number(6,2) check(tgttoget!=0) not null, ytdsales number(6,2) not null,
remarks varchar(60)
);
