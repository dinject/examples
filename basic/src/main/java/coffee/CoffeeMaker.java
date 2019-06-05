package coffee;

import aframework.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Named("asd")
@Controller
@Singleton
class CoffeeMaker {

  private final Heater heater;

  private final Pump pump;

  @Inject
  CoffeeMaker(Heater heater, Pump pump) {
    this.heater = heater;
    this.pump = pump;
  }

  public void brew() {
    heater.on();
    pump.pump();
    System.out.println(" [_]P coffee! [_]P ");
    heater.off();
  }

  @PostConstruct
  public void onConst() {
    System.out.println("postConstruct");
  }


  @PreDestroy
  public void destroy() {
    System.out.println("destroy");
  }
}
