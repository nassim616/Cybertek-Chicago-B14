package CollectionFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
        List<String > list = Arrays.asList("john", "sam","john");
        Set<String> set = new HashSet(list);
        System.out.printf("Size of list is %s,size of set %s, Is list unique : %s", list.size(),  list.size(), list.size()== list.size());
        System.out.println();
    }
}
