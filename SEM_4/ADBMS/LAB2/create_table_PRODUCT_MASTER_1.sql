create table PRODUCT_MASTER_1
(productno varchar(6) check(productno like 'P%') primary key, description varchar(15) not null,
profitpercent number(4,2) not null, unitmeasure varchar(10) not null, qtyonhand number(8) not null, reorderl_vl number(8) not null, sell_price number(8,2) not null, cost_price number(8,2) not null);
