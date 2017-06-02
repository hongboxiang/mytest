package com.concurrent.base;

public class Actor implements Runnable {
	volatile boolean keepFighting = true;
	
	int otherEnergy = 0; //对方精力值
	int attack = 0; //攻击力
	/**
	 * 
	 * @param name 名称
	 * @param O_energy 对方精力值
	 */
	public Actor(int O_energy)
	{
		otherEnergy = O_energy;
	}
	public Actor(){}
	
	public void setAtack(int m_attack)
	{
		attack = m_attack;
	}
	public void setO_energy(int O_energy)
	{
		otherEnergy = O_energy;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
