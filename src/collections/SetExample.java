
package collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Starc");
        set.add("Natasha");
        set.add("Rogers");
        set.add("Parker");
        set.add("Bruce");
        set.add(null);

        for (String name : set) {
            System.out.println(name);
        }
        System.out.println(set.remove("Parker"));
        System.out.println();
        for (String name : set) {
            System.out.println(name);
        }
        //to chech wheteher the element is present or not
        System.out.println();
        System.out.println(set.contains("Rogers"));
        
        List<Integer> alist=List.of(12,34,24,23,22,21,12,24);
        System.out.println(alist);
        
        Set<Integer>set1=new HashSet<>(alist);
        System.out.println(set1);
    }
}


 