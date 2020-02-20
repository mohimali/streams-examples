package com.mohim.learn.lambdas;

public class Lambas {


    public static void main(String[] args) {
        System.out.println("Lambdas");

        StateOwner stateOwner = new StateOwner();
        stateOwner.addStateListener(((oldState, newState) -> System.out.println("State Changed")));

    }
}
