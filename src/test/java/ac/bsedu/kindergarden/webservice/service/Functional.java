package ac.bsedu.kindergarden.webservice.service;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class Functional {


  @Test
  public void testFunctional () {
    Runnable r = () -> System.out.println("hello");
    r.run();

    Supplier<String> s = () -> "wow";
    String result = s.get();

    Consumer<String> c = str -> System.out.println(str);
    c.accept(result);

    Consumer<Integer> integerConsumer = str -> System.out.println(str);

    Consumer<Boolean> booleanConsumer = str -> System.out.println(str);

    Function<String,Integer> f = str -> Integer.parseInt(str);
    Integer result1 = f.apply("1");

    integerConsumer.accept(result1);

    Predicate<String> p = str -> str.isEmpty();
    boolean result2 = p.test("");

    booleanConsumer.accept(result2);

    UnaryOperator<String> u = str -> str + " operator";
    String result4 = u.apply("hello unary");
    c.accept(result4);

  }



}
