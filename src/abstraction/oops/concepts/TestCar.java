package abstraction.oops.concepts;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Toyota();
        car.CarColor();
        car.Start();
        car.Stop();
        car.Iphone();
        car.Samsung();

        Toyota toyota = new Toyota();

        toyota.Camry();
        toyota.CarColor();
        toyota.Iphone();
        toyota.engin();
        toyota.Start();
        toyota.Stop();
        toyota.Samsung();
        toyota.Accord();


        Honda honda = new Honda();
    }
}
