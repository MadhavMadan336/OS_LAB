DECLARE
    i NUMBER := 1;  -- Loop counter
BEGIN
    -- Loop to display the message 20 times
    WHILE i <= 20 LOOP
        DBMS_OUTPUT.PUT_LINE('Welcome to PL/SQL Programming');
        i := i + 1;  -- Increment counter
    END LOOP;
END;
/
