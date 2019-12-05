package org.example.domain

import org.example.domain.query.QCustomer
import org.junit.Test
import kotlin.test.assertNotNull

class CustomerTest {

  @Test
  fun test() {

    var customer = Customer()
    customer.name = "hello"
    customer.save()

    val one = QCustomer()
      .name.eq("hello")
      .findOne()

    assertNotNull(one)
  }
}
