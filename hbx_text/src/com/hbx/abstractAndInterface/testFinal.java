package com.hbx.abstractAndInterface;

/**
 * Created by 10180885 on 16-3-17.
 */
public class testFinal {

        /**
         *
         * @param args
         */
        public static void main(String[] args) {
            MyClass myClass = new MyClass();
            int i = 0;
            myClass.setI(i);
            i++;
            System.out.println(i);
            myClass.outI();
        }

    }

    class MyClass {
        private int i;

        public void setI(final int i) {
            this.i = i;
        }

        public void outI() {
            System.out.println(this.i);
        }
    }
