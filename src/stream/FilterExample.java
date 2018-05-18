package stream;

import java.util.stream.Stream;

public class FilterExample {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3,4);
		int sum=stream.filter(i->i>2).mapToInt(n->n*n).sum();
		System.out.println(sum);
		System.out.println("@@)@)@)");
		
	}
}
