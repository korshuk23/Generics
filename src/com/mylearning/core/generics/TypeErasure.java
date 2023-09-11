package com.mylearning.core.generics;

public class TypeErasure {
}
class Parent{
    public void abc(Info<Double> info){
        Double s = info.getValue();
    }
    class Child extends Parent{
       /* public void abc(Info<Integer> info){
            Integer i = info.getValue();
        }*/
    }
}
