package lambdaSample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

/**
 *
 * @author tadaki
 */
public class SimpleSample {

    public static List<Integer> listOperation(List<Integer> inputList,
            IntFunction<Integer> func) {
        List<Integer> outputList = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            int input = inputList.get(i);
            int output = func.apply(input);
            outputList.add(output);
        }
        return outputList;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            inputList.add(i);
        }
        List<Integer> outputList = listOperation(inputList,
                x -> x * x + x
        );
        outputList.forEach(
                x -> System.out.println(x)
        );
    }

}
