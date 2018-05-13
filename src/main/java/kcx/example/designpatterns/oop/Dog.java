package kcx.example.designpatterns.oop;

import kcx.example.designpatterns.strategy.CantFly;

public class Dog extends Animal {

	private static final long serialVersionUID = -8633521044370342660L;

	public Dog() {
		super();
		setSound("Bark");
		flyingType = new CantFly();
	}

	public void digHole() {
		System.out.println("Dug a hole");
	}

	public void changeVar(int randNum) {
		randNum = 12;
		System.out.println("randNum in method: " + randNum);
	}

	private void bePrivate() {
		System.out.println("In a private Method");
	}

	public void accessPrivate() {
		bePrivate();
	}
}
