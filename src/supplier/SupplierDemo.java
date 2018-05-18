package supplier;

import java.util.function.Supplier;

/**
 * The Class SupplierDemo.
 *
 * @author Ankit Sood Apr 20, 2017
 */
public class SupplierDemo {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(String[] args) {
    getValue(() -> "Output1");
    getValue(() -> "OutPut2");
    }

    /**
     * Gets the value.
     *
     * @param supplier
     *            the supplier
     * @return the value
     */
    public static void getValue(Supplier<?> supplier) {
    System.out.println(supplier.get());
    }

}