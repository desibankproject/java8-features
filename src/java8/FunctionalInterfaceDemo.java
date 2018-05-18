package java8;

public class FunctionalInterfaceDemo {
			public static void main(String[] args) {
				Calculator calc = (n1, n2) -> n1 + n2; 
				System.out.println(calc.calculate(100, 200));
			}
}
