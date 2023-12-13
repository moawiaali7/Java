package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class UseLinkedList {

    public static void main(String[] args) {
        LinkedList<String> list1=new LinkedList<>();
        list1.add("test1");
        list1.add("test2");
        list1.add("test3");
        list1.add("test4");
        list1.add("test4");
        System.out.println(list1);
        System.out.println(list1.get(0));
    }
}
