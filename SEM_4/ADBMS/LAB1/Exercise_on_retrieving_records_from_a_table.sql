--a.	Find out the names of all the clients.
--b.	Retrieve the entire contents of the Client_Master table.
--c.	Retrieve the list of names, city and the state of all the clients
--d.	List the various products available from the Product_Master table.
--e.	List all the clients who are located in Mumbai.
f--.	Find the names of salesman who have a salary equal to Rs.3000.


a)	SELECT NAME FROM CLIENT_MASTER;
b)	SELECT * FROM CLIENT_MASTER;
c)	SELECT NAME, CITY, STATE FROM CLIENT_MASTER;
d)	SELECT DESCRIPTION FROM PRODUCT_MASTER;
e)	SELECT * FROM CLIENT_MASTER WHERE CITY = 'Mumbai';
f)	SELECT SALESMANNAME FROM SALESMAN_MASTER WHERE SALARY = 3000;
