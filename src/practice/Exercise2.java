package practice;

import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {

       String str="Hello";

       str.toLowerCase().toCharArray();
       System.out.println( str.toLowerCase().toCharArray());

        char[] array= str.toLowerCase().toCharArray();
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i]+":"+"//");

        }


    }

}

