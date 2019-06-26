package org.example.myapp.web;

import io.dinject.controller.Controller;
import io.dinject.controller.Get;
import io.dinject.controller.Path;

import java.util.ArrayList;
import java.util.List;

@Controller
@Path("/baz")
class BazController extends BaseController<Baz,Long> {

  BazController(Repository<Baz, Long> repository) {
    super(repository);
  }

  /**
   * Find the baz by name.
   *
   * This is some more comments about this method.
   *
   * @return The list of baz
   */
  @Get("findbyname/:name")
  List<Baz> searchByName(String name) {

    // do something interesting
    return new ArrayList<>();
  }
}
