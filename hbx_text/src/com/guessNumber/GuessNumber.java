package com.guessNumber;

import java.util.Random;
import java.util.Scanner;

/**
 * ��������ʱ�Զ�����1-100 ������������û������������ݲ�����ָʾ��Ϣ��ֱ���¶ԣ�
 * ��Ϸ�߲¶Ժ���ʾ�¶Դ��������ṩ�����¿�ʼ���롰�˳������ܣ��˴�����Ҫ����
 * Created by 10180885 on 16-2-23.
 */
public class GuessNumber {

    public static final String less = "С��";
    public static final String more = "����";
    public static final String equal = "����";

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
                System.out.println(scanner.next() + " ��ʽ����");
            }
        } while (number == GuessConst.RESTART);
    }

    public void guess() {
        int result = randomIn1_100();
        int number;
        System.out.println("��������ʱ�Զ�����1-100 �����,��");
        Scanner scanner = new Scanner(System.in);
        while (result != 0) {
            try {
                if(scanner.hasNextInt()) {
                    number = scanner.nextInt();
                }else{
                    System.out.println(scanner.next() + " ��ʽ����");
                    continue;
                }
                String compareResult = compare(result, number);
                System.out.println(compareResult);
                if (equal.equals(compareResult)) {
                    result = 0;
                    System.out.println("�� " + GuessConst.RESTART + "�����¿�ʼ\n �� " + GuessConst.QUIT + "���˳�");
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
