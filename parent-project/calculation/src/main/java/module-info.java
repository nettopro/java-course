import app.Calculator;
import app.calculation.CalculatorImpl;

module app.calculation {
    requires transitive app.logging;
    requires transitive app.api;

    exports app.calculation;
/*     exports app.calculation.internal to app.finance; */

    opens app.calculation to app.finance;
    provides Calculator with CalculatorImpl;
}