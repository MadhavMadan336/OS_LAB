create table PRODUCT_MASTER_1
(productno varchar(6) check(productno like 'P%') primary key, description varchar(15) not null,
profitpercent number(4,2) not null, unitmeasure varchar(10) not null, qtyonhand number(8) not null, reorderl_vl number(8) not null, sell_price number(8,2) not null, cost_price number(8,2) not null);



insert all
into product_master_1 values('P00001', 'T-Shirt', 5, 'Piece', 200, 50, 350,
250)
into product_master_1 values('P0345', 'Shirts', 6, 'Piece', 150, 50, 500,
350)
into product_master_1 values('P06734', 'Cotton jeans', 5, 'Piece', 100, 20,
600, 450)
 
into product_master_1 values('P07865', 'Jeans', 5, 'Piece' ,100, 20, 750,
500)
into product_master_1 values('P07868', 'Trousers', 2, 'Piece', 150, 50, 850,
550)
into product_master_1 values('P07885', 'Pull Overs', 2.5, 'Piece', 80, 30,
700, 450)
into product_master_1 values('P07965', 'Denim jeans',4, 'Piece', 100, 40, 350, 250)
into product_master_1 values('P07975', 'Lycra tops', 5, 'Piece', 70, 30, 300,
175)
into product_master_1 values('P08865', 'Skirts', 5 ,'Piece', 75, 30, 450,
300)
select * from dual
