package coffee.app.main;

import io.avaje.inject.BeanScope;
import org.junit.jupiter.api.Test;

class CoffeeMakerTest {

  @Test
  void brew() {
    try (BeanScope scope = BeanScope.newBuilder().build()) {
      var maker = scope.get(CoffeeMaker.class);
      maker.brew();
    }
  }
}
