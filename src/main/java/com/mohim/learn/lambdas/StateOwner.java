package com.mohim.learn.lambdas;

import com.mohim.learn.lambdas.contract.StateChangeListener;

public class StateOwner {

    public void addStateListener(StateChangeListener listener) {
        System.out.println("state owner inside");
    }

}
