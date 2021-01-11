package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.locks.ReentrantLock;

public class TestAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register();
//        annotationConfigApplicationContext.getBean();
        ReentrantLock reentrantLock =new ReentrantLock();
        reentrantLock.lock();
        reentrantLock.unlock();
      //  amethod(args);
    }

    public  void amethod(String[] s){
        System.out.println(s);
        System.out.println(s[1]);
    }

    public void getUsers(int x1,String x2){
        float f=1.3f;
        short s1 =1;
        s1=(short)(s1+1);
    }

    public String getUsers(int s1,String s2,int s3){
        int i = 9;
        String.valueOf(i);
        String s = ""+i;
        return  Integer.toString(i);

    }


}
