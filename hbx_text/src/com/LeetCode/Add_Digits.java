package com.LeetCode;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
   For example:
   Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * Created by 10180885 on 15-12-24.
 */
public class Add_Digits {
    public static void main(String[] args) {
        System.out.println(addDigits3(148));
    }

    public static int addDigits(int num) {
        int i = 0;
        int sum = Integer.MAX_VALUE;
        String s = String.valueOf(num);
        System.out.println("s:" + num);
        while(sum >= 10) {
            sum = 0;
            i = 0;
            while (i < s.length()) {
                sum += Integer.parseInt(s.substring(i, i + 1));
                System.out.println("L sum:" + sum);
                i++;
            }
            System.out.println("M sum:" + sum);
            s = String.valueOf(sum);
        }
        return sum;
    }

    public static int addDigits2(int num) {
        while(num >= 10) {
            num = num%10 + num/10;
        }
        return num;
    }

    public static int addDigits3(int num) {
        return num == 0 ? 0 : (num%9);
    }
}
