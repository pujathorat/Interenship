package com.java.Leetcodeproblems;

	// Define an interface named Animal
	interface Animal {
	    void sound(); // Abstract method
	    void sleep(); // Abstract method
	}

	// Implement the Animal interface in the Dog class
	class Dog implements Animal {
	    @Override
	    public void sound() {
	        System.out.println("The dog barks");
	    }
	    
	    @Override
	    public void sleep() {
	        System.out.println("The dog sleeps");
	    }
	}

	// Implement the Animal interface in the Cat class
	class Cat implements Animal {
	    @Override
	    public void sound() {
	        System.out.println("The cat meows");
	    }
	    
	    @Override
	    public void sleep() {
	        System.out.println("The cat sleeps");
	    }
	}

	// Main class to demonstrate the use of interfaces
	public class JavaInterfaces {
	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.sound();
	        dog.sleep();
	        
	        Cat cat = new Cat();
	        cat.sound();
	        cat.sleep();
	    }
	}

