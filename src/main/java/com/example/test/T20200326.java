package com.example.test;

import com.example.test.ww.LamdaTest;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;


/**
 * @email 467288604@qq.com
 * @author: joker
 * @date: 2020/3/26
 * @time: 22:10
 */
public class T20200326 {
    private LamdaTest lamdaTest;
    public T20200326(LamdaTest lamdaTest){
        this.lamdaTest=lamdaTest;
    }
     void test(int a,int b){
        lamdaTest.add(a,b);
    }
    //  java 虚拟机区 （1）java虚拟机栈  （2）程序计数器  （3）本地方法栈)（4）堆（线程共享）
    //
    // 本地内存（5） 元数据区 直接内存 （线程共享）

    //（2）每个线程一块，指向当前线程正在执行的字节码代码的行号。如果当前线程执行的是native方法，则其值为null。
    //（1）线程私有，每个线程对应一个Java虚拟机栈，其生命周期与线程同进同退。每个Java方法在被调用的时候都会创建一个栈帧，
    //   并入栈。一旦完成调用，则出栈。所有的的栈帧都出栈后，线程也就完成了使命。 线栈 局部变量表-- 8大基本类型 对象引用
    //（3）功能与Java虚拟机栈十分相同。区别在于，本地方法栈为虚拟机使用到的native方法服务。不多说。
    //（4） 堆是JVM内存占用最大，管理最复杂的一个区域。其唯一的用途就是存放对象实例：
    //   几乎所有的对象实例及数组都在对上进行分配。1.7后，字符串常量池从永久代中剥离出来，存放在堆中。
    //   堆有自己进一步的内存分块划分，按照GC分代收集角度的划分请参见上图
    //   老年代 ： 三分之二的堆空间
    //   年轻代 ： 三分之一的堆空间
    //   eden区： 8/10 的年轻代空间
    //    survivor0 : 1/10 的年轻代空间
    //   survivor1 : 1/10 的年轻代空间
    // jvm jdk 1.8 内存分配
    // （5）元数据区和永久代本质上都是方法区的实现。方法区存放虚拟机加载的类信息，静态变量，常量等数据。
    private static final String AGE="32";

    public static void main(String[] args){
        String d="1234";
        String c="1234"; // 不在重新分配
        System.out.println(d.getClass()+"==="+c.getClass());
        LamdaTest lamdaTest=(a,b)->{
          return a+b;
        };
        System.out.println(lamdaTest.add(3,4));

        String[] planets = new String[] { "Mercury" , "Venus" , "Earth" , "Mars" , "Jupiter" , "Saturn" , "Uranus" , "Neptune" };
        System.out.println(Arrays.toString(planets));
        System.out. println("Sorted in dictionary order:") ;
        Arrays.sort(planets);
        System.out.println (Arrays.toString(planets));
        System.out . println ("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second .length()) ;
        System.out. println(Arrays.toString(planets));
        Timer t = new Timer(1000, event ->
                System.out.println ("The time is " + new Date()));
        t.start();
        // keep program running until user selects "0k"
        JOptionPane.showMessageDialog (null , "Quit program?");
        System.exit(0);
    }



}
