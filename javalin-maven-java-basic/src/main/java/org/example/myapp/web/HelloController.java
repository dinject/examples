package org.example.myapp.web;

import io.dinject.controller.Controller;
import io.dinject.controller.Delete;
import io.dinject.controller.Get;
import io.dinject.controller.Path;
import io.dinject.controller.Post;
import io.javalin.Context;
import org.example.myapp.service.MyService;

import javax.inject.Inject;
import java.util.List;

import static org.example.myapp.web.AppRoles.ADMIN;

/**
 * Hello resource manager.
 * <p>
 * Simple API for Hello resources.
 */
@Controller
@Path("/hello")
class HelloController {

  private final MyService myService;

  @Inject
  HelloController(MyService myService) {
    this.myService = myService;
  }

  /**
   * Return the Hello DTO.
   *
   * @param id         The hello Id.
   * @param name       The name of the hello
   * @param otherParam Optional other parameter
   * @return The Hello DTO given the id and name.
   */
  @Get("/:id/:name")
  HelloDto hello(int id, String name, String otherParam) {
    return new HelloDto(id, name, otherParam);
  }


  @Roles({ADMIN})
  @Post("/:foo")
  void save(String foo, HelloDto dto, Context context) {
    // save hello data ...
  }

  @Get
  List<HelloDto> getAll() {
    return myService.findAll();
  }

  @Delete(":id")
  void deleteById(int id) {
    System.out.println("deleting " + id);
  }

}