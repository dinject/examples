package org.example.web

import io.dinject.controller.Controller
import io.dinject.controller.Get
import io.dinject.controller.Path

@Controller
@Path("/")
class HiController {

  @Get//("/")
  fun getRoot() : String {
    return "hello"
  }

  @Get("/:id")
  fun getById(id: Long, other: String?) : HiDto {

    return HiDto(id, other)
  }

  class HiDto {

    var id: Long? = null
    var other: String? = null

    constructor(id: Long, other: String?) {
      this.id = id
      this.other = other;
    }
  }
}
