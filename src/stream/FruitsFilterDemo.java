package stream;

import java.util.ArrayList;
import java.util.List;

public class FruitsFilterDemo {
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
	    .filter((s) -> s.contains("a"))
	    .forEach(System.out::println);
		
		
	}
}
