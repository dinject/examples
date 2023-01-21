package coffee.app.pump.core;

import coffee.app.heater.Heater;
import coffee.app.pump.Pump;
import jakarta.inject.Singleton;


@Singleton
class Thermosiphon implements Pump {

  private final Heater heater;

  Thermosiphon(Heater heater) {
    this.heater = heater;
  }

  public void pump() {
    if (heater.isHot()) {
      System.out.println("=> => pumping core Thermosiphon => => as");
    }
  }

}
