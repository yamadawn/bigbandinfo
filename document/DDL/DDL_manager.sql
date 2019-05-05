drop table manager;

create table manager(

	manager_id 		 integer			 not null,
	login_id 		 character varying	 not null,
	password		 character varying	 not null,
	manager_name	 character varying	  		 ,
	del_flg			 boolean			 not null default false 		
);