package com.sgit;

@FunctionalInterface
public interface Moveable {
	public void m1();
	

    default void move(){
        System.out.println("I am moving");
    }
    
    default void move1(){
        System.out.println("I am moving");
    }
}