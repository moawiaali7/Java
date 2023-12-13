package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class UseIterator {
    public static void main(String[] args) {


        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        Iterator<Integer> it= array.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
