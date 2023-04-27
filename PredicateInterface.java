package funcInterface;

import java.util.function.Predicate;

public class PredicateInterface {
    // TODO: 4/27/2023 Take a single argument and return boolean

    public static void main(String[] args) {
        Predicate<Integer> andOperation = predicate.and(after);
        System.out.println(predicate.test(2));

    }

    static Predicate<Integer> predicate = input -> input % 2 == 1;
    static Predicate<Integer> after = afterInput -> afterInput >= 5;
}
