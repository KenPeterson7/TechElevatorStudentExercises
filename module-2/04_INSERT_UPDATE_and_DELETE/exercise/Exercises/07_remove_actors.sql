-- 7. Remove the actor appearances in "Avengers: Infinity War" (14 rows) Note: Don't remove the actors themeselves, just make it so it seems no one appeared in the movie.


delete from movie_actor
where movie_id = 299536 and actor_id in(3223, 74568, 16828, 1245, 71580, 1136406, 172069, 1896, 8691, 543261, 550843, 6162, 53650, 60898);
