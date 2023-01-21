package coffee.app.main;

import jakarta.inject.Singleton;

@Singleton
public class MainWithMaker {

  private final CoffeeMaker maker;

  public MainWithMaker(CoffeeMaker maker) {
    this.maker = maker;
  }
}
