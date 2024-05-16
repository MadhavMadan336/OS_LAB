CREATE TABLE temp_emp (
    employee_id NUMBER,
    last_name VARCHAR2(50),
    salary NUMBER
);

DECLARE
    CURSOR emp_cursor IS
        SELECT employee_id, last_name, salary
        FROM employees
        WHERE salary > 2500;
BEGIN
    FOR emp_rec IN emp_cursor LOOP
        INSERT INTO temp_emp (employee_id, last_name, salary)
        VALUES (emp_rec.employee_id, emp_rec.last_name, emp_rec.salary);
    END LOOP;
    
    DBMS_OUTPUT.PUT_LINE('Records inserted into TEMP_EMP table.');
END;
/
