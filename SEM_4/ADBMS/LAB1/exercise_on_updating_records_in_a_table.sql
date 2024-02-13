a.	Change the city of ClientNo ‘C00005’ to ‘Bangalore’.
b.	Change the BalDue of ClientNo ‘C00001’ to Rs.1000.
c.	Change the cost price of ‘Trousers’ to rs.950.00.
d.	Change the city of the salesman to Pune.

  
a)	UPDATE CLIENT_MASTER SET CITY = 'Bangalore'
WHERE CLIENTNO = 'C00005';

b)	UPDATE CLIENT_MASTER SET BALDUE = 1000
WHERE CLIENTNO = 'C00001';

c)	UPDATE PRODUCT_MASTER SET COSTPRICE = 950.00
WHERE DESCRIPTION = 'Trousers';

d)	UPDATE SALESMAN_MASTER SET CITY = 'Pune'
WHERE SALESMANNO = 'S00001';
