package com.concurrent.base;

import java.util.Scanner;

public class Stage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入主角：");
		Lead tusu = new Lead(20);
		tusu.setAtack(2);
		Thread t1 = new Thread(tusu,sc.next());
		System.out.println("请输入怪物：");
		Monster dog = new Monster(10);
		dog.setAtack(1);
		Thread t2 = new Thread(dog,sc.next());
		t1.start();
		t2.start();
		
		//当双方中一方死亡，则线程都停止
		while(t1.isAlive() && t2.isAlive());
		
			tusu.keepFighting = false;
			dog.keepFighting = false;
		
			if(tusu.otherEnergy <= 0)
				System.out.println(t1.getName() + "赢了！");
			else
				System.out.println("你死了。。。");

	}

}
