-- self join
select concat(e.first_name, ' ', e.last_name) as employee,
 concat(m.first_name, ' ', m.last_name) as manager
from employees e join employees m -- immagina di avere due tabelle;
on (e.manager_id = m.employee_id);

-- "classic" self join
select e.last_name as employee, m.last_name as manager
from employees e, employees m
where e.manager_id = m.employee_id;
