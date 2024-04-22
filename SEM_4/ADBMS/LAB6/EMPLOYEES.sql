CREATE TABLE EMPLOYEES (
Employee_id CHAR(10) PRIMARY KEY,
First_Name VARCHAR(30) NOT NULL,
Last_Name VARCHAR(30) NOT NULL,
DOB DATE,
Salary NUMERIC(25, 2) NOT NULL,
Department_id CHAR(10)
);


1)	Create View of name emp_view and the column would be Employee_id, Last_Name, salary and department_id only.

                CREATE VIEW emp_view AS
       SFLECT Employee_id, Last_Name, Salary, Department_id
       FROM EMPLOYEES
