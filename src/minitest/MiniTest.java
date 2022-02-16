package minitest;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

public class MiniTest {

    public static double sumAll(
            List<Double> input, DoubleFunction<Double> function) {
        double sum = input.stream().map(d -> function.apply(d)).
                reduce(0., (accumulator, _item) -> accumulator + _item);
        return sum;
    }

    public static void main(String[] args) {
        Double d[]={1.,2.,3.};
        double r = sumAll(Arrays.asList(d),  );
        System.out.println(r);
    }

}
