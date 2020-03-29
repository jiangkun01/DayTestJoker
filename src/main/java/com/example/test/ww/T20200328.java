package com.example.test.ww;



import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @email 467288604@qq.com
 * @author: joker
 * @date: 2020/3/28
 * @time: 17:02
 */
public class T20200328 {
    public static void main(String[] args){
        countDown(1,2);
        NoAbstract noAbstract=(String a,String b)->{
            return a+b;
        };
        noAbstract.getString();
        noAbstract.get("a","b");
        NoAbstract noAbstract1=new NoAbstract.NoAbstractImpl();
        noAbstract1.getString();

        String[] names={"joker","luce"};
        List<PersonTest> list= Arrays.stream(names).map(PersonTest::new).collect(Collectors.toList()); // 构造器构造


    }
    // lambda
    // 1) 函数式接口
    // 前 面 已 经 讨 论 过， Java 中 已 经 有 很 多 封 装 代 码 块 的 接 口， 如 ActionListener 或
    //Comparatorlambda 表达式与这些接口是兼容的，
    // 2）构造器引用
    //ambda 表达式的重点是延迟执行 deferred execution )
    //•多次运行代码； •在算法的适当位置运行代码（例如， 排序中的比较操作；)
    // 发生某种情况时执行代码（如， 点击了一个按钮， 数据到达， 等等；) •
    // 只在必要时才运行代码。
    //如果你无意中增加了另一个非抽象方法， 编译
    //器会产生一个错误消息。 另外 javadoc 页里会指出你的接口是一个函数式接口。
    public static void countDown(int start, int delay) {
        ActionListener listener = event -> {
            // Error: Can't mutate captured variable
            System.out.println(start);
        };
        new Timer(delay, listener).start();
    }
}
