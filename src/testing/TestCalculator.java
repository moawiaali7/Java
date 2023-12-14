package testing;

import org.junit.Assert;

public class TestCalculator {
    public static void main(String[] args) {
        //Unit Test
        Calculator calculator = new Calculator();

        //test add
        //test data : num1= 10 , num2 =20
        //expect result =30
        int actualResult = calculator.add(10,20);
        Assert.assertEquals(30,actualResult);
        System.out.println("Pass");

        //test sub
        //test data : num1= 10 , num2 =20
        //expect result =-10
        int actualResult2= calculator.sub(10,20);
        Assert.assertEquals(-10,actualResult2);
        System.out.println("Pass");
    }
}
