package funcInterface;

import java.util.function.BiPredicate;

public class BiPredicateInterface {
    public static void main(String[] args) {
        System.out.println(biPredicate.test("Prof", 4));

    }

    static BiPredicate<String, Integer> biPredicate =
            (name, lengthOfName) -> name.length() == lengthOfName;
}
