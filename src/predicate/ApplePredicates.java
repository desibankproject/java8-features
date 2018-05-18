package predicate;

import java.util.function.Predicate;

public class ApplePredicates {
	
	public static Predicate<Apple> isColorGreen() {
	    return apple -> apple.getColor().equals("green");
	}

	public static Predicate<Apple> isWeightAbove150() {
		return apple -> apple.getWeight() >= 150;
	}
}