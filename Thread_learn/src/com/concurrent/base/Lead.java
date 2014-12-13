package com.concurrent.base;

public class Lead extends Actor{
//	volatile boolean keepFighting = true;
//	
//	int otherEnergy = 0; //对方精力值
//	int attack = 0; //攻击力
//	/**
//	 * 
//	 * @param name 主角名称
//	 * @param O_energy 对方精力值
//	 */
	public Lead(int O_energy)
	{
		otherEnergy = O_energy;
	}
	public Lead(){}
//	
//	public void setAtack(int m_attack)
//	{
//		attack = m_attack;
//	}
//	public void setO_energy(int O_energy)
//	{
//		otherEnergy = O_energy;
//	}
	public void run(){
		while(keepFighting == true && otherEnergy > 0)
		{
			otherEnergy -= attack;
			System.out.println(Thread.currentThread().getName() + ": 嘿。。。对方还有"+ (otherEnergy) + "滴血");
			try {
				Thread.sleep(Math.round(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(otherEnergy <= 0 && keepFighting == true)
			System.out.println(Thread.currentThread().getName() + ": 嗯");
	}
}
