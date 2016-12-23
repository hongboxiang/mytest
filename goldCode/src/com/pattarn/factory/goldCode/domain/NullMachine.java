package com.pattarn.factory.goldCode.domain;

/**
 * Created by 10180885 on 16-6-14.
 */
public class NullMachine extends Machine {
	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getInfo() {
		return "not find lalala~";
	}
}
