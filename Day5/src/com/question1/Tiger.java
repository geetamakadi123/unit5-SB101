package com.question1;

public class Tiger extends Animal{
	
	
	Tiger() throws AnimalException {

    }

    @Override
    void eat() {

    }

    public static void main(String[] args) throws AnimalException {
        Animal tiger = new Tiger();
        try {
            tiger.eat();
        }catch(AnimalException ae) {
            System.out.println(ae.getMessage());
        }

    }

}
