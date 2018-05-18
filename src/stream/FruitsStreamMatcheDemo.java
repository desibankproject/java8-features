package stream;

import java.util.ArrayList;
import java.util.List;

public class FruitsStreamMatcheDemo {
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
		
		boolean anyStartsWithA =
			    stringCollection
			        .stream()
			        .anyMatch((s) -> s.startsWith("a"));

			System.out.println(anyStartsWithA);      // true

			boolean allStartsWithA =
			    stringCollection
			        .stream()
			        .allMatch((s) -> s.startsWith("a"));

			System.out.println(allStartsWithA);      // false

			boolean noneStartsWithZ =
			    stringCollection
			        .stream()
			        .noneMatch((s) -> s.startsWith("z"));

			System.out.println(noneStartsWithZ);      // true
		
	}
}
