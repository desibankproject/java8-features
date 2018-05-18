package supplier;

import java.util.function.Supplier;

//@FunctionalInterface
//public interface Supplier<T> {

    /**
     * Gets a result.
     *
     * @return a result
     */
  //  T get();
//}
public class SupplierDemo2 {
		public static void main(String[] args) {
			Supplier<Person> personSupplier = Person::new;
			Person p=personSupplier.get();   // new Person
			System.out.println(p);
		}
}
