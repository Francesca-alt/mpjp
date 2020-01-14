select FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE
from employees
order by last_name, first_name;

select FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE
from employees
where FIRST_NAME = 'David ' or FIRST_NAME='Peter';

select FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE
from employees
where department_id=60;

select FIRST_NAME, DEPARTMENT_ID
from employees
where DEPARTMENT_ID=30 or DEPARTMENT_ID=50;

select FIRST_NAME, LAST_NAME, SALARY
from employees
where salary > 10000;

select FIRST_NAME, LAST_NAME, SALARY
from employees
where (salary < 4000) or (salary > 15000);

select FIRST_NAME, LAST_NAME, SALARY, DEPARTMENT_ID
from employees
where  (salary < 4000 or salary > 15000) and (department_id= 50 or department_id =80);

select FIRST_NAME, LAST_NAME,  HIRE_DATE
from employees
where HIRE_DATE between'2005.01.01' and '2006.01.01';

select distinct JOB_ID
from employees;

select FIRST_NAME, LAST_NAME
from employees
where COMMISSION_PCT is null;

select FIRST_NAME, LAST_NAME
from employees
where last_name like'a%' or first_name like 'a%';

select DEPARTMENT_NAME
from departments
order by DEPARTMENT_NAME;

select LOCATION_ID, STATE_PROVINCE, COUNTRY_ID
from locations
where COUNTRY_ID= 'IT';

