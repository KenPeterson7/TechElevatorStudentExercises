public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double price;
    private char condition;
    private int trim;
    private char transmission;
    private int mileage;

    enum Trim {
        BASE,
        MID,
        TOP
    }

    enum Transmission {
        AUTOMATIC,
        MANUAL
    }

    enum Condition {
        NEW,
        USED
    }

    Vehicle(){}
    Vehicle(String make, String model, int year, double price,
            char condition, int trim, char transmission, int mileage){
        setMake(make);
        setModel(model);
        setYear(year);
        setPrice(price);
        setCondition(condition);
        setTrim(trim);
        setTransmission(transmission);
        setMileage(mileage);
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getMake(){
        return make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 1886)
            this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0)
            this.price = price;
    }

    public char getCondition() {
        return condition;
    }

    public Condition getConditionName(){
        if(condition == 'N' || condition == 'n')
            return Condition.NEW;
        else
            return Condition.USED;
    }

    public void setCondition(char condition) {
        this.condition = condition;
    }

    public int getTrim() {
        return trim;
    }

    public Trim getTrimName(){
        if(trim == 1)
            return Trim.BASE;
        else if(trim == 2)
            return Trim.MID;
        else
            return Trim.TOP;
    }

    public void setTrim(int trim) {
        this.trim = trim;
    }

    public char getTransmission() {
        return transmission;
    }

    public Transmission getTransmissionName(){
        if(transmission == 'A' || transmission == 'a')
            return Transmission.AUTOMATIC;
        else
            return Transmission.MANUAL;
    }

    public void setTransmission(char transmission) {
        this.transmission = transmission;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if(mileage > 0 )
            this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Make: " + make + "\n" + "Model: " + model + "\n" +
                "Year: " + year + "\n" + "Price: $" + String.format("%.2f", price) + "\n" +
                "Condition: " + getConditionName() + "\n" + "Trim: " + getTrimName() + "\n" +
                "Transmission: " + getTransmissionName() + "\n" + "Mileage: " + mileage;
    }
}
