-- esercizio 2
-- select first_name,last_name, salary, (salary + salary/100 *8.5 (salary-  
-- from employees;

-- select first_name, last_name, salary, truncate(salary/100*8.5 as 'delta'), truncate (salary +salary/100*8.5 as 'salary +8.5%'),
-- from employees;


select hire date, datediff(curdate(), now())
from employees;