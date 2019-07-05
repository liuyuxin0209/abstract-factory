package main.java.com.lyx.factory;

import main.java.com.lyx.factory.func.PhoneFactory;

public class Test {

  public static void main(String[] args) {
    //实例工厂
    PhoneFactory factory = new PhoneFactory();
    //获取相应名牌电话
    System.out.println(factory.getApple().getName());
  }
}
