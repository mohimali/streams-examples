package com.mohim.learn.lambdas.contract;

import com.mohim.learn.lambdas.model.State;

public interface StateChangeListener {

    public void onStateChange(State oldState, State newState);
}
