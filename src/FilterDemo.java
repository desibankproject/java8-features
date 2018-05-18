import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {

		public static void main(String[] args) {
			List<String> fruits=new ArrayList<String>();
			fruits.add("Apple");
			fruits.add("Banana");
			fruits.add("Mango");
			fruits.add("Guava");
			fruits.add("Grapes");
			Stream<String>  streams=fruits.stream();
			//streams.filter(item->item.startsWith("G")).forEach(item->System.out.println(item));
			List<String> list=streams.filter(item->item.startsWith("G")).collect(Collectors.toList());
			System.out.println(list);
		}
}
