package org.example

import io.dinject.SystemContext

fun main(args: Array<String>) {

  val coffeeMaker = SystemContext.getBean(CoffeeMaker::class.java)

  coffeeMaker.makeCoffee()

}

