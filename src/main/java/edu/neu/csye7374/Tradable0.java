package edu.neu.csye7374;

public interface Tradable0 extends Tradable {
    default void setBid(String bid) {
        // Default implementation for Tradable0
        System.out.println("Tradable0 setBid: " + bid);
    }

    default int getMetric() {
        // Default implementation for Tradable0
        return 0;
    }
}
