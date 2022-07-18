package com.techelevator;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");
        ReserveAuction reserveAuction = new ReserveAuction("Syracuse Dunks", 200);
        BuyoutAuction buyoutAuction = new BuyoutAuction("Tech Elevator Laptop", 50);

        generalAuction.placeBid(new Bid("Joshua", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

/*        reserveAuction.placeBid(new Bid("Frank", 20));
        System.out.println(reserveAuction.getHighBid().toString());
        System.out.println(reserveAuction.getAllBids().toString());

        reserveAuction.placeBid(new Bid("Ozzie", 300));
        System.out.println(reserveAuction.getHighBid().toString());
        System.out.println(reserveAuction.getAllBids().toString());

        reserveAuction.placeBid(new Bid("Shedrick", 275));
        System.out.println(reserveAuction.getHighBid().toString());
        System.out.println(reserveAuction.getAllBids().toString());*/

        System.out.println(buyoutAuction.getBuyoutPrice());

        buyoutAuction.placeBid(new Bid("Mikey", 5));
        System.out.println(buyoutAuction.getHighBid().toString());
        System.out.println(buyoutAuction.getAllBids().toString());
        System.out.println();

        buyoutAuction.placeBid(new Bid("Leo", 10));
        System.out.println(buyoutAuction.getHighBid().toString());
        System.out.println(buyoutAuction.getAllBids().toString());
        System.out.println();

        buyoutAuction.placeBid(new Bid("Raph", 8));
        System.out.println(buyoutAuction.getHighBid().toString());
        System.out.println(buyoutAuction.getAllBids().toString());
        System.out.println();

        buyoutAuction.placeBid(new Bid("Don", 55));
        System.out.println(buyoutAuction.getHighBid().toString());
        System.out.println(buyoutAuction.getAllBids().toString());
        System.out.println();

        buyoutAuction.placeBid(new Bid("Shredder", 52));
        System.out.println(buyoutAuction.getHighBid().toString());
        System.out.println(buyoutAuction.getAllBids().toString());
        System.out.println();
    }
}
