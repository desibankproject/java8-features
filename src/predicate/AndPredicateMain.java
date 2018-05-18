package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AndPredicateMain {
			public static void main(String[] args) {
				List<Apple> apples = Arrays.asList(new Apple("green", 120.0), new Apple("red", 110.0),
						new Apple("brown", 150.0), new Apple("green", 160.0), new Apple("red", 122.0));
				Predicate<Apple> andPredicate = ApplePredicates.isColorGreen().and(ApplePredicates.isWeightAbove150());
				apples.stream().filter(andPredicate).forEach(System.out::println);
			}
}
