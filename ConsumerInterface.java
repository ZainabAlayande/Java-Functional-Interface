package funcInterface;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Zainab");
    }
    
    static Consumer<String> consumerDeclarative = name -> System.out.println(name); // TODO: 4/27/2023 Tell it what to do, not hwo to do it 
    
    public static void consumerImperative(String name) {
        System.out.println(name);
    }
            
}
