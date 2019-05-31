package org.example.web;

import io.dinject.controller.Controller;
import io.dinject.controller.Get;
import io.dinject.controller.Path;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
@Path("/hi")
class HelloController {

  @Get
  String hello() {
    return "What's up?";
  }

  @Get("/:id")
  Map<String,Object> hiWithId(long id, String other) {

    Map<String,Object> map = new LinkedHashMap<>();
    map.put("id", id);
    map.put("name", "foo");
    map.put("other", other);
    return map;
  }

}
