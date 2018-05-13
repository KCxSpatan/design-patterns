package kcx.example.designpatterns.oop;

import kcx.example.designpatterns.strategy.ItFlys;

public class Bird extends Animal {

	private static final long serialVersionUID = 7169739162900779601L;

	public Bird() {
		super();
		flyingType = new ItFlys();
	}
}
