package org.example

import javax.inject.Singleton

@Singleton
class CoffeeMaker(private val pump: Pump , private val grinder: Grinder)  {

  fun makeCoffee() {

    pump.pump()
    grinder.grind()
  }
}

