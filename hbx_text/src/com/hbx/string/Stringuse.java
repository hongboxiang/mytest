package com.hbx.string;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by 10180885 on 16-6-24.
 */
public class Stringuse {
	public static final String SUBNET_FORMAT = "^[0-9&]*$";

	public static Map<String, String> urlEncodeMap;
		static {
			urlEncodeMap = new HashMap<String, String>();
			urlEncodeMap.put("%2F", "/");
			urlEncodeMap.put("%3A", ":");
			urlEncodeMap.put("%40", "@");
			urlEncodeMap.put("\\+", "%20");
		}

	public static void main(String[] args) throws IOException, URISyntaxException {
		String subnet = "&9&&&&10&";
		String[] subnetListString = subnet.split("&");
		System.out.println(subnetListString);
	}

	public static  String appendSingleQuote(String str) {
		return "'" + str + "'";
	}

	public static  void appendSingleQuote2(String str) {
		str =  "'" + str + "'";
	}
}
