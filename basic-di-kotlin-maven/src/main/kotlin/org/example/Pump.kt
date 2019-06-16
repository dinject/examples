package org.example

import javax.inject.Singleton

@Singleton
class Pump {

  fun pump(): String {
    println("pumping ...")
    return "pumping stuff"
  }
}
