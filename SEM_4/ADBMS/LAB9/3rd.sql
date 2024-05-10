DECLARE
    num NUMBER := &num; -- Input number for which factorial is to be calculated
    factorial NUMBER := 1; -- Variable to store factorial result
BEGIN
    -- Check if input number is zero
    IF num = 0 THEN
        factorial := 1; -- Factorial of 0 is 1
    ELSE
        -- Loop to calculate factorial
        FOR i IN 1..num LOOP
            factorial := factorial * i;
        END LOOP;
    END IF;
    
    -- Display the factorial result
    DBMS_OUTPUT.PUT_LINE('Factorial of ' || num || ' is: ' || factorial);
END;
/
