package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class UseLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<String> list1=new LinkedHashSet<>();
        list1.add("test5");
        list1.add("test1");
        list1.add("test2");
        list1.add("test3");
        list1.add("test4");
        System.out.println(list1);
        System.out.println(list1.size());
    }
}
