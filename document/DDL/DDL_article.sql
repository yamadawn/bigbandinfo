drop table article;

create table article(
	article_id	 integer		  			not null,
	title		 character  varying 		not null,
	overview	 character  varying 		not null,
	content1	 character  varying 				,
	content2	 character  varying 				,
	content3	 character  varying 				,
	content4	 character  varying 				,
	content5	 character  varying 				,
	img_url1	 character  varying 				,
	img_url2	 character  varying					,
	img_url3	 character  varying					,
	img_url4	 character  varying					,
	img_url5	 character  varying					,
	inst_ymd	 date			 			not null,
	del_flg		 boolean	   				not null
);