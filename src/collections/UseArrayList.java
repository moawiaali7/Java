package collections;

import java.util.ArrayList;


public class UseArrayList {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(123);
        list.add(0);
        System.out.println(list);

        ArrayList<String> list1=new ArrayList<>();
        list1.add("test1");
        list1.add("test2");
        list1.add("test3");
        list1.add("test4");
        list1.add("test4");
        System.out.println(list1);
        System.out.println(list1.get(0));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
        for (int num :list2){
            System.out.println(num);
        }
    }
}
