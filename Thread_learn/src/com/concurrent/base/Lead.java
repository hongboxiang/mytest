package com.concurrent.base;

public class Lead extends Actor{
//	volatile boolean keepFighting = true;
//	
//	int otherEnergy = 0; //�Է�����ֵ
//	int attack = 0; //������
//	/**
//	 * 
//	 * @param name ��������
//	 * @param O_energy �Է�����ֵ
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
			System.out.println(Thread.currentThread().getName() + ": �١������Է�����"+ (otherEnergy) + "��Ѫ");
			try {
				Thread.sleep(Math.round(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(otherEnergy <= 0 && keepFighting == true)
			System.out.println(Thread.currentThread().getName() + ": ��");
	}
}
