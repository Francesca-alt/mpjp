
insert into coders (coder_id,first_name,last_name,hire_date,salary)
value(201,'Maria','Rossi', curdate(), 5000);

insert into coders (coder_id,first_name,last_name,hire_date,salary)
 value( 202, 'Franco', 'Bianchi', curdate(), 4500);

-- cambiare il nome
update coders
set first_name= 'Mariangela'
where first_name= 'Maria';

-- aumentare di 500 euro
update coders
set salary = salary +500
where salary <6000;

delete from coders
where coder_id= 202;