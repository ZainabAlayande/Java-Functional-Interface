package funcInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {// TODO: 4/27/2023 the return type is of the same type as the parameter
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply(2));

    }

    static UnaryOperator<Integer> unaryOperator =
            value -> value * 30;
}
