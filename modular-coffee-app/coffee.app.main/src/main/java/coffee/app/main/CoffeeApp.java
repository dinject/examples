package coffee.app.main;

import io.avaje.inject.BeanScope;

public class CoffeeApp {

  public static void main(String[] args) {
    try (BeanScope scope = BeanScope.newBuilder()
      .build()) {
      var maker = scope.get(CoffeeMaker.class);
      maker.brew();
    }
  }
}
