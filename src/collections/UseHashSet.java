package collections;

import java.util.HashSet;
import java.util.LinkedList;

public class UseHashSet {
    public static void main(String[] args) {

        HashSet<String> list1=new HashSet<>();
        list1.add("test1");
        list1.add("test2");
        list1.add("test3");
        list1.add("test4");
        list1.add("test1");
        System.out.println(list1);
        System.out.println(list1.size());
    }
}
