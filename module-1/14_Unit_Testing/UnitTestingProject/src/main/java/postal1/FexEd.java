package postal1;

public class FexEd implements DeliveryDriver {
    private double rate = 20.0;

    @Override
    public double calculateRate(int distance, double weight, String units) {
        if (distance > 500) {
            rate = rate + 5.0;
        }
        else if (weight > 48.0) {
            rate = rate + 3.0;
        }
        return rate;
    }
}
