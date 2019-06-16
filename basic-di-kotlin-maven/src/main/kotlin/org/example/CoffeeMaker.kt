package org.example

import javax.inject.Singleton

@Singleton
class CoffeeMaker(val pump: Pump , val grinder: Grinder)  {


  fun makeCoffee() {

    pump.pump()
    grinder.grind()
  }
}

