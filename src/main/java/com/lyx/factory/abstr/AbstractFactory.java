package main.java.com.lyx.factory.abstr;

import main.java.com.lyx.factory.model.Phone;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {

  protected abstract Phone getApple();

  public abstract Phone getSamsung();

  public abstract Phone getYijia();

  public abstract Phone getHuawei();
}
