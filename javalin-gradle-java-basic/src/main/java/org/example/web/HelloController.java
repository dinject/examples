package org.example.web;

import io.dinject.controller.Controller;
import io.dinject.controller.Get;
import io.dinject.controller.Path;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Hello resource API.
 * <p>
 * Produces a lot of interesting content.
 * <p>
 * What about this.
 */
@Controller
@Path("/hi")
class HelloController {

  @Get
  String hello() {
    return "What's up?";
  }

  /**
   * Perform Hi with id path.
   * <p>
   * Additionally this returns lots of stuff.
   *
   * @param id    The id of hi
   * @param other My other param
   * @return Return the map of Hi's
   */
  @Get("/:id")
  Map<String, Object> hiWithId(long id, String other) {

    Map<String, Object> map = new LinkedHashMap<>();
    map.put("id", id);
    map.put("name", "foo");
    map.put("other", other);
    return map;
  }

}
