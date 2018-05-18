package stream;

import java.util.stream.Stream;

public class ForEachExample {
		public static void main(String[] args) {
			Stream<Integer> stream = Stream.of(1,2,3,4);
			//stream.forEach(x->System.out.println(x));
			stream.forEach(System.out::println);
		}
}
