create table person 
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);

insert into PERSON (id,name,location,birth_date) 
values(10001,'Divya','Bangalore',CURRENT_TIMESTAMP());

insert into PERSON (id,name,location,birth_date) 
values(10002,'Shiva','Bangalore',CURRENT_TIMESTAMP());

insert into PERSON (id,name,location,birth_date) 
values(10003,'Raghav','Bangalore',CURRENT_TIMESTAMP());

insert into PERSON (id,name,location,birth_date) 
values(10004,'Maha','Chennai',CURRENT_TIMESTAMP());