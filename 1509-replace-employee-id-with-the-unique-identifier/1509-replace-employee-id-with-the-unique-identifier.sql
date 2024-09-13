-- # Write your MySQL query statement below
-- Select EmployeeUNI.unique_id,Employees.name 
-- from EmployeeUNI
-- JOIN Employees on Employees.id = EmployeeUNI.id 

Select EmployeeUNI.unique_id,Employees.name 
from EmployeeUNI
Right JOIN Employees on Employees.id = EmployeeUNI.id 