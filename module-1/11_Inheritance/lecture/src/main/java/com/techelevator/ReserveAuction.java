package com.techelevator;

public class ReserveAuction extends Auction{
    private int reservePrice;

    public int getReservePrice() {
        return reservePrice;
    }

    /**
     *
     * @param itemForSale the description of the auction
     * @param reservePrice the min sale price
     */
    public ReserveAuction(String itemForSale, int reservePrice){
        super(itemForSale);
        this.reservePrice = reservePrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid){
        boolean isCurrentWinningBid = false;

        if(offeredBid.getBidAmount() >= reservePrice){
            isCurrentWinningBid = super.placeBid(offeredBid);
        }

        return isCurrentWinningBid;
    }
}
