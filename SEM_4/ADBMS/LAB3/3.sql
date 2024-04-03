1. Get the supplier number and part number in ascending order of supplier number.
SELECT sp.scode, sp.pcode
FROM Supplier_Part sp
ORDER BY sp.scode ASC;

2. Get the details of supplier who operate from Bombay with turnover 50.
SELECT *
FROM Supplier
WHERE scity = 'Bombay' AND turnover = 50;


3. Get the total number of supplier.
SELECT COUNT(*) AS total_suppliers
FROM Supplier;
