DECLARE
    n NUMBER := &n; -- Number of terms in the Fibonacci series
    fib1 NUMBER := 0; -- First Fibonacci number
    fib2 NUMBER := 1; -- Second Fibonacci number
    fib_next NUMBER; -- Next Fibonacci number
BEGIN
    DBMS_OUTPUT.PUT_LINE('Fibonacci Series:');
    DBMS_OUTPUT.PUT_LINE(fib1); -- Display first Fibonacci number
    DBMS_OUTPUT.PUT_LINE(fib2); -- Display second Fibonacci number
    
    -- Loop to generate Fibonacci series
    FOR i IN 3..n LOOP
        fib_next := fib1 + fib2;
        DBMS_OUTPUT.PUT_LINE(fib_next);
        fib1 := fib2;
        fib2 := fib_next;
    END LOOP;
END;
/
