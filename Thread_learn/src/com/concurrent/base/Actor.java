package com.concurrent.base;

public class Actor implements Runnable {
	volatile boolean keepFighting = true;
	
	int otherEnergy = 0; //�Է�����ֵ
	int attack = 0; //������
	/**
	 * 
	 * @param name ����
	 * @param O_energy �Է�����ֵ
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
