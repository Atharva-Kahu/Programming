-- 1731. The Number of Employees Which Report to Each Employee
-- Solved
-- Easy
-- Topics
-- premium lock icon
-- Companies
-- SQL Schema
-- Pandas Schema
-- Table: Employees

-- +-------------+----------+
-- | Column Name | Type     |
-- +-------------+----------+
-- | employee_id | int      |
-- | name        | varchar  |
-- | reports_to  | int      |
-- | age         | int      |
-- +-------------+----------+
-- employee_id is the column with unique values for this table.
-- This table contains information about the employees and the id of the manager they report to. Some employees do not report to anyone (reports_to is null). 
 

-- For this problem, we will consider a manager an employee who has at least 1 other employee reporting to them.

-- Write a solution to report the ids and the names of all managers, the number of employees who report directly to them, and the average age of the reports rounded to the nearest integer.

-- Return the result table ordered by employee_id.

-- The result format is in the following example.

 

-- Example 1:

-- Input: 
-- Employees table:
-- +-------------+---------+------------+-----+
-- | employee_id | name    | reports_to | age |
-- +-------------+---------+------------+-----+
-- | 9           | Hercy   | null       | 43  |
-- | 6           | Alice   | 9          | 41  |
-- | 4           | Bob     | 9          | 36  |
-- | 2           | Winston | null       | 37  |
-- +-------------+---------+------------+-----+
-- Output: 
-- +-------------+-------+---------------+-------------+
-- | employee_id | name  | reports_count | average_age |
-- +-------------+-------+---------------+-------------+
-- | 9           | Hercy | 2             | 39          |
-- +-------------+-------+---------------+-------------+
-- Explanation: Hercy has 2 people report directly to him, Alice and Bob. Their average age is (41+36)/2 = 38.5, which is 39 after rounding it to the nearest integer.
-- Example 2:

-- Input: 
-- Employees table:
-- +-------------+---------+------------+-----+ 
-- | employee_id | name    | reports_to | age |
-- |-------------|---------|------------|-----|
-- | 1           | Michael | null       | 45  |
-- | 2           | Alice   | 1          | 38  |
-- | 3           | Bob     | 1          | 42  |
-- | 4           | Charlie | 2          | 34  |
-- | 5           | David   | 2          | 40  |
-- | 6           | Eve     | 3          | 37  |
-- | 7           | Frank   | null       | 50  |
-- | 8           | Grace   | null       | 48  |
-- +-------------+---------+------------+-----+ 
-- Output: 
-- +-------------+---------+---------------+-------------+
-- | employee_id | name    | reports_count | average_age |
-- | ----------- | ------- | ------------- | ----------- |
-- | 1           | Michael | 2             | 40          |
-- | 2           | Alice   | 2             | 37          |
-- | 3           | Bob     | 1             | 37          |
-- +-------------+---------+---------------+-------------+

# Write your MySQL query statement below
SELECT E1.Employee_id, E1.name, Count(E2.Employee_id) AS reports_count, ROUND(AVG(E2.age),0) as average_age
FROM Employees E1 JOIN Employees E2 ON E1.employee_id = E2.reports_to
GROUP BY E1.Employee_id
ORDER BY employee_id;


select e1.employee_id,e1.name,count(e2.reports_to) reports_count,round(avg(e2.age*1.00),0) average_age
from employees e1 inner join employees e2 on e2.reports_to=e1.employee_id
group by e1.employee_id,e1.name
order by e1.employee_id;