package Day3;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo extends Object{
    
    public void finalize() throws Throwable{
        System.out.println("Finalize method called");
    }
    
    public static void main(String[] args) {
        
        MapDemo md=new MapDemo();
        Map<Integer,String> m=new HashMap<>();

        String s=new String("Nandurbar");

        m.put(1, "Dhananjay");
        m.put(2, "Kunal");
        m.put(3, "Gaurav");
        m.put(4, "Vedant");

        for(Map.Entry<Integer,String> entry : m.entrySet()){
            System.out.println(entry.getValue());
            System.out.println(entry.getKey());
        }

        md=null;

        System.gc();

        md=new MapDemo();
        md=null;
        System.gc();

    }
}
