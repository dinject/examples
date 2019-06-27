package org.example

import org.junit.Test

class MainTest {

    @Test
    fun createApp() {

      val app = Main().createApp(emptyArray())

      app.start(10801)


    }
}
