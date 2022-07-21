package postal1;

import postal1.DeliveryDriver;

public class PostalService implements DeliveryDriver {
    private double lowOuncesRate;
    private double midOuncesRate;
    private double highOuncesRate;

    private double lowPoundsRate;
    private double midPoundsRate;
    private double highPoundsRate;

    public PostalService(double lowOuncesRate, double midOuncesRate, double highOuncesRate, double lowPoundsRate, double midPoundsRate, double highPoundsRate) {
        this.lowOuncesRate = lowOuncesRate;
        this.midOuncesRate = midOuncesRate;
        this.highOuncesRate = highOuncesRate;
        this.lowPoundsRate = lowPoundsRate;
        this.midPoundsRate = midPoundsRate;
        this.highPoundsRate = highPoundsRate;
    }

    @Override
    public double calculateRate(int distance, double weight, String units) {
        if (units.equals("O")) {
            if (weight <= 2) {
                return distance * lowOuncesRate;
            } else if (weight >= 3 && weight <= 8) {
                return distance * midOuncesRate;
            } else if (weight >= 9 && weight <= 15) {
                return distance * highOuncesRate;
            }
        } else if (units.equals("P")) {
            if (weight >= 2 && weight <= 3) {
                return distance * lowPoundsRate;
            } else if (weight >= 4 && weight <= 8) {
                return distance * midPoundsRate;
            } else if (weight >= 9) {
                return distance * highPoundsRate;
            }
        }
        return 0.0;
    }
}
