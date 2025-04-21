package app.finance;

import app.Calculator;
import java.lang.reflect.Field;
import java.util.ServiceLoader;

/**
 * Test.
 */

public final class Test {

    private Test() {

    }

    /**
     * Main code.
     * @param args
     */
    public static void main(String[] args) {
        final double[] nums = {2, 3, 4, 5};
        Calculator calc = ServiceLoader.load(Calculator.class)
            .findFirst()
            .get();
        System.out.println(calc.sum(nums));

        try {
            Field fieldId = calc.getClass().getDeclaredFields()[0];
            fieldId.setAccessible(true);
            fieldId.set(calc, "def");
            fieldId.setAccessible(false);
            System.out.println(calc.getTest());
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
