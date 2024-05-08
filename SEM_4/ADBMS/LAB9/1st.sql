DECLARE
    A NUMBER;
    B NUMBER;
    C NUMBER;
    Greatest NUMBER;
BEGIN
    -- Accepting values of A, B, and C
    A := &A;
    B := &B;
    C := &C;

    -- Finding the greatest value among A, B, and C
    IF A > B AND A > C THEN
        Greatest := A;
    ELSIF B > A AND B > C THEN
        Greatest := B;
    ELSE
        Greatest := C;
    END IF;

    -- Displaying the greatest value
    DBMS_OUTPUT.PUT_LINE('The greatest value is: ' || Greatest);
END;
/
