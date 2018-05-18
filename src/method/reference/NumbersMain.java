package method.reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
public class NumbersMain {
		public static void main(String[] args) {
			List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);
			// Using an anonymous class
			Numbers.findNumbers(list, new BiPredicate<Integer, Integer>() {
			  public boolean test(Integer i1, Integer i2) {
			    return Numbers.isMoreThanFifty(i1, i2);
			  }
			});
			// Using a lambda expression
			Numbers.findNumbers(list, (i1, i2) -> Numbers.isMoreThanFifty(i1, i2));
			// Using a method reference
			Numbers.findNumbers(list, Numbers::isMoreThanFifty);
		}
}
