package org.example

import io.dinject.SystemContext
import io.dinject.controller.RequiredArgumentException
import io.dinject.controller.WebRoutes
import io.javalin.Javalin
import io.javalin.http.ExceptionHandler
import java.util.LinkedHashMap
import java.util.function.Consumer

fun main(args: Array<String>) {

  val app = Main().createApp(args)
  app.start(8080)
}

class Main {

  fun createApp(args: Array<String>): Javalin {

    val app = Javalin.create { config ->
      config.showJavalinBanner = false

    }
    app.exception(RequiredArgumentException::class.java) { exception, ctx ->

      val map = LinkedHashMap<String, Any?>()
      map["message"] = exception.message
      map["errors"] = mapOf((exception.property?:"pr") to exception.message!!)
      ctx.json(map)
      ctx.status(400)
    }

    val webRoutes = SystemContext.getBeans(WebRoutes::class.java)
    app.routes { webRoutes.forEach(Consumer { it.registerRoutes() }) }

    return app
  }
}

