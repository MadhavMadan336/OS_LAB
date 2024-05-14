DECLARE
    updated_records NUMBER;
BEGIN
    UPDATE employees
    SET salary = salary * 1.1; -- Increase salary by 10%
    
    updated_records := SQL%ROWCOUNT; -- Get the number of updated records
    
    IF updated_records > 0 THEN
        DBMS_OUTPUT.PUT_LINE('Number of records updated: ' || updated_records);
    ELSE
        DBMS_OUTPUT.PUT_LINE('No Change');
    END IF;
END;
/
