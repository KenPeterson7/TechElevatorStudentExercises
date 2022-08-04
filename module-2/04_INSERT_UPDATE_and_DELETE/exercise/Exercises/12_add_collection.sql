-- 12. Create a "Bill Murray Collection" in the collection table. For the movies that have Bill Murray in them, set their collection ID to
-- the "Bill Murray Collection". (1 row, 6 rows)

-- inserts the Bill Murray Collection into the collection table
insert into collection(collection_name) values('Bill Murray Collection');
-- update the movie table and set the collection id equal to the new collection id that was created during the Bill Murray insert
update movie set collection_id = (select collection_id from collection where collection_name = 'Bill Murray Collection')
-- where movie id is within this subquery (which joins the person table to the movie actor table and specifies the person as Bill Murray)
where movie_id in(select movie_id from movie_actor join person on movie_actor.actor_id = person.person_id where person_name = 'Bill Murray');






