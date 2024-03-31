Supplier_Part-(scode,pcode,qty)
CREATE TABLE Supplier_Part (
 scode INT,
 pcode INT,
 qty INT,
 PRIMARY KEY (scode, pcode),
 FOREIGN KEY (scode) REFERENCES Supplier(scode),
 FOREIGN KEY (pcode) REFERENCES Part(pcode)
);

INSERT ALL
 INTO Supplier_Part (scode, pcode, qty) VALUES (1, 101, 200)
 INTO Supplier_Part (scode, pcode, qty) VALUES (1, 102, 150)
 INTO Supplier_Part (scode, pcode, qty) VALUES (2, 102, 100)
 INTO Supplier_Part (scode, pcode, qty) VALUES (3, 103, 300)
SELECT * FROM dual;
