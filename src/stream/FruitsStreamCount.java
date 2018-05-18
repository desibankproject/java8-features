package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Count is a terminal operation returning the number of elements in the stream
 * as a long.
 * 
 * @author Nagendra
 *
 */
public class FruitsStreamCount {
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

		long startsWithB = stringCollection.stream().filter((s) -> s.startsWith("b")).count();
		System.out.println(startsWithB); // 3

	}
}
