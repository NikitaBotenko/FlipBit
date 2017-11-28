package com.company;

import java.util.Map;

public class Main {
    public static int flipBit(int number, int bitIndex){
        int sdvig = number << bitIndex;
        int result = number ^ sdvig;
        return result;
//        String t = Integer.toBinaryString(number);
//        long num = Long.parseLong(t);
//        long num2 = num<<bitIndex;
//        long result = num ^ num2;
//        int decimalResult = convertToDecimal(result);
//        return decimalResult;
    }

    public static int  convertToDecimal(long binary){
        final int two = 2;
        int k = 0;
        int decimalNumber=0;
        while(binary!=0){
            long temp = binary % 10;
            if(temp == 1)
            {
                decimalNumber += temp* Math.pow(two,k);
                k++;
            }
            else if(temp ==0)
            {
                decimalNumber += 0;
                k++;
            }
            binary/=10;
        }
        return decimalNumber;
    }
    public static String convertToBinary(int decimalNumber){
        int a;
        String temp= " ";
        while(decimalNumber !=0){
            a = decimalNumber % 2;
            temp = a + temp;
            decimalNumber = decimalNumber/2;
        }
        return temp;

    }

    public static void main(String[] args) {
        System.out.println(flipBit(10,2));
        String x = "1010";
        long y = Long.parseLong(x);
        System.out.println(y);
        long z = 3 <<1;
        System.out.println(z);
        System.out.println("d,lr;g");


    }
}
