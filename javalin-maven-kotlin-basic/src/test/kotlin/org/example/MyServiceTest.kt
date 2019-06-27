package org.example

import io.dinject.SystemContext
import org.example.service.MyService
import org.junit.Test

class MyServiceTest {

    @Test
    fun test() {

        val bean = SystemContext.getBean(MyService::class.java)
        bean.doStuff()
    }
}
