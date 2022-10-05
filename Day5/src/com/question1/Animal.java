package com.question1;

public abstract class Animal {
	
	abstract void eat() throws AnimalException;

    Animal() throws AnimalException {

        try {
            System.out.println("Tiger is eating !!");
        } catch (Exception e) {
            // TODO: handle exception
            AnimalException ae = new AnimalException("invalid data");
        }

    }


}
