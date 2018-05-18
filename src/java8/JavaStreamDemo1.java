package java8;

import java.util.Iterator;
import java.util.List;

public class JavaStreamDemo1 {

	public static void main(String[] args) {

	}
	
	private static int sumStream(List<Integer> list) {
		return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
	}

	/**
	 * Before we look into Java Stream API Examples, let’s see why it was
	 * required. Suppose we want to iterate over a list of integers and find out
	 * sum of all the integers greater than 10.
	 * 
	 * @param list
	 * @return
	 */
	private static int sumIterator(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		return sum;
	}

}
