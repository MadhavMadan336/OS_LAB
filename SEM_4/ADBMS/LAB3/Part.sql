Part-(pcode,weigh,color,cost,sellingprice) 
CREATE TABLE Part (
 pcode INT PRIMARY KEY,
 weigh DECIMAL(8, 2),
 color VARCHAR(50),
 cost DECIMAL(10, 2),
 sellingprice DECIMAL(10, 2)
);


 INSERT ALL
 INTO Part (pcode, weigh, color, cost, sellingprice) VALUES (101, 5.5, 'Red', 
50.00, 75.00)
 INTO Part (pcode, weigh, color, cost, sellingprice) VALUES (102, 8.0, 'Blue', 
80.00, 120.00)
 INTO Part (pcode, weigh, color, cost, sellingprice) VALUES (103, 3.3, 'Green', 
30.00, 50.00)
SELECT * FROM dual;
