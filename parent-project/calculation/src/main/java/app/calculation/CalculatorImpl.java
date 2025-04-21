package app.calculation;

import app.Calculator;
import app.calculation.internal.ArithmeticOperations;
import app.logging.Logger;

/**
 * Calculator Class.
 */

public class CalculatorImpl implements Calculator {

    private String test = "abc";

    private ArithmeticOperations arithmeticOps = new ArithmeticOperations();

    public double sum(final double... nums) {
        Logger.info("Summing...");
        return arithmeticOps.sum(nums);
    }

    public String getTest() {
        return test;
    }

    /**
     * Returns logger class.
     * @return
     */

    public static Class<Logger> getLoggerClass() {
        return Logger.class;
    }
}
