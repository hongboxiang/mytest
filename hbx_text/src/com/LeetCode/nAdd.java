package com.LeetCode;

/**
 * 要求不用循环和本地变量。给正整数n，以2n, 4n, 8n的方式递增，当大于5000时，以特定方式输出。
    比如  n = 1234,
    输出结果为：  1234
                2468
                4936
                9872
                9872
                4936
                2468
                1234
 * Created by 10180885 on 15-12-23.
 */
public class nAdd {
    public static void main(String[] args) {
        disployCycle(1234);
    }


    public static void disployCycle(int n){
        if(n<=5000) {
            System.out.println(n);
            disployCycle(n * 2);
            System.out.println(n);
        }
        else{
            System.out.println(n);
            System.out.println(n);
        }
    }
}
