package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApplePredicateMain1 {
		public static void main(String[] args) {
				List<Apple> apples = Arrays.asList(new Apple("green", 120.0), new Apple("red", 110.0),
						new Apple("brown", 150.0), new Apple("green", 160.0), new Apple("red", 122.0));
					apples.stream().filter(ApplePredicates.isWeightAbove150()).collect(Collectors.toList()).forEach(System.out::println);
			}
		}
