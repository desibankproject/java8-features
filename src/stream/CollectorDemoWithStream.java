package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorDemoWithStream {
	
	public static void main(String[] args) {
		List<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Guava");
		fruits.add("Mango");
		fruits.add("Chiku");
		fruits.add("Water melon");
		fruits.add("Papaya");
		
		List<String> tfruits =fruits.stream().filter(s->s.contains("a")).collect(Collectors.toList());
		tfruits.forEach(System.out::println);
		 
	}

}
