# Write your MySQL query statement below
select p.product_name, s.year, s.price
from Product as p, Sales as s
where p.product_id = s.product_id