package lambdaExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author tadaki
 */
public class SimplestWithoutLambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 100;
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Math.random());
        }
        Consumer<Double> c = new Consumer<>(){
            @Override
            public void accept(Double d){
                System.out.println(d);
            }
        };
        //print all elements
        list.stream().forEach(c);
    }

}
