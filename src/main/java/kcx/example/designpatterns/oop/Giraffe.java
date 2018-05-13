package kcx.example.designpatterns.oop;

public class Giraffe extends Creature {

	private String name;

	@Override
	public void setName(String newName) {
		this.name = newName;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setWeight(int newWeight) {
		this.weight = newWeight;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public void setSound(String newSound) {
		this.sound = newSound;
	}

	@Override
	public String getSound() {
		return sound;
	}

}