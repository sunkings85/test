package com.test;

public class test1 {

    public static void main(String[] args) {
        System.out.println(reverString("abcdefgh"));
    }

    private static String reverString(String str) {
        if(str ==null){
            return null;
        }
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length/2;i++){
            char c1 = chars[i];
            char c2= chars[chars.length-i-1];
            chars[i] =c2;
            chars[chars.length-i-1]= c1;
        }

        StringBuffer stringBuffer =new StringBuffer();
        stringBuffer.append(str);
        System.out.println("stringBuffer:"+stringBuffer.reverse());

        String ret = String.copyValueOf(chars);
        return ret;



    }


}
