1.	List the Deptno where there are no emps. 
  
SELECT DEPTNO
FROM DEPT
WHERE DEPTNO NOT IN (SELECT DISTINCT DEPTNO FROM EMP);


2.	List the No.of emp’s and Avg salary within each department for each job. 

SELECT DEPTNO, JOB, COUNT(*) AS "No. of Emps", AVG(SAL) AS "Avg Salary"
FROM EMP
GROUP BY DEPTNO, JOB;


3.	Find the maximum average salary drawn for each job except for ‘President’. 

SELECT JOB, MAX(AVG_SALARY) AS "Max Avg Salary"
FROM (
    SELECT JOB, AVG(SAL) AS AVG_SALARY
    FROM EMP
    WHERE JOB <> 'PRESIDENT'
    GROUP BY JOB
)
GROUP BY JOB;


4.	List the department details where at least two emps are working. 

SELECT DEPTNO, DNAME, LOC
FROM DEPT
WHERE DEPTNO IN (
    SELECT DEPTNO
    FROM EMP
    GROUP BY DEPTNO
    HAVING COUNT(*) >= 2
);


5.	List the no. of emps in each department where the no. is more than 3. 

SELECT DEPTNO, COUNT(*) AS "No. of Emps"
FROM EMP
GROUP BY DEPTNO
HAVING COUNT(*) > 3;

