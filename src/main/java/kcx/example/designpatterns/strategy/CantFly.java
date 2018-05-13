package kcx.example.designpatterns.strategy;

public class CantFly implements Flys {

	@Override
	public String fly() {
		return "I can't fly";
	}

}
