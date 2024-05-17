-- First, we create a function that will be called by the trigger
CREATE OR REPLACE FUNCTION log_salary_difference() RETURNS TRIGGER AS $$
BEGIN
    -- If the operation is an UPDATE, calculate and display the salary difference
    IF TG_OP = 'UPDATE' THEN
        RAISE NOTICE 'Salary changed from % to %. Difference: %', OLD.SALARY, NEW.SALARY, NEW.SALARY - OLD.SALARY;
    
    -- If the operation is an INSERT, display the salary of the new record
    ELSIF TG_OP = 'INSERT' THEN
        RAISE NOTICE 'New salary: %', NEW.SALARY;
    
    -- If the operation is a DELETE, display the salary of the deleted record
    ELSIF TG_OP = 'DELETE' THEN
        RAISE NOTICE 'Deleted salary: %', OLD.SALARY;
    END IF;
    
    RETURN NULL;
END;
$$ LANGUAGE plpgsql;

-- Now, we create the trigger that calls the function on INSERT, UPDATE, or DELETE operations
CREATE TRIGGER customer_salary_trigger
AFTER INSERT OR UPDATE OR DELETE ON CUSTOMERS
FOR EACH ROW
EXECUTE FUNCTION log_salary_difference();
