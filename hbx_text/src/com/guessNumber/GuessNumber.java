package com.guessNumber;

import java.util.Random;
import java.util.Scanner;

/**
 * 程序运行时自动产生1-100 随机数，接受用户键盘输入数据并给出指示信息，直至猜对，
 * 游戏者猜对后，显示猜对次数，并提供“重新开始”与“退出”功能（此处最重要）。
 * Created by 10180885 on 16-2-23.
 */
public class GuessNumber {

    public static final String less = "小了";
    public static final String more = "大了";
    public static final String equal = "中了";

    public static void main(String[] args) {
        guessStart();
    }

    public static void guessStart() {
        Scanner scanner = new Scanner(System.in);
        GuessNumber guessNumber = new GuessNumber();
        int number = 0;
        do {
            guessNumber.guess();

            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
            }else{
                System.out.println(scanner.next() + " 格式错误！");
            }
        } while (number == GuessConst.RESTART);
    }

    public void guess() {
        int result = randomIn1_100();
        int number;
        System.out.println("程序运行时自动产生1-100 随机数,猜");
        Scanner scanner = new Scanner(System.in);
        while (result != 0) {
            try {
                if(scanner.hasNextInt()) {
                    number = scanner.nextInt();
                }else{
                    System.out.println(scanner.next() + " 格式错误！");
                    continue;
                }
                String compareResult = compare(result, number);
                System.out.println(compareResult);
                if (equal.equals(compareResult)) {
                    result = 0;
                    System.out.println("按 " + GuessConst.RESTART + "：重新开始\n 按 " + GuessConst.QUIT + "：退出");
                } else {
                }
            } catch (Exception e){
                e.printStackTrace();
               throw new RuntimeException(e);
            }
        }
    }

    public int randomIn1_100() {
        Random random = new Random();
        return random.nextInt(99) + 1;
    }

    public String compare(int answer, int number) {
        if (number < answer) {
            return less;
        } else if (number > answer) {
            return more;
        } else {
            return equal;
        }

    }
}
