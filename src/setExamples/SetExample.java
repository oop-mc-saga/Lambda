package setExamples;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author tadaki
 */
public class SetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String colors[]={"red", "green", "blue", "yellow", "cyan"};
        Set<String> set = new TreeSet<>();
        for(String s:colors){
            set.add(s);
        }
        
        //Add elements
        set.add("orange");
        set.add("red"); // "red" is already in the set
        
        //Print all elements in the set
        //Observe the order of elements
        set.forEach(c->System.out.println(c));
        
    }
    
}
