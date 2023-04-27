package funcInterface;

import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer, Integer> result = functionOne.andThen(functionTwo);
        System.out.println(result.apply(100));

    }

    static Function<Integer, String> functionOne =
            input -> input * 20 + "";

    static Function<String, Integer> functionTwo =
            input -> input.length();
}
