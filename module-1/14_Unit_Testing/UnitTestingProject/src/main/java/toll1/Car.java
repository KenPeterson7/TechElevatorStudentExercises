package toll1;

public class Car implements Vehicle {
    private boolean hasTrailer;

    public Car(boolean hasTrailer){
        this.hasTrailer = hasTrailer;
    }

    public boolean getHasTrailer() {
        return hasTrailer;
    }

    @Override
    public double calculateToll(int distance){
        double toll = distance * 0.020;
        if(hasTrailer){
            toll = toll + 1.0;
        }
        return toll;
    }
}
