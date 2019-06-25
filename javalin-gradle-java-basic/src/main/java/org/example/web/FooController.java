package org.example.web;

import io.dinject.controller.Controller;
import io.dinject.controller.Get;
import io.dinject.controller.Path;
import io.dinject.controller.Post;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@Path("/foo")
class FooController {

  @Get
  List<Foo> getAll() {
    return new ArrayList<>();
  }

  @Get(":id")
  Foo getById(UUID id) {

    Foo foo = new Foo();
    foo.id = id;
    foo.name = "foo";
    foo.startDate = LocalDate.now();

    return foo;
  }

  @Post
  UUID save(Foo foo) {

    // do save ...
    return UUID.randomUUID();
  }
}
