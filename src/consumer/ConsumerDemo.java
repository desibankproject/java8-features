package consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * The Class ConsumerDemo.
 *
 * @author Nagendra May 20, 2018
 */
public class ConsumerDemo {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(String[] args) {

    List<String> str = new ArrayList<>();
    str.add("DEMO");
    str.add("DEMO2");
    str.add("DEMO3");

    /* Consumer is use for iterate over the List */
    Consumer<String> consumer = new Consumer<String>() {
        @Override
        public void accept(String t) {

        /* Print list element on consile */
        System.out.println("_#__#_#_# = "+t);
        }
    };

    str.forEach(consumer);

    }

}