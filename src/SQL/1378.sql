SELECT unique_id
     , name
FROM Employees emp
         LEFT JOIN EmployeeUNI uni ON emp.id = uni.id