package Day3;

import java.util.HashMap;
import java.util.TreeSet;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        
        hm.put(10, "Ten");
        hm.put(20, "Twenty");
        hm.put(30, "Thirty");
        hm.put(40, "Fourty");
        hm.put(50, "Fifty");

        //Internally Bucket concept is used by default bucket size is 16
        // So ( key % 16 ) in case of integer

        // and in case of String 
        // 1. Hashcode   2. SpreadHash  3.  


        System.out.println(hm);

    }
}
