-- 17. The titles and taglines of movies that are in the "Family" genre and Samuel L. Jackson has acted in (4 rows)


select title, tagline from movie
join movie_genre on movie_genre.movie_id = movie.movie_id
join genre on movie_genre.genre_id = genre.genre_id
join movie_actor on movie.movie_id = movie_actor.movie_id
join person on movie_actor.actor_id = person.person_id
where genre_name = 'Family' and person_name = 'Samuel L. Jackson'
