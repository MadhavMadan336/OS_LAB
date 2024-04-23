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


2)	Insert values into view(remove the NOT NULL constraint and then insert values).
ALTER TABLE EMPLOYEES MODIFY (Salary NULL);
INSERT INTO EMPLOYEES (Employee_id,First_Name, Last_Name, Salary, Department_id)
VALUES ('EMP007', 'Johnson','Malik', NULL, 'D001');

3)	Modify, delete and drop operations are performed on view.
 UPDATE emp_view
SET Salary = Salary * 1.1
WHERE Department_id = 'D001';

 DELETE FROM emp_view
WHERE Department_id = 'D003';

 DROP VIEW IF EXISTS emp_view;


4)	Creates a view  named salary_view. The view shows the employees in department 20 and their annual salary.
      CREATE VIEW salary_view AS
      SELECT Employee_id, Last_Name, Salary * 12 AS Annual_Salary
      FROM EMPLOYEES
      WHERE Department_id = '20';


