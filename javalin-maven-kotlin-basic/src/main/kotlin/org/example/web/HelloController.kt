package org.example.web

import io.dinject.controller.*
import javax.validation.Valid

@Controller
@Path("/hello")
class HelloController {

  /**
   * Find the Hello by id.
   *
   * This has some more interesting detail to document.
   *
   * @param id The hello identity
   * @return The hello
   */
  @Get(":id")
  fun getById(id: Long): HiDto {
    return HiDto(id, "Hello")
  }

  @Valid @Post
  fun save(hi: HiDto) {
    println("saving $hi")
  }

  @Valid @Form @Post("asform")
  fun saveForm(hi: HelForm) {
    println("saving $hi")
  }

  data class HelForm(var id: Long, var email: String, var url: String, var description: String)

  //  class HelloDto() {
//
//    constructor(id: Long, name: String) : this() {
//      this.id = id
//      this.name = name
//    }
//
//    var id: Long = 0
//
//    @NotNull
//    var name: String? = null
//  }
}
