package lambdaExamples;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tadaki
 */
public class Simplest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 100;
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Math.random());
        }
        //print all elements
        list.stream().forEach(d -> System.out.println(d));
    }

}
