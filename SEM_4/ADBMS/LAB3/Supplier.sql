Supplier-(scode,sname,scity,turnover)
CREATE TABLE Supplier (
 scode INT PRIMARY KEY,
 sname VARCHAR(255),
 scity VARCHAR(255),
 turnover DECIMAL(10, 2)
);



INSERT ALL
 INTO Supplier (scode, sname, scity, turnover) VALUES(1, 'ram', 'dehradun', 
10000)
 INTO Supplier (scode, sname, scity, turnover) VALUES(2, 'mohan', 'delhi', 15000)
 INTO Supplier (scode, sname, scity, turnover) VALUES(3, 'shyam', 'bihar', 12000)
SELECT * FROM dual;
