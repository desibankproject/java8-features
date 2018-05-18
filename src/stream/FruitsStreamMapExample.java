package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * The intermediate operation map converts each element into another object via
 * the given function. The following example converts each string into an
 * upper-cased string. But you can also use map to transform each object into
 * another type. The generic type of the resulting stream depends on the generic
 * type of the function you pass to map.
 * 
 * @author Nagendra
 *
 */
public class FruitsStreamMapExample {

	public static void main(String[] args) {
	List<String> stringCollection = new ArrayList<>();
		
		stringCollection.add("Apple");
		stringCollection.add("Banana");
		stringCollection.add("Mango");
		stringCollection.add("Chiku");
		stringCollection.add("Grapes");
		stringCollection.add("Pomogranets");
		stringCollection.add("Guava");
		stringCollection.add("Water Melon");
		
		stringCollection
	    .stream()
	    .map(String::toUpperCase)
	    .sorted((a, b) -> b.compareTo(a))
	    .forEach(System.out::println);

	}
}
