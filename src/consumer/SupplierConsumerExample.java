package consumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierConsumerExample {
  public static void main(String[] args) {


    Supplier<String> supplier = () -> {
      return "s1";
    };
    String s1 = supplier.get();
    System.out.println(s1); // output: "s1"


    Consumer<String> consumer = (c) -> {
      System.out.println(c); // output: "c1", "c2"
    };
    consumer.accept("c1");
    consumer.accept("c2");


  }    
}