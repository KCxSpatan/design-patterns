package kcx.example.designpatterns.factory;

public interface EnemyShipFactory{
	
	public ESWeapon addESGun();
	public ESEngine addESEngine();
	
}