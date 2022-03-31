package coffee.app.main;

import coffee.app.heater.Heater;
import coffee.app.pump.Pump;
import jakarta.inject.Singleton;


@Singleton
public class CoffeeMaker {

  private final Heater heater;
  private final Pump pump;

  public CoffeeMaker(Heater heater, Pump pump) {
    this.heater = heater;
    this.pump = pump;
  }

  public void brew() {
    heater.on();
    pump.pump();
    System.out.println("[_]P Coffee [_]P");
    heater.off();
  }
}
