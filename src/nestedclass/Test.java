package nestedclass;

public class Test {

    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.outerNumber=20;
        outer.outerMethod();

        outer.inner.innerNumber=10;
        outer.inner.innerMethod();
    }
}
