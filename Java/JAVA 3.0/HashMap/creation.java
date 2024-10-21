package HashMap;
import java.util.*;
public class creation {
    void printMap(Map<Integer,String> hm)
    {
        for(int x: hm.keySet())
        {
            System.out.println(hm.get(x));
        }for(Map.Entry<Integer,String> x: hm.entrySet())
        {
            System.out.printf("Name of Student %d is %s\n",x.getKey(),x.getValue());
        }

    }
    public static void main(String[] args) {
        Map<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Faziel");
        hm.put(2,"Rahul");
        hm.put(3,"Rohit");
        hm.put(4,"Raj");
        creation obj = new creation();
        obj.printMap(hm);
    }
}
