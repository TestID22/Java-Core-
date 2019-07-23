package com.september;

public class Atlantis extends Hero {

    public Atlantis(String name) {
        super(name);
    }
    @Override
    public String getDescription() {
        return String.format("Это оъект класса Атлантис, и тут супергерои") ;
    }
    @Override
	
    public void heroPower() {
    	System.out.println("Абстрактная супер - способность Атлантисов");
    	
    }
}