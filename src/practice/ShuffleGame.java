package practice;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleGame {
    public static int[] shuffle (int [] array){
        Random random= ThreadLocalRandom.current();
        for (int i = 0; i <array.length ; i++) {
            int index = random.nextInt(i+1);
            int a= array[index];
            array[index]= array[i];
            array[i]=a;
        }
        return array;
    }
    public static void main(String[] args) {
        int answer;
        int a;
        String str="";
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------Welcome to Shuffle Game-----------------");
        System.out.println("-----------------Guess where the 0 is? [1,0,1]-----------------");
        do {
            System.out.println("-----------------Are you ready to play-----------------");
            answer = sc.nextInt();
            if ( answer!=1) {
                System.out.println("-----pick 1 0r 2 0r 3-----");
                int[] array = {1, 0, 1};
                shuffle(array);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);
                }
                a = sc.nextInt();
                System.out.println("-----------------Sorry!!! wrong number-----------------");
            } else if (answer == 2) {
                a = sc.nextInt();
                int[] array = {1, 0, 1};
                shuffle(array);
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]);
                }
            }
            System.out.println("-----------------Sorry!!! wrong number-----------------");
        }  while (answer==1);



    }
}
