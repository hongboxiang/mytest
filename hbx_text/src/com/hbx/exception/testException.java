package com.hbx.exception;

/**
 * Created by 10180885 on 15-9-1.
 */
public class testException {
    public static void main(String[] args)
    {
        canICatch();
    }

    private static void canICatch() {
        try{
            iCatch();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("can i catch?: " + e);
        }

    }

    private static void iCatch(){
        try{
            int i = 1;
            i = i/0;
        }catch (Exception e){
            System.out.println("i catched: " + e);
            throw new RuntimeException(e);
        }
    }
}
