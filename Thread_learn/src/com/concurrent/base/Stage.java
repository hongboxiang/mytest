package com.concurrent.base;

public class Stage {

	public static void main(String[] args) {
		Lead tusu = new Lead("tusu",20);
		tusu.setAtack(2);
		tusu.start();
		Monster dog = new Monster("dog",10);
		dog.setAtack(1);
		dog.start();
		
		while(tusu.isAlive() && dog.isAlive());

		tusu.stop();
		dog.stop();
	}

}
