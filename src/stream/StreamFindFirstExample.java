package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstExample {
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
			
			Optional<String> firstNameWithD = stringCollection.stream().filter(i -> i.startsWith("D")).findFirst();
			if(firstNameWithD.isPresent()){
				System.out.println("First Name starting with D="+firstNameWithD.get()); //David
			}
			
		}
}
