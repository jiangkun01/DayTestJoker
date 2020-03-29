package com.example.test.ww.innerclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @email 467288604@qq.com
 * @author: joker
 * @date: 2020/3/29
 * @time: 9:32
 * 内部类方法可以访问该类定义所在的作用域中的数据，包括私有的数据。
 * •内部类可以对同一个包中的其他类隐藏起来。
 * •当想要定义一个回调函数且不想编写大量代码时，使用匿名 （anonymous) 内部类比较
 * 便捷。likedList
 * ， 它引用了实例化该内部对象的外围类对象。
 * 内部类
 * 局类
 * 匿名类
 * 静态类
 */
public class InnerClassTest {
    private int interval;
    private boolean beep;
    public InnerClassTest(int interval, boolean beep) {
        this.interval=interval;
        this.beep=beep;
    }
    public void start(){
        ActionListener listener = new TimePrint();
        Timer t = new Timer(interval, listener); t.start();
    }

    public class TimePrint implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("new Time"+new Date());
            if(beep==true){

                Toolkit.getDefaultToolkit().beep();// 电脑bb生

            }
        }
    }

    public static void main(String[] args){

        InnerClassTest clock = new InnerClassTest(1000, true);
         clock.start();

     // keep program running until user selects "0k"
         JOptionPane.showMessageDialog(null, "Quit program?");
         System.exit(0);

    }
}
