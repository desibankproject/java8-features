package stream;

import java.util.stream.Stream;

public class StreamDemo {
		public static void main(String[] args) {
			Stream<Integer> stream = Stream.of(1,2,3,4);
			stream.forEach(x->System.out.println(x));
			System.out.println("____Iterating is done already!______");
			Stream<Integer> stream1 = Stream.of(1,2,3,4);
			int sum=stream1.filter(i->i>2).mapToInt(n->n*n).sum();
			System.out.println(sum);
			System.out.println("@@)@)@)");
			
		}
}
