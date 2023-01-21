package coffee.app.pump.core;

import jakarta.inject.Singleton;

@Singleton
public class PumpTwo {

  final PumpOne one;

  public PumpTwo(PumpOne one) {
    this.one = one;
  }
}
