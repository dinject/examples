package org.example.web

import io.dinject.controller.*
import org.example.service.MyService
import java.time.LocalDate

/**
 * Our Hi resource manager.
 *
 * Does lots of good stuff.
 */
@Controller
@Path("/")
class HiController(private val myService: MyService) {

  /**
   * Return all the Hi's we have.
   */
  @Get
  fun getAll(): String {
    return myService.hello() + " hello"
  }

  /**
   * Get by hi identifier.
   *
   * Performs a useful thing with hi resources.
   *
   * @param id The identifier
   * @param other The other thing
   */
  @Get("/:id")
  fun getById(id: Long, other: String?): HiDto {

    return HiDto(id, other)
  }

  @Post
  @Form
  fun saveIt(form: SaveForm) {

    println("saving $form")
  }

  data class SaveForm(var id: Long, var name: String, var someDate: LocalDate?)

  class HiDto(id: Long?, var other: String?)
}
