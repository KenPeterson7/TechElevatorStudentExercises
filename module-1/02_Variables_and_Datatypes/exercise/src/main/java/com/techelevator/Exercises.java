package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;

		System.out.println(birdsRemaining);

        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

		System.out.println(numberOfExtraBirds);

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int racoons = 3;
		int dinner = 2;
		int numberOfRacoonsLeft = racoons - dinner;

		System.out.println(numberOfRacoonsLeft);


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int numberOfFlowersLessBees = flowers - bees;



        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */

		int lonelyPigeon = 1;
		int otherPigeon = 1;
		int totalPigeon = lonelyPigeon + otherPigeon;


        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int ogOwlsOnFence = 3;
		int newOwlsOnFence = 2;
		int totalOwlsOnFence = ogOwlsOnFence + newOwlsOnFence;


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaverWorker = 2;
		int beaverSwim = 1;
		int beaverRemaining = beaverWorker - beaverSwim;


        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansOnLimb = 2;
		int toucansJoin = 1;
		int totalToucans = toucansOnLimb + toucansJoin;


        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		int difference = squirrels - nuts;


        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarter = .25;
		double dime = .1;
		double nickel = .05;
		double total = quarter + dime + (2 * nickel);


        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int brier = 18;
		int macAdams = 20;
		int flannery = 17;
		int firstGradeTotal = brier + macAdams + flannery;


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyo = .24;
		double whistle = .14;
		double totalOfToys = yoyo + whistle;


        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int riceKrisp = 5;
		int largeMarsh = 8;
		int miniMarsh = 10;
		int totalMarsh = largeMarsh + miniMarsh;


        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int hilt = 29;
		int brecknock = 17;
		int differenceSnow = hilt - brecknock;



        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		double hasMoney = 10;
		double spendTruck = 3;
		double spendPencilCase = 2;
		double totalMoney = hasMoney - (spendTruck + spendPencilCase);



        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int ogMarbles = 16;
		int lostMarbles = 7;
		int totalMarbles = ogMarbles - lostMarbles;


        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int seaShells = 19;
		int seaShellsNeeded = 25 - seaShells;

        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int hadBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = 17 - redBalloons;

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int martaBooks = 10;
		int totalBooks = booksOnShelf + martaBooks;



        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6;
		int numberOfBees = 8;
		int totalLegs = beeLegs * numberOfBees;


        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double boughtCone = .99;
		double twoCones = boughtCone * 2;


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalRocks = 125;
		int currentRocks = 64;
		int neededRocks = totalRocks - currentRocks;


        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hadMarblesAvail = 38;
		int lostMarblesAvail = 15;
		int newTotalMarble = hadMarblesAvail - lostMarblesAvail;


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int concertDrive = 78;
		int stopDrive = 32;
		int leftDrive = concertDrive - stopDrive;


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
		int shovelSnowSatMorn = 90;
		int shovelSnowSatAfter = 45;
		int totalShovel = shovelSnowSatAfter + shovelSnowSatMorn;



        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double hotDog = 6;
		double cost = .5;
		double totalHotDogCost = hotDog * cost;


        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double hasCash = .5;
		double pencil = .07;
		int totalPencilsPurchase = (int) (hasCash / pencil);


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int sawButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = sawButterflies - orangeButterflies;


        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double gaveClerk = 1.00;
		double candyCost = .54;
		double changeOwed = gaveClerk - candyCost;


        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int hasTrees = 13;
		int plants = 12;
		int totalTrees = hasTrees + plants;


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysToSeeGranny = 2;
		int hoursInOneDay = 24;
		int totalTimeToSeeGranny = daysToSeeGranny * hoursInOneDay;


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int hasCousins = 4;
		int gumPerPerson = 5;
		int totalGumNeed = hasCousins * gumPerPerson;


        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double hasMula = 3.00;
		double boughtCandy = 1.00;
		double remainderMoney = hasMula - boughtCandy;


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsInLake = 5;
		int peopleOnBoat = 3;
		int totalPeople = boatsInLake * peopleOnBoat;


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int hadLegos = 380;
		int lostLegos = 57;
		int remainingLegos = hadLegos - lostLegos;


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int bakedMuffins = 35;
		int remainingBake = 83 - bakedMuffins;


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayon = 1400;
		int lucyCrayon = 290;
		int willyMoreCrayonNumber = willyCrayon - lucyCrayon;


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10;
		int pages = 22;
		int totalStickers = stickersOnPage * pages;


        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		double cupcakes = 100;
		double children = 8;
		double cupcakeSplit = (int) cupcakes / children;


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
		int gingerBread = 47;
		int jar = 6;
		int notPlaced = gingerBread % jar;


        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
		int croissant = 59;
		int neighbor = 8;
		int leftOverCroissant = croissant % neighbor;


        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int placeOnTray = 12;
		int totalCookiesNeeded = 276;
		int totalTraysNeeded = totalCookiesNeeded / placeOnTray;


        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzel = 480;
		int serving = 12;
		int preppedServings = pretzel / serving;


        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int bakedLemon = 53;
		int leftAtHome = 2;
		int box = 3;
		int givenAway = (bakedLemon - leftAtHome) / box;



        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotStick = 74;
		int servingCarrot = 12;
		int carrotLeft = carrotStick % servingCarrot;


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBear = 98;
		int shelf = 7;
		int totalShelvesFilled = teddyBear / shelf;


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int album = 20;
		int totalAlbum = 480;
		int needAlbum = totalAlbum / album;


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int collectedCard = 94;
		int boxHold = 8;
		int boxFilled = collectedCard / boxHold;
		int unFilled = collectedCard % boxHold;

		System.out.println(boxFilled);
		System.out.println(unFilled);


        /* Exercise 49
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int books = 210;
		int shelves = 10;
		int booksPerShelf = books / shelves;


        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double bakedCroissants = 17;
		double guests = 7;
		double servedEqual = bakedCroissants / guests;


	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 12 x 14 rooms?
	    Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
	    */
		double billPaint = 2.15;
		double jillPaint = 1.90;
		double billHour = 1 / billPaint;
		double jillHour = 1 / jillPaint;
		double combinedRate = billHour + jillHour;
		double timePaintRoom = 5 / combinedRate;






	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
		String firstName = "Hopper";
		String lastName = "Grace";
		String middleInitial = "B";
		String fullName = firstName + ", " + lastName + " " + middleInitial + ".";


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
		double distance = 800;
		double travel = 537;
		int percentageCompleted = (int)(100 * (travel / distance));






	}

}
