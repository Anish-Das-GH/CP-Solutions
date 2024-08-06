/* Write your PL/SQL query statement below */
select d.Name as Department, e.Name as Employee, e.Salary
from Department d inner join Employee e on d.Id = e.DepartmentId
where (e.Salary, e.DepartmentId)  in (select max(Salary), DepartmentId from Employee group by DepartmentId)