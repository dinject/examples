package org.example.service

import io.dinject.SystemContext
import org.junit.Test

import org.junit.Assert.*

class MyServiceTest {

    @Test
    fun hello() {

      val bean = SystemContext.getBean(MyService::class.java)
      assertEquals("hello", bean.hello())
    }
}
