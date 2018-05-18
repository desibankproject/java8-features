package java8;

public class SquareFunctionalMain {
			public static void main(String[] args) {
				SquareFunctional sf=(num) -> num*num;
				System.out.println( sf.square(4));
			}
}
