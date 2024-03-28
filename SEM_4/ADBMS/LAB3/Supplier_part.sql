Supplier_Part-(scode,pcode,qty)
CREATE TABLE Supplier_Part (
 scode INT,
 pcode INT,
 qty INT,
 PRIMARY KEY (scode, pcode),
 FOREIGN KEY (scode) REFERENCES Supplier(scode),
 FOREIGN KEY (pcode) REFERENCES Part(pcode)
);
