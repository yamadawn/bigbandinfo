drop table place;

create table place(
	place_id				   integer					 	 not null					 ,
	place_name				 character varying	 not null					 ,
	address						 character varying										 ,
	place_clsf				 integer						 not null					 ,
	memo							 character varying										 ,
	wifi_flg					 boolean															 ,
	station_code1			 character varying										 ,
	station_code2			 character varying										 ,
	station_code3			 character varying										 ,
	station_code4			 character varying										 ,
	station_code5			 character varying										 ,
	evaluation_item1	 integer 						 default 0 not null,	
	evaluation_item2	 integer 						 default 0 not null,	
	evaluation_item3	 integer 						 default 0 not null,	
	evaluation_item4	 integer 						 default 0 not null,	
	evaluation_item5	 integer 						 default 0 not null,	
	evaluation_item6	 integer 						 default 0 not null,
	img_url1					 character varying										 ,
	img_url2					 character varying										 ,
	img_url3				 	 character varying										 ,
	img_url4				 	 character varying										 ,
	img_url5				 	 character varying										 ,
	hour_fee1				 	 integer															 ,
	hour_fee2				 	 integer															 ,
	hour_fee3				 	 integer															 ,
	hour_fee4				 	 integer															 ,
	hour_fee5				 	 integer
);