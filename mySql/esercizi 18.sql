select STREET_ADDRESS, postal_code, city ,state_province, country_name
from locations join countries
using(country_id);

select first_name, last_name, EMPLOYEE_ID, DEPARTMENT_NAME
from employees join departments
using(department_id);

select first_name, last_name, department_name, city
from employees join departments using(department_id)
join locations using(location_id)
where city= 'Toronto';

select FIRST_NAME, LAST_NAME, HIRE_DATE
from employees
where HIRE_DATE>(select hire_date  from employees where last_name = 'Lee');

select FIRST_NAME, LAST_NAME, HIRE_DATE
from employees
where HIRE_DATE<(select e.LAST_NAME as employee, m.LAST_NAME as manager from employees e join employees m on (e.MANAGER_ID=m.EMPLOYEE_ID));

select count(employee_id)
from employees
where first_name= 'David' and last_name = 'Lee';

-- chi ha lo stesso manager di Lisa Ozer


-- chi lavora in un department in cui c'è almeno un employee con una'u' nel cognome
select first_name, last_name
from employees
where department_id in 
(select distinct department_id from employees where last_name like '%u%')

-- chi lavora nel department Shipping

-- chi ha come manager Steven King
