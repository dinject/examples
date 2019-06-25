package org.example

import io.dinject.SystemContext
import org.junit.Test
import kotlin.test.assertNotNull

class HelloControllerTest {

    @Test
    fun test() {

        val bean = SystemContext.getBean(HelloController::class.java)
        assertNotNull(bean)
    }
}
