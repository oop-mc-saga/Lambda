package lambdaExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

/**
 *
 * @author tadaki
 */
public class SimpleLambdaUsage {

    /**
     * Return a list of integers obtained by applying a function to each element in the input list
     * 
     * @param inputList
     * @param func
     * @return
     */
    public static List<Integer> listOperation(List<Integer> inputList,
            IntFunction<Integer> func) {
        List<Integer> outputList = new ArrayList<>();
        for (int i = 0; i < inputList.size(); i++) {
            int data = inputList.get(i);
            //apply the function to the data
            int result = func.apply(data);
            outputList.add(result);
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
        //apply the function x->x*x to the input list
        List<Integer> outputList = listOperation(inputList,
                x -> x * x
        );
        outputList.forEach(
                x -> System.out.println(x)
        );
    }

}
