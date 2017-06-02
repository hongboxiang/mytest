package com.hbx.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Operation {
    private static final int DEF_DIV_SCALE = 10;

    private Operation() {

    }

    public static void main(String[] args)
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = null;
        try
        {
            str = br.readLine();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        if (null != str && (str.contains("+")||str.contains("-")||str.contains("*")||str.contains("/")))
        {
            System.out.println(result(str));
        }

    }
    public static double result(String str)
    {
        double result = 0;
        if (null != str)
        {
            if (str.contains("+"))
            {
                if (str.indexOf("+") == str.lastIndexOf("+"))
                {
                    String str1 = str.substring(0,str.indexOf("+"));
                    String str2 = str.substring(str.indexOf("+")+1);
                    Double temp1 = Double.valueOf(str1);
                    Double temp2 = Double.valueOf(str2);
                    result = add(temp1,temp2);
                }
            }
            if (str.contains("-"))
            {
                if (str.indexOf("-") == str.lastIndexOf("-"))
                {
                    String str1 = str.substring(0,str.lastIndexOf("-"));
                    String str2 = str.substring(str.indexOf("-")+1);
                    Double temp1 = Double.valueOf(str1);
                    Double temp2 = Double.valueOf(str2);
                    result = sub(temp1,temp2);
                }
            }
            if (str.contains("*"))
            {
                if (str.indexOf("*") == str.lastIndexOf("*"))
                {
                    String str1 = str.substring(0,str.lastIndexOf("*"));
                    String str2 = str.substring(str.indexOf("*")+1);
                    Double temp1 = Double.valueOf(str1);
                    Double temp2 = Double.valueOf(str2);
                    result = mul(temp1,temp2);
                }
            }
            if (str.contains("/"))
            {
                if (str.indexOf("/") == str.lastIndexOf("/"))
                {
                    String str1 = str.substring(0,str.lastIndexOf("/"));
                    String str2 = str.substring(str.indexOf("/")+1);
                    Double temp1 = Double.valueOf(str1);
                    Double temp2 = Double.valueOf(str2);
                    result = div(temp1,temp2);
                }
            }
        }
        return result;
    }
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    public static double sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    public static double mul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    public static double div(double v1, double v2) {
        return div(v1, v2, DEF_DIV_SCALE);
    }

    public static double div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
