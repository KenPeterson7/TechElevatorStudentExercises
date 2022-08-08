-- insert into members(first_name, last_name, email, phone_number, has_email_reminder, date_of_birth)
-- values('Michael', 'Jordan', 'Goat23@gmail.com', '5134756633', true, '01/01/1965'),
-- 	  ('Larry', 'Bird', 'CelticsLegend@gmail.com', '5138359584', false, '02/02/1952'),
-- 	  ('Magic', 'Johnson', 'LakerLegend@gmail.com', '5138592759', false, '03/03/1960'),
-- 	  ('Tim', 'Duncan', 'SpursLegend@yahoo.com', '5492359224', true, '04/04/1981'),
-- 	  ('Lebron', 'James', 'NewGoat@gmail.com', '5138429392', true, '05/05/1984'),
-- 	  ('Kobe', 'Bryant', '24Legend@yahoo.com', '7853238829', false, '06/06/1979'),
-- 	  ('Kevin', 'Love', 'CavsChamp@hotmail.com', '4892358523', false, '07/07/1987'),
-- 	  ('Kevin', 'Durant', 'TwoTimeChamp@gmail.com', '5138359320', true, '08/08/1989');
	  

-- insert into meetup_group(group_name)
-- values('The Goat Group'),
-- 	  ('The Champions Group'),
-- 	  ('The Lakers Group');


-- insert into events(event_name, description, start_dt, duration, group_id)
-- values('The first event', 'This is the description for the first event.', '01/01/2012', 35, 1),
-- 	  ('The Second event', 'Description for the 2nd event', '03/12/2015', 45, 2),
-- 	  ('The Third event', '3rd event description for testing', '05/05/2017', 60, 3),
-- 	  ('The Fourth event', 'Finally the final event description', '08/09/2020', 90, 1);
	    
select * from events;
select * from meetup_group
select * from members;
select * from members_meetup_group;
select * from members_events;

insert into members_meetup_group(member_id, group_id)
values(1, 1),
	  (2, 1),
	  (3, 2),
	  (4, 2),
	  (5, 3),
	  (6, 3);
	  
	  
insert into members_events(member_id, event_id)
values(1, 1),
	  (2, 2),
	  (3, 3),
	  (4, 4);
