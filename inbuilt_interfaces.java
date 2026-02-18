package Date18_02_2026;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lambda {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("using function interface:");

        Function<Integer, Integer> func = (Integer a) -> {
            return a * a;
        };

        System.out.println(func.apply(10));

        System.out.println();

        System.out.println("using predicate interface:");

        Predicate<Integer> p = (Integer a) -> {
            return a > 10 ? true : false;
        };

        System.out.println(p.test(12));

        System.out.println();

        System.out.println("using consumer interface:");

        Consumer<Integer> c=(Integer a)->{
            System.out.println(a);
        };

        c.accept(10);

        System.out.println();

        System.out.println("using supplier interface:");

        Supplier<Integer> s=()->{
            return 100;
        };

        System.out.println(s.get());

        System.out.println();

    }
}
