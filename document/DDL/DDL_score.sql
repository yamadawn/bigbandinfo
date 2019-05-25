drop table score;

create table score(
	score_id	  integer			    not null,
	song_name     character varying	    not null,
	arranger_id   integer,
	del_flg		  boolean			    not null
);