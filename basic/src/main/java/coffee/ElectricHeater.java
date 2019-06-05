package coffee;

import aframework.Controller;
import coffee.sub.Widget;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Controller
@Singleton
@Named("electric")
public class ElectricHeater implements Heater {

  boolean heating;

  final Widget widget;

  @Inject
  public ElectricHeater(Widget widget) {
    this.widget = widget;
  }

  @Override
  public void on() {
    System.out.println("~ ~ ~   heating ~ ~ ~");
    //widget.doStuff();
    this.heating = true;
  }

  @Override
  public void off() {
    this.heating = false;
  }

  @Override
  public boolean isHot() {
    return heating;
  }


}
