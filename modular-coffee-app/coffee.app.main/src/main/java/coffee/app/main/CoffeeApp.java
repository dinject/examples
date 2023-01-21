package coffee.app.main;

import io.avaje.inject.BeanScope;

public class CoffeeApp {

  public static void main(String[] args) {
    try (BeanScope scope = BeanScope.builder()
      .build()) {
      var maker = scope.get(CoffeeMaker.class);
      maker.brew();
    }
  }
}
