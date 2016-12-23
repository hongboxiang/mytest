package com.hbx.string;

import java.util.regex.Pattern;

/**
 * Created by 10180885 on 16-4-25.
 */
public class StringIsNum {
	public static void main(String[] args) {
		String strIsnull = "";
		String strIsNum = "003";
		String strIsNotNum = "sd2223";
		System.out.println("strIsnull: " + isNumeric(strIsnull));
		System.out.println("strIsNum: " + isNumeric(strIsNum));
		System.out.println("strIsNotNum: " + isNumeric(strIsNotNum));
	}

	public static boolean isNumeric(String str){
		Pattern pattern = Pattern.compile("[0-9]+");
		return pattern.matcher(str).matches();
	}
}
