CREATE OR REPLACE PROCEDURE CompareValues (
    A IN NUMBER,
    B IN NUMBER,
    C IN NUMBER
)
IS
    Greatest NUMBER;
BEGIN
    IF A > B AND A > C THEN
        Greatest := A;
    ELSIF B > A AND B > C THEN
        Greatest := B;
    ELSE
        Greatest := C;
    END IF;
    
    DBMS_OUTPUT.PUT_LINE('The greatest value is: ' || Greatest);
END;
/
