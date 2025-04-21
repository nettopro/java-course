package app.calculation;

import app.calculation.internal.ArithmeticOperations;

/**
 * Calculator Class.
 */

public final class Calculator {

    private ArithmeticOperations arithmeticOps = new ArithmeticOperations();

    public double sum(final double... nums) {
        return arithmeticOps.sum(nums);
    }
}
