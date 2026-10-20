package Day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public class WeakHashMapDemo {
    public static void main(String[] args) throws Exception {
        WeakHashMap<String,Integer> hm =new WeakHashMap<>();

        String str=new String();
        hm.put(str,10);

        str=null;

        System.gc();
        Thread.sleep(1000);

        Set<Map.Entry<String,Integer>> e=hm.entrySet();
        System.out.println(hm);
        System.out.println(hm.size());
    }
}
