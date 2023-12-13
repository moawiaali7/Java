package practice;

public class Exercise3 {
    public static void main(String[] args) {

        int [] arr= new int[]{2,3,4,5,6,6,7,4,2};

        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }

            }

        }
        String [] str= new String[]{"MOAWIA","AHMED","MOHAMED","KHALED","AHMED","MOAWIA","ABDALLAH","SULIMAN"};
        for (int i = 0; i < str.length; i++) {
            for (int j = i+1; j < str.length; j++) {
                if (str[i]==str[j]){
                    System.out.println(str[j]);
                }

            }

        }


   }
}
