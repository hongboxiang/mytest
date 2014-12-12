package com.concurrent.base;

public class Monster extends Thread {
	int otherEnergy = 0; //对方精力值
	int attack = 0; //攻击力
	/**
	 * 
	 * @param name 主角名称
	 * @param O_energy 对方精力值
	 */
	public Monster(String name, int O_energy)
	{
		this.setName(name);
		otherEnergy = O_energy;
	}
	public Monster(){}
	
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
		while(otherEnergy > 0)
		{
			try {
				Thread.sleep(Math.round(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			otherEnergy -= attack;
			System.out.println(Thread.currentThread().getName() + ": 嗷嗷嗷！猪脚还有"+ (otherEnergy) + "滴血");
			
		}
		if(otherEnergy <= 0)
			System.out.println(Thread.currentThread().getName() + ": 嗷嗷嗷！");
	}

}
