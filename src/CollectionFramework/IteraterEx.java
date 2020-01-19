package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteraterEx {
    public static void main(String[] args) {
       Set<String> names= new HashSet<>();
        names.add("james");
        names.add("moe");
        names.add("nikki");
        names.add("drake");
        names.add("masta");


        Iterator <String> it = names.iterator();
       // it.next();  point to "james"
        //it.next(); point to "moe"
        while (it.hasNext()){
    String name = it.next();
            System.out.println(name);
        }

    }
}
