package funcInterface;

import java.util.function.BiConsumer;

public class BiInterface {

    public static void main(String[] args) {
        biConsumer.accept("Zainab", 7);

    }

    static BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(name + age);
}
