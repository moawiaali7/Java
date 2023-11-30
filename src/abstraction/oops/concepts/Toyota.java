package abstraction.oops.concepts;

public class Toyota  extends Model implements Car,Motor{
    public void Start() {
        System.out.println("Started from Toyota");
    }

    public void Stop() {
        System.out.println("Stopped from Toyota");

    }

    public void CarColor() {
        System.out.println("The color is reed and green");

    }

    public void Camry() {
        System.out.println("2022");
    }

    public void engin() {
        System.out.println("V8");
    }

    public void Iphone() {
        System.out.println("iphone 14 pro max");
    }

    public void Samsung() {
        System.out.println("samsung galaxy s23 ultra");
    }
}
