package org.example

import javax.inject.Singleton

/**
 * Only 1 constructor so no need for @Inject
 */
@Singleton
class Grinder(var pump: Pump) {

  fun grind(): String {

    println("grinding ...")
    return "grind " + pump.pump()
  }
}
