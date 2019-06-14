package coffee;

import aframework.Controller;
import io.dinject.BeanContext;
import io.dinject.BootContext;
import io.dinject.SystemContext;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

public class CoffeeMakerTest {

  @Test
  public void brew_via_SystemContext() {
    SystemContext.getBean(CoffeeMaker.class).brew();
  }

  @Test
  public void brew() {

    try (BeanContext context = new BootContext().load()) {

      CoffeeMaker maker = context.getBean(CoffeeMaker.class);
      maker.brew();

      List<Controller> contollerBeans = context.getBeans(Controller.class);
      assertThat(contollerBeans).hasSize(2);
    }

  }

  @Test
  public void testWith_mocksAndSpy() {

    try (BeanContext context = new BootContext()
      .withMock(Heater.class)
      .withSpy(Pump.class)
      .load()) {

      Pump pump = context.getBean(Pump.class);

      doNothing().when(pump).pump();

      CoffeeMaker maker = context.getBean(CoffeeMaker.class);
      maker.brew();

      verify(pump).pump();

      Heater heater = context.getBean(Heater.class);
      verify(heater).on();
      verify(heater).off();
    }
  }
}
