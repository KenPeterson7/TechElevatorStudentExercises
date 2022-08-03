-- 1. The titles and release dates of movies that Tom Hanks has appeared in (47 rows)

select title, release_date from movie
join movie_actor on movie.movie_id = movie_actor.movie_id
join person on movie_actor.actor_id = person.person_id
where person_id = 31;