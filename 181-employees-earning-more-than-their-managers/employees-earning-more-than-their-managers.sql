/* Write your PL/SQL query statement below */
SELECT e1.name as Employee FROM
employee e1 INNER JOIN employee e2 ON e1.managerid = e2.id AND e1.salary > e2.salary