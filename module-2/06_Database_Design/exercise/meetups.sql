Begin;

drop table if exists members, meetup_group, events, members_meetup_group, members_events cascade;

create table members(
member_id serial,
first_name varchar(30) not null,
last_name varchar(30) not null,
email varchar(50) not null,
phone_number varchar(11),
has_email_reminder boolean not null,
date_of_birth date not null,
constraint pk_member primary key(member_id)
);


create table meetup_group(
group_id serial,
group_name varchar(50) not null unique,
--member_id int not null,
constraint pk_meetup_group primary key(group_id)
--constraint fk_meetup_group_member foreign key (member_id) references members(member_id)
);

create table events(
event_id serial,
event_name varchar(50) not null,
description varchar(150),
start_dt timestamp not null,
duration int not null check(duration >= 30),
group_id int not null,
--member_id int not null,
constraint pk_events primary key(event_id),
--constraint fk_events_members foreign key (member_id) references members(member_id)
constraint fk_events_meetup_group foreign key (group_id) references meetup_group(group_id)
);

create table members_meetup_group(
member_id int not null,
group_id int not null,
constraint pk_members_meetup_group primary key(member_id, group_id),
constraint fk_members_meetup_group_members foreign key(member_id) references members(member_id),
constraint fk_members_meetup_group_meetup_group foreign key(group_id) references meetup_group(group_id)
);


create table members_events(
member_id int not null,
event_id int not null,
constraint pk_members_events primary key(member_id, event_id),
constraint fk_members_events_members foreign key(member_id) references members(member_id),
constraint fk_members_events_events foreign key(event_id) references events(event_id)
);


commit;