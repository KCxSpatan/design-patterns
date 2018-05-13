package kcx.example.designpatterns.oop;

import org.junit.Test;

public class WorkWithAnimals {

	int justANum = 10;

	@Test
	public void animal_play(){

		Dog fido = new Dog();
		fido.setName("fido");
		System.out.println(fido.getName());
		fido.digHole();
		fido.setWeight(-1);

		// Pass by value
		int randNum = 10;
		fido.changeVar(randNum);
		System.out.println("randNum after method call: " + randNum);

		// Pass by reference
		changeObjectName(fido);
		System.out.println("Dog name after method call: " + fido.getName());

		Animal doggy = new Dog();
		Animal kitty = new Cat();

		System.out.println("Doggy says: " + doggy.getSound());
		System.out.println("Kitty says: " + kitty.getSound());

		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;

		System.out.println("Doggy says: " + animals[0].getSound());
		System.out.println("Kitty says: " + animals[1].getSound());

		speakAnimal(doggy);

		((Dog) doggy).digHole();

		// Cannot make a static reference to the non-static field justANum
		// justANum = 10;

		// Cannot make a static reference to the non-static method sayHello()
		// from the type WorkWithAnimals
		// sayHello();

		fido.accessPrivate();

		Giraffe giraffe = new Giraffe();
		giraffe.setName("Frank");
		System.out.println(giraffe.getName());

	}

	public static void changeObjectName(Dog fido) {
		fido.setName("Marcus");
	}

	public static void speakAnimal(Animal randAnimal) {
		System.out.println("Animal says: " + randAnimal.getSound());
	}

	public void sayHello() {

	}
}
