package com.mohim.learn.streams.contract;

public interface VehicleInterface {

    static String producer() {
        return "N&F vehicles";
    }

    default String getOverview() {
        return "ATV made by " + producer();
    }


}
