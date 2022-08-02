package com.techelevator;

public class MovieRental {

    private String title;
    private String format;
    private boolean isPremiumMovie = false;
    double rentalPrice;

    public MovieRental(String title, String format, boolean isPremiumMovie) {
        this.title = title;
        this.format = format;
        this.isPremiumMovie = isPremiumMovie;

    }

    public String getTitle() {
        return title;
    }

    public String getFormat() {
        return format;
    }

    public boolean isPremiumMovie() {
        return isPremiumMovie;
    }

    public double getRentalPrice() {
        if (format.equals("VHS")) {
            return 0.99;
        } else if (format.equals("DVD")) {
            return 1.99;
        } else if (format.equals("Blu-ray")) {
            return 2.99;
        }
        return 0;
    }



    public double lateFee(int daysLate) {
        if (daysLate == 0) {
            return 0.00;
        } else if (daysLate == 1) {
            return 1.99;
        } else if (daysLate == 2) {
            return 3.99;
        } else if (daysLate >= 3) {
            return 19.99;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Movie - " + getTitle() + " - " + getFormat() + " " + getRentalPrice();
    }

}