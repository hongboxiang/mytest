package com.hbx.string;

/**
 * Created by 10180885 on 16-6-24.
 */
public class Stringuse {
	public static void main(String[] args) {
		String strIsnull = "";
		String strIsNum = "003";
		String strIsNotNum = "sd2223";
		appendSingleQuote2(strIsNum);
		System.out.println("strIsnull: " + appendSingleQuote(strIsnull));
		System.out.println("strIsNum: " + strIsNum);
		System.out.println("strIsNotNum: " + appendSingleQuote(strIsNotNum));
	}

	public static  String appendSingleQuote(String str) {
		return "'" + str + "'";
	}

	public static  void appendSingleQuote2(String str) {
		str =  "'" + str + "'";
	}
}
