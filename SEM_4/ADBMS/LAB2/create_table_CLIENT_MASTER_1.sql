create table CLIENT_MASTER_1
(clientno varchar(6) check (clientno like 'C%') primary key, Name varchar(20) not null,
address_1 varchar(30), address_2 varchar(30), city varchar(15), pincode number(8), state varchar(15), baldue number(10,2))





#value insert
INSERT ALL
 
INTO CLIENT_MASTER_1 VALUES ('C00001', 'Ivan bayross', '', '',
'Mumbai', 400054, 'Maharashtra', 15000)
INTO CLIENT_MASTER_1 VALUES ('C00002', 'Mamta muzumdar', '', '',
'Madras', 780001, 'Tamil nadu', 0)
INTO CLIENT_MASTER_1 VALUES ('C00003', 'Chhaya bankar', '', '',
'Mumbai', 400057, 'Maharashtra', 5000)
INTO CLIENT_MASTER_1 VALUES ('C00004', 'Ashwini joshi', '', '',
'Bangalore', 560001, 'Karnataka', 0)
INTO CLIENT_MASTER_1 VALUES ('C00005', 'Hansel colaco', '', '',
'Mumbai', 400060, 'Maharashtra', 2000)
INTO CLIENT_MASTER_1 VALUES ('C00006', 'Deepak sharma', '', '',
'Mangalore', 560050, 'Karnataka', 0) SELECT * FROM dual;
