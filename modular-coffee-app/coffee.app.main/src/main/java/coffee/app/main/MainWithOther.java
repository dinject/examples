package coffee.app.main;

import io.avaje.inject.Component;

@Component
public class MainWithOther {

  private final MainWithNo no;

  public MainWithOther(MainWithNo no) {
    this.no = no;
  }
}
