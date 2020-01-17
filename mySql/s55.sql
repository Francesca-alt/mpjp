-- create table by select
create table coders
as
    select employee_id as coder_id, first_name, last_name, hire_date, salary
    from employees
    where department_id = 60;
-- coder_id non è primary key

-- when in doubt, do not run this one
drop table coders; -- elimina la tabella