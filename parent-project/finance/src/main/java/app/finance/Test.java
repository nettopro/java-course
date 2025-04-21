package app.finance;

import app.calculation.Calculator;

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
        Calculator calc = new Calculator();
        System.out.println(calc.sum(nums));
    }
}
