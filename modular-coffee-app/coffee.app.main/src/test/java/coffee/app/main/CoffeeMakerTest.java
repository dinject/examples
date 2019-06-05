package coffee.app.main;

import io.dinject.SystemContext;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeMakerTest {

  @Test
  public void brew() {

    var maker = SystemContext.getBean(CoffeeMaker.class);
    maker.brew();
  }
}
