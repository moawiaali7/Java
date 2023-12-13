package collections;

import java.util.HashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {

        HashMap<Integer,Integer> hashMap= new HashMap<>();
        hashMap.put(1,2);
        hashMap.put(3,4);
        hashMap.put(5,6);
        hashMap.put(7,8);
        hashMap.put(9,10);
        System.out.println(hashMap.get(1));
        for (Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());

        }
    }
}
