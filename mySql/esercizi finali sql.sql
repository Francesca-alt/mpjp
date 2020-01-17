-- scrivere e invocare la procedura tomorrow() che stampa la data di domani
delimiter // 
create procedure tomorrow()
begin
select date_add(curdate(), interval 1 day) as tomorrow;
end;

// delimiter ;

call tomorrow();

drop procedure if exists tomorrow;

-- modifica tomorrow per fargli accettare come parametro un nome da stampare

delimiter //
create procedure tomorrow(
in p_first_name varchar(20)
)begin
select date_add(curdate(), interval 1 day) as tomorrow, 
p_first_name;
end;

// delimiter ;
call tomorrow('Noemi');

-- scrivere e invocare la procedura get_coder() che ritorna nome e cognome di un coder identificato via id

delimiter //
create procedure get_coder(
in p_coder_id integer,
out p_fist_name varchar(40),
out p_last_name varchar(40)
)begin
select first_name, last_name from coders
where coder_id=p_coder_id;
end;

// delimiter ;
call get_coder(103, @result, @result);
select @result;