1)	Create an index of name employee_idx on EMPLOYEES with column Last_Name, Department_id  

CREATE INDEX employee_idx ON EMPLOYEES(Last_Name, Department_id);


2)	Find the ROWID for the above table and create a unique index on employee_id column of the EMPLOYEES.
DROP VIEW emp_view; // if needed 

CREATE VIEW new_emp_view AS
SELECT Employee_id, Last_Name, Salary, Department_id
FROM EMPLOYEES;


3)	Create a reverse index on employee_id column of the EMPLOYEES.
CREATE INDEX employee_id_reverse_idx ON EMPLOYEES(employee_id DESC);


4)	Create a unique and composite index on employee_id and check whether there is duplicity of tuples or not.
CREATE UNIQUE INDEX composite_employee_dept_idx ON EMPLOYEES(employee_id, department_id);
