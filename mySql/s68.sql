-- cursor

use me;

drop procedure if exists email_coders;

delimiter //

create procedure email_coders()
begin
	declare v_done boolean default false;
	declare v_first_name varchar(20);
	declare v_last_name varchar(25);
	declare v_mailing_list varchar(1000) default ''; -- mi voglio creare lista di email da mandare

	declare cur_coders cursor for -- dichiarazione di un cursore, tra declare e cursor ci metto il nome della mia variabile cur_coders
		select first_name, last_name from coders; -- come popolare il mio cursore;
	declare continue handler for not found -- dichiaro che se non c'è la riga successiva devi mettere
		set v_done = true; -- v_done=true

	open cur_coders; -- apri il cursore vuol dire fai la select
	while not v_done do
		fetch cur_coders into v_first_name, v_last_name; -- prendi il cursore leggi la riga corrente e mettici queste variabili
		set v_mailing_list = concat(v_mailing_list,
			lower(v_first_name), "." , lower(v_last_name), "@x.dd;"); -- estensione aziendale e metti tutto nella stessa stringa
	end while;

	select v_mailing_list as "mailing list";

    close cur_coders;
end;

// delimiter ;

call email_coders(); -- chiamo codice da mysql
