-- INNER JOIN

-- Write a query to retrieve the name and state abbreviation for the 2 cities named "Columbus" in the database

select * from city

select city_name, state_abbreviation from city where city_name = 'Columbus';


-- Modify the previous query to retrieve the names of the states (rather than their abbreviations).

select * from state;

select city_name, state_name from city
join state on state.state_abbreviation = city.state_abbreviation
where city_name = 'Columbus';

-- Write a query to retrieve the names of all the national parks with their state abbreviations.
-- (Some parks will appear more than once in the results, because they cross state boundaries.)

select * from park;
select * from park_state;

select park_id, state_abbreviation from park_state;

select park_name, state_abbreviation from park
join park_state on park_state.park_id = park.park_id


-- The park_state table is an associative table that can be used to connect the park and state tables.
-- Modify the previous query to retrieve the names of the states rather than their abbreviations.

select park_name, state_name from park
join park_state on park_state.park_id = park.park_id
join state on state.state_abbreviation = park_state.state_abbreviation


-- Modify the previous query to include the name of the state's capital city.

select park_name, state_name, city_name 
from park
join park_state on park_state.park_id = park.park_id
join state on state.state_abbreviation = park_state.state_abbreviation
join city on city.city_id = state.capital;

-- Modify the previous query to include the area of each park.

select park_name, state_name, city_name, park.area as park_area
from park
join park_state on park_state.park_id = park.park_id
join state on state.state_abbreviation = park_state.state_abbreviation
join city on city.city_id = state.capital;


-- Write a query to retrieve the names and populations of all the cities in the Midwest census region.

select * from city;

select city_name, city.population from city
join state on state.state_abbreviation = city.state_abbreviation
where census_region = 'Midwest';

-- Write a query to retrieve the number of cities in the city table for each state in the Midwest census region.

select count(city_name), state_name from city
join state on city.state_abbreviation = state.state_abbreviation
where census_region = 'Midwest'
group by state_name

-- Modify the previous query to sort the results by the number of cities in descending order.

select count(city_name), state_name from city
join state on city.state_abbreviation = state.state_abbreviation
where census_region = 'Midwest'
group by state_name
order by count(city_name) desc;


-- LEFT JOIN

-- Write a query to retrieve the state name and the earliest date a park was established in that state (or territory) for every record 
-- in the state table that has park records associated with it.

select state_name, min(date_established) as oldest_park
from state
join park_state on state.state_abbreviation = park_state.state_abbreviation
join park on park_state.park_id = park.park_id
group by state_name;

-- Modify the previous query so the results include entries for all the records in the state table, even if they have no park records associated with them.

select state_name, min(date_established) as oldest_park
from state
left join park_state on state.state_abbreviation = park_state.state_abbreviation
left join park on park_state.park_id = park.park_id
group by state_name;

-- UNION

-- Write a query to retrieve all the place names in the city and state tables that begin with "W" sorted alphabetically. (Washington is the name of a city and a state--how many times does it appear in the results?)

select city_name as place_name from city where city_name like 'W%' 
Union
select state_name as place_name from state where state_name like 'W%' order by place_name;

-- Modify the previous query to include a column that indicates whether the place is a city or state.

select city_name as name_of_place, 'City' as kind_of_place from city where city_name like 'W%' 
Union all
select state_name as name_of_place, 'State' from state where state_name like 'W%' order by name_of_place;


-- MovieDB
-- After creating the MovieDB database and running the setup script, make sure it is selected in pgAdmin and confirm it is working correctly by writing queries to retrieve...

-- The names of all the movie genres
select genre_name from genre;

-- The titles of all the Comedy movies

select title from movie
join movie_genre on movie.movie_id = movie_genre.movie_id
join genre on genre.genre_id = movie_genre.genre_id
where genre_name = 'Comedy'
