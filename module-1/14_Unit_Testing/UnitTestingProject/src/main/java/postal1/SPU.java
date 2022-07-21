package postal1;

import postal1.DeliveryDriver;

public class SPU implements DeliveryDriver {

    private String rateType;

    public SPU(String rateType) {
        this.rateType = rateType;
    }

    @Override
    public double calculateRate(int distance, double weight, String units) {
        if(units.equals("O")) {
            weight /= 16;
        }
        if (rateType.equals("4 day")) {
                return weight * 0.0050 * distance;
        }
        else if(rateType.equals("2 day")){
            return weight * .050 * distance;
        }
        else if(rateType.equals("Next day")){
            return weight * .075 * distance;
        }
        return 0;
    }
}
