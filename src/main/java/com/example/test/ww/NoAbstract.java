package com.example.test.ww;


/**
 * @email 467288604@qq.com
 * @author: joker
 * @date: 2020/3/28
 * @time: 17:17
 */
@FunctionalInterface // 只有一个抽象类 允许有默认方法和static
public interface NoAbstract  {
  default String getString(){ // 非抽象方法
      System.out.println("进入默认方法");
      return "123";
  }

    static String get() {
        return null;
    }

    String get(String before,String after);
  class NoAbstractImpl implements NoAbstract{
      @Override
   public String getString(){
          System.out.println("进入接口实现");
       return "12";
   }


      @Override
      public String get(String before, String after) {
          return null;
      }
  }
}
