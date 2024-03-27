Part-(pcode,weigh,color,cost,sellingprice) 
CREATE TABLE Part (
 pcode INT PRIMARY KEY,
 weigh DECIMAL(8, 2),
 color VARCHAR(50),
 cost DECIMAL(10, 2),
 sellingprice DECIMAL(10, 2)
);
