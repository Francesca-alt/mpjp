-- exercise 1 salary
select max(salary), min(salary), sum(salary), avg(salary)
from employees;

-- exercise 1 with job_id
select JOB_ID, max(salary), min(salary), sum(salary), avg(salary)
from employees
group by(job_id);

-- exercise 2 
select JOB_ID, count(EMPLOYEE_ID)
from employees
group by(job_id);

select JOB_ID, count(job_id)
from employees
where( JOB_ID= 'it_prog');

-- exercise 3 quanti sono i manager
select count( distinct MANAGER_ID) -- count è una funzione quindi ignora il null;
from employees;

-- exercise 4 dipendenti non manager
select FIRST_NAME, LAST_NAME
from employees
where employee_id not in( select distinct manager_id from employees where manager_id is not null);

-- esercizio 5 differenza max.salary e min.salary
select max(salary) - min(salary) as difference
from employees;

select max(salary) - min(salary) as delta
from employees
group by(job_id);
having


