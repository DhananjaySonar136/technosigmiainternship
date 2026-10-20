package Day3;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<Integer,String> ihm =new IdentityHashMap<>();

        Integer i1=10;
        Integer i2=new Integer(10);

        System.out.println(i1 == i2);

        ihm.put(i1, "Prem");
        ihm.put(i2, "Dhananjay");

        System.out.println(ihm);
    }
}
// HashMap -> LinkedHashmap
// weakHashMap
// IdentityHaphmap
// SortedMap -> NavigableMap -> TreeMap
