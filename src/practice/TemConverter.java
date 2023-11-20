package practice;

import java.util.Scanner;

public class TemConverter {
    public static void main(String[] args) {

        int answer;
        int tempConvert;
        int tempConverted;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------Welcome-----------------");
        System.out.println("-----------------Temp Converter-----------------");
        do {
            System.out.println("-----------------Choose The Conversion Mode-----------------");
            System.out.println("1- °C TO °F");
            System.out.println("2- °F TO °C");
            answer= sc.nextInt();
            if (answer==1){
                System.out.println("-----Enter The Temp To Convert-----");
                tempConvert= sc.nextInt();
                tempConverted = (tempConvert * 9/5) +32;
                System.out.println(tempConvert+"°C ="+tempConverted+" °F");
            } else if (answer==2) {
                System.out.println("-----Enter The Temp To Convert------");
                tempConvert= sc.nextInt();
                tempConverted = ( tempConvert - 32)*5/9;
                System.out.println(tempConvert+"°F ="+tempConverted+" °C");
            }
            System.out.println(" do you want to convert another temp");
            
            System.out.println("yes/no (1-yes / 2-no)");
            answer= sc.nextInt();
        }while (answer==1);

        System.out.println(" ---------GOOD BYE SEE YOU------------ ");

    }


}
