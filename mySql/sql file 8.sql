select e.first_name, e.last_name, d.department_name
from employees e join departments d
using(department_id);

-- oppure select first.name, last.name, department_name
-- from employees join departments
-- using(department_id);

select first_name, last_name, department_name, job_title
from employees e join jobs
using(job_id);

select first_name, last_name, job_title, salary
from employees join jobs
using( job_id)
where( salary= MIN_SALARY) or (salary= MAX_SALARY);

select FIRST_NAME,LAST_NAME, COUNTRY_ID
from employees join departments
using(department_id) join locations
using(location_id) 
where(COUNTRY_ID='UK');

select DEPARTMENT_NAME,FIRST_NAME, LAST_NAME
from departments d join employees
on( d.MANAGER_ID = EMPLOYEE_ID);


-- esercizi 2

-- nome di ogni department,e se c'è manager (anche null)
select DEPARTMENT_NAME, FIRST_NAME, LAST_NAME
from departments  left outer join employees
on(MANAGER_ID= employee_id);

-- nome dei department che non hanno manager

select DEPARTMENT_NAME, MANAGER_ID
from departments
where MANAGER_ID is null;

-- nome degli impiegati associato ai loro manager

select e.last_name as employee, m.last_NAME as manager
from employees e join employees m
on(e.MANAGER_ID= m.EMPLOYEE_ID); -- mi permette di unire che ad ogni riga di employees coincide un suo manager;
