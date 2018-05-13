package kcx.example.designpatterns.strategy;

import org.junit.Test;

import kcx.example.designpatterns.oop.Animal;
import kcx.example.designpatterns.oop.Bird;
import kcx.example.designpatterns.oop.Dog;

public class AnimalPlay {
	
	@Test
	public void animal_try_to_fly() {
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		System.out.println("Dog: " + sparky.tryToFly());
		System.out.println("Bird: " + tweety.tryToFly());

		// This allows dynamic changes for flyingType
		sparky.setFlyingAbility(new ItFlys());
		System.out.println("Dog: " + sparky.tryToFly());
	}
}
