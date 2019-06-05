package coffee;

import coffee.sub.Widget;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Optional;

@Singleton
class Pump {

  private final Heater heater;

  private final Optional<Widget> widget;

  @Inject
  Pump(Heater heater, Optional<Widget> widget) {
    this.heater = heater;
    this.widget = widget;
  }

  public void pump() {
    if (widget.isPresent()) {
      widget.get().doStuff();
    }

    if (heater.isHot()) {
      System.out.println("=> => pumping => =>");
    } else {
      System.out.println("cold pumping");
    }
  }

}
