package algorithm;

public class InsertionSorting {
    public static void main(String[] args) {

        int [] array ={20,5,10,8,16,25,40,1,37,2,0,70,9};

        int temp;

        for (int i = 0; i <array.length ; i++) {
            for (int j = i; j >0; j--) {
                if (array[j] < array[j-1]){

                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;

                }

            }

        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);

        }
    }
}
