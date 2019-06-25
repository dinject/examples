package org.example

import io.dinject.controller.Controller
import io.dinject.controller.Get
import io.dinject.controller.Path

@Controller
@Path("/hello")
class HelloController {

  @Get(":id")
  fun getById(id: Long): HelloDto {
    return HelloDto()
  }

  class HelloDto {
    var id: Long = 0
    var name: String? = null

  }
}
