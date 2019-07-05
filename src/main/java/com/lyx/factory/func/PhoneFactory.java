package main.java.com.lyx.factory.func;

import main.java.com.lyx.factory.model.Apple;
import main.java.com.lyx.factory.model.Huawei;
import main.java.com.lyx.factory.model.Phone;
import main.java.com.lyx.factory.model.Samsung;
import main.java.com.lyx.factory.model.Yijia;
import main.java.com.lyx.factory.abstr.AbstractFactory;

public class PhoneFactory extends AbstractFactory {

  @Override
  public Phone getApple() {
    return new Apple();
  }

  @Override
  public Phone getSamsung() {
    return new Samsung();
  }

  @Override
  public Phone getYijia() {
    return new Yijia();
  }

  @Override
  public Phone getHuawei() {
    return new Huawei();
  }
}
