package nestedclass;

public class Outer {
    Inner inner=new Inner();

    int outerNumber;

    public Outer() {

    }

    public void outerMethod() {
        System.out.println("this Outer Method");

    }

    public static class Inner {

        int innerNumber;

        public Inner(){

        }
         public void innerMethod(){
            System.out.println("this inner Method");

         }

    }


}
