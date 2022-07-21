package postal1;

public interface DeliveryDriver {
    public double calculateRate(int distance, double weight, String units);
}
