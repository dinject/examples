package org.example.main;

import io.dinject.SystemContext;
import io.dinject.controller.WebRoutes;
import io.javalin.Javalin;

import java.util.List;

public class Main {

  public static void main(String[] args) {

    Javalin app = Javalin.create(config -> {
      config.showJavalinBanner = false;
    });

    List<WebRoutes> webRoutes = SystemContext.getBeans(WebRoutes.class);
    app.routes(() -> webRoutes.forEach(WebRoutes::registerRoutes));

    app.get("/", ctx -> ctx.result("Hello World"))
      .start(7000);
  }
}
