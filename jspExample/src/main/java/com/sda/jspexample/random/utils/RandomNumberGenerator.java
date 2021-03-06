package com.sda.jspexample.random.utils;

import java.util.Random;

public class RandomNumberGenerator {

    private static int ID_SEQUENCE = 0;

    public static int getNextSequence(){
        return ++ID_SEQUENCE;
    }

    public static String drawLottoNumbers(){
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<6;i++){
            if (i!= 0){
                sb.append(", ");
            }
            sb.append(random.nextInt(49)+1);
        }
        return sb.toString();
    }


}
