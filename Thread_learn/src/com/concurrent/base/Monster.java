package com.concurrent.base;

public class Monster extends Thread {
	int otherEnergy = 0; //�Է�����ֵ
	int attack = 0; //������
	/**
	 * 
	 * @param name ��������
	 * @param O_energy �Է�����ֵ
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
			System.out.println(Thread.currentThread().getName() + ": ��໣���Ż���"+ (otherEnergy) + "��Ѫ");
			
		}
		if(otherEnergy <= 0)
			System.out.println(Thread.currentThread().getName() + ": ��໣�");
	}

}
