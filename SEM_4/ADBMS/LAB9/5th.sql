DECLARE
    n NUMBER := &n; -- Number of terms
    sum NUMBER := 0; -- Variable to store sum
BEGIN
    -- Loop to find sum of first N numbers
    FOR i IN 1..n LOOP
        sum := sum + i;
    END LOOP;
    
    -- Display the sum
    DBMS_OUTPUT.PUT_LINE('Sum of first ' || n || ' numbers: ' || sum);
END;
/
