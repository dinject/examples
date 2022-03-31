package coffee.app.heater.core;

import coffee.app.heater.Heater;
import jakarta.inject.Singleton;

@Singleton
public class ElectricHeater implements Heater {

  private boolean heating;

  public void on() {
    System.out.println("~~~heating core ElectricHeater ~~~");
    this.heating = true;
  }

  public void off() {
    this.heating = false;
  }

  public boolean isHot() {
    return this.heating;
  }

}
