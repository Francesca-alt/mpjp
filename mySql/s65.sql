
drop procedure if exists condition_example;

delimiter //

create procedure condition_example()
begin
	declare v_a integer default 1; -- con default inizializzo;
	declare v_b varchar(20); -- declare dichiaro variabile;
	declare v_c varchar(20);

	if v_a > 0 then
		set v_b = 'v_a is positive';
	elseif v_a = 0 then
		set v_b = 'v_a is zero';
	else
		set v_b = 'v_a is negative';
	end if;

	case v_a -- verifico valore su v_a e poi inizializzo v_c; qualunque sia il valore iniziale di v_a devo avere qualcosa di sensato in v_c;
		when -1 then
			set v_c = 'v_a is minus one';
		when 0 then
			set v_c = 'v_a is zero';
		when 1 then
			set v_c = 'v_a is plus one';
		else
			set v_c = 'v_a is unknown';
	end case;

	select v_b as 'if message', v_c as 'switch message';
end;

// delimiter ;

call condition_example(); -- eseguo questo. dopo questo comando visualizzo la tabella;
