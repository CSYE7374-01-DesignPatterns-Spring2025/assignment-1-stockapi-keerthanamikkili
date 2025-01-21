package edu.neu.csye7374;

public interface Tradable1 extends Tradable {
    default int getMetric() {
        // Default implementation for Tradable1
        return 1;
    }
}
