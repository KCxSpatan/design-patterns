package kcx.example.designpatterns.oop;

import java.io.Serializable;

import kcx.example.designpatterns.strategy.Flys;

public class Animal implements Serializable {

	private static final long serialVersionUID = -6488880506731692704L;

	private String name;

	private double height;

	private int weight;

	private String favoriteFood;

	private double speed;

	private String sound;

	public Flys flyingType;

	public Animal() {

	}

	public void move(int i) {

	}

	public void eat() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			System.out.println("Weight must be bigger than 0");
		}
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	// Animal pushes off the responsibility for flying to flyingType
	public String tryToFly() {
		return flyingType.fly();
	}

	// If you want to be able to change the flyingType dynamically
	// add the following method
	public void setFlyingAbility(Flys newFlyType) {
		flyingType = newFlyType;
	}
}
