package lambdaSample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tadaki
 */
public class SecondSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 20;
        Map<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, Math.random());
        }

        List<Double> list = new ArrayList<>();
        for (Integer i : map.keySet()) {
            System.out.println(i + "->" + map.get(i));
            list.set(i, map.get(i));
        }

        for (Double d : list) {
            System.out.println(d);
        }
        /*
        double sum=0.;
        for(Double d:list){ sum += d; }
         */
        //sum of list
        double sum = list.stream().reduce(0., (acc, _item) -> acc + _item);
        //the maximum of list
        double max = list.stream().max(Comparator.naturalOrder()).get();
        //the number of data matching condition 
        int count = list.stream().filter(d -> (d > 0.5)).
                map(d -> 1).reduce(0, Integer::sum);
    }

}
