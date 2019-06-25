package org.example

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Only 1 constructor so no need for @Inject
 */
@Singleton
class Grinder {

  @Inject
  lateinit var pump: Pump

  fun grind(): String {

    println("grinding ...")
    return "grind " + pump.pump()
  }
}
