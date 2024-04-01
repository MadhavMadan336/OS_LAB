1. Get the supplier number and part number in ascending order of supplier number.
SELECT sp.scode, sp.pcode
FROM Supplier_Part sp
ORDER BY sp.scode ASC;
