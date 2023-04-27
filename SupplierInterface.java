package funcInterface;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        System.out.println(supplier.get());

    }

    static Supplier<Integer> supplier =
            () -> 20;
}
