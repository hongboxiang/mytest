package com.hbx.string;

/**
 * Created by 10180885 on 16-6-28.
 */
public class test {
	String getMoi(long subnetID, long meID) {
		return String.format("SubNetwork={0},MEID={1}", String.valueOf(subnetID), String.valueOf(meID));
	}

	public static void main(String[] args) {
		Long subnetID = 20160506L;
		Long meID = -333333333333333L;
		String str = String.format("SubNetwork=%s,MEID=%d", subnetID, meID);
		System.out.println(str);
	}
}