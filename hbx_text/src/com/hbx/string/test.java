package com.hbx.string;

/**
 * Created by 10180885 on 16-6-28.
 */
public class test {
	String getMoi(long subnetID, long meID) {
		return String.format("SubNetwork={0},MEID={1}", String.valueOf(subnetID), String.valueOf(meID));
	}

	public static void main(String[] args) {
		Object o = Boolean.valueOf(false);
		System.out.println((String)o);
	}
}