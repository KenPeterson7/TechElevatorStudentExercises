-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT state_name, population FROM state ORDER BY population DESC;

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT * FROM state ORDER BY census_region DESC, state_name ASC;

-- The biggest park by area
SELECT park_name, area
FROM park
ORDER BY area DESC;


-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT city_name, population
FROM city
ORDER BY population DESC
LIMIT 10;


-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
SELECT park_name, date_established
FROM park
ORDER BY date_established ASC
LIMIT 20;


-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
SELECT city_name || ', ' || state_abbreviation
FROM city;

-- The all parks by name and date established.
SELECT park_name || ' ' || date_established
FROM park;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
SELECT census_region || ':' || state_name AS census_state_wild_west
FROM state
WHERE census_region = 'West' OR census_region = 'Midwest';


-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG(population) AS average_population
FROM state;

-- Total population in the West and South census regions
SELECT SUM(population) AS south_and_west_population
FROM state
WHERE census_region IN('West', 'South');


-- The number of cities with populations greater than 1 million
SELECT COUNT(population)
FROM city
WHERE population > 1000000;

-- The number of state nicknames.
SELECT COUNT(state_nickname) AS number_of_state_nicknames, COUNT(*) AS another_count
FROM state;

-- The area of the smallest and largest parks.
SELECT MIN(area) AS min_area, MAX(area) AS max_area
FROM park;


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT COUNT(city_name) AS cities, state_abbreviation
FROM city
GROUP BY state_abbreviation
ORDER BY cities DESC;

-- Determine the average park area depending upon whether parks allow camping or not.
SELECT AVG(area) AS average_park_area, has_camping
FROM park
GROUP BY has_camping;


-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT SUM(population) AS avg_city_population, state_abbreviation
FROM city
GROUP BY state_abbreviation;

-- The smallest city population in each state ordered by city population.
SELECT city_name, MIN(population) AS min_population, state_abbreviation
FROM city
GROUP BY city_name, state_abbreviation
ORDER BY min_population;


-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)
SELECT city_name, population
FROM city
ORDER BY city_name
OFFSET 0 ROWS FETCH NEXT 10 ROWS ONLY;


-- SUBQUERIES (optional)

-- Include state name rather than the state abbreviation while counting the number of cities in each state,
SELECT COUNT(city_name) AS number_of_cities_in_state,
       (
           SELECT state_name FROM state WHERE state_abbreviation = c.state_abbreviation
       ) AS state_name
FROM city AS c
GROUP BY state_abbreviation
ORDER BY number_of_cities_in_state DESC;


-- Include the names of the smallest and largest parks
SELECT park_name, area
FROM park p,(
    SELECT MIN(area) AS smallest, MAX(area) AS largest
    FROM park
    WHERE area > 0
) as sl
WHERE p.area = sl.smallest OR p.area = sl.largest;


-- List the capital cities for the states in the Northeast census region.
SELECT state_abbreviation, city_name
FROM city
WHERE city_id IN(
    SELECT capital
    FROM state
    WHERE census_region = 'Northeast'
)
ORDER BY state_abbreviation;
