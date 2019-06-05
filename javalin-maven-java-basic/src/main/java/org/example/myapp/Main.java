package org.example.myapp;

import io.dinject.SystemContext;
import io.dinject.controller.InvalidPathArgumentException;
import io.dinject.controller.InvalidTypeArgumentException;
import io.dinject.controller.WebRoutes;
import io.javalin.Javalin;
//import org.eclipse.jetty.server.Connector;
//import org.eclipse.jetty.server.Server;
//import org.eclipse.jetty.server.ServerConnector;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {

    Javalin app = Javalin.create().disableStartupBanner();

    app.accessManager((handler, ctx, permittedRoles) -> {
      System.out.println("allow access ...");
      handler.handle(ctx);
    });


    app.exception(InvalidTypeArgumentException.class, (exception, ctx) -> {

      Map<String, String> map = new LinkedHashMap<>();
      map.put("path", ctx.path());
      map.put("message", "invalid type argument");
      ctx.json(map);
      ctx.status(400);
    });

    app.exception(InvalidPathArgumentException.class, (exception, ctx) -> {

      Map<String, String> map = new LinkedHashMap<>();
      map.put("path", ctx.path());
      map.put("message", "invalid path argument");
      ctx.json(map);
      ctx.status(404);
    });


    app.get("/", ctx -> {
      ctx.result("Hello World");
    });

    // All WebRoutes / Controllers ... from DI Context
    List<WebRoutes> webRoutes = SystemContext.getBeans(WebRoutes.class);
    app.routes(() -> webRoutes.forEach(WebRoutes::registerRoutes));

    app.start(7000);
  }
}
