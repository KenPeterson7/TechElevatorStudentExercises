import org.junit.*;
import toll1.Car;

public class CarTest {

    @Test
    public void carHasTraveledTenMiles(){
        //Arrange
        Car car = new Car(false);
        int distance =10;
        //Act
        double toll = car.calculateToll(distance);
        //Assert
        Assert.assertEquals(0.2, toll, 2);
    }

    @Test
    public void carWithTrailerHasTraveledTwentyMiles(){
        //Arrange
        Car car = new Car(true);
        int distance = 20;
        //Act
        double toll = car.calculateToll(distance);
        //Assert
        Assert.assertEquals(1.4, toll, 2);
    }

}
