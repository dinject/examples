package org.example.web

import io.dinject.controller.Controller
import io.dinject.controller.Get
import io.dinject.controller.Path
import org.example.service.MyService

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

    class HiDto(id: Long?, var other: String?)
}
