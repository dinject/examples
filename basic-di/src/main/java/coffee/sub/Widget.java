package coffee.sub;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Widget  {

//  @Inject
//  Widget() {
//
//  }

  public void doStuff() {
    System.out.println("=> => widget => =>");
  }

  @PostConstruct
  public void postConstruct() {
    System.out.println("Widget postConstruct");
  }


  @PreDestroy
  public void destroy() {
    System.out.println("Widget destroy");
  }
}
