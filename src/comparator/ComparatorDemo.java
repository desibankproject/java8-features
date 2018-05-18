package comparator;

import java.util.Comparator;

import supplier.Person;

public class ComparatorDemo {
		public static void main(String[] args) {
			Comparator<Person> comparator = (p1, p2) -> p1.getName().compareTo(p2.getName());
			Person p1 = new Person("John", "Doe");
			Person p2 = new Person("Alice", "Wonderland");

			int t1=comparator.compare(p1, p2);             // > 0
			int t2=comparator.reversed().compare(p1, p2);  // < 0
			System.out.println(t1);
			System.out.println(t2);
		}
}
