SELECT 
    CurrentStatus.EMPID_SEQ,
    CurrentStatus.Status AS CurrentStatus,
    NextStatus.Status AS NextStatus
FROM 
    EmployeeStatus AS CurrentStatus
LEFT JOIN 
    EmployeeStatus AS NextStatus ON CurrentStatus.EMPID_SEQ = NextStatus.EMPID_SEQ
    AND CurrentStatus.ChangeDate = (
        SELECT MAX(ChangeDate)
        FROM EmployeeStatus
        WHERE EMPID_SEQ = CurrentStatus.EMPID_SEQ
    )
    AND NextStatus.ChangeDate = (
        SELECT MIN(ChangeDate)
        FROM EmployeeStatus
        WHERE EMPID_SEQ = NextStatus.EMPID_SEQ
        AND ChangeDate > CurrentStatus.ChangeDate
    );
