package org.example.main

import io.dinject.SystemContext
import io.dinject.controller.WebRoutes
import io.javalin.Javalin
import java.util.function.Consumer

fun main(args: Array<String>) {

  val app = Javalin.create().disableStartupBanner()

  val webRoutes = SystemContext.getBeans(WebRoutes::class.java)

  app.routes { webRoutes.forEach(Consumer { it.registerRoutes() }) }
  app.start(7000)

  println("started ...")
}
