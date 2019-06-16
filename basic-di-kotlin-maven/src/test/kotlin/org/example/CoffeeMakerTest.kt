package org.example

import io.dinject.SystemContext
import org.junit.Test

import org.junit.Assert.*

class CoffeeMakerTest {

    @Test
    fun makeCoffee() {

      val coffeeMaker = SystemContext.getBean(CoffeeMaker::class.java)

      coffeeMaker.makeCoffee()
    }
}
