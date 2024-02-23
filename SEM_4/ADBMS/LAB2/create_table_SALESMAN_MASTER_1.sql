salesmanno varchar(6) check(salesmanno like 'S%') primary key,
salesman_name varchar(20) not null, address_1 varchar(30) not null, address_2 varchar(30),
city varchar(20), pincode number(8), state varchar(20),
salamt number(8,2) check(salamt!=0) not null , tgttoget number(6,2) check(tgttoget!=0) not null, ytdsales number(6,2) not null,
remarks varchar(60)
);




INSERT ALL
INTO SALESMAN_MASTER_1 VALUES('S00001', 'Aman', 'A/14', 'Worli',
'Mumbai', 400002, 'Maharashtra', NULL, NULL, NULL,'')
INTO SALESMAN_MASTER_1 VALUES('S00002', 'Omkar', '65',
'Nariman', 'Mumbai', 400001, 'Maharashtra', NULL, NULL, NULL,'')
 
INTO SALESMAN_MASTER_1 VALUES('S00003', 'Raj', 'P-7', 'Bandra',
'Mumbai', 400032, 'Maharashtra', NULL, NULL, NULL,'')
INTO SALESMAN_MASTER_1 VALUES('S00004', 'Ashish', 'A/5', 'Juhu',
'Mumbai', 400044, 'Maharashtra', NULL, NULL, NULL,'') SELECT * FROM dual;
