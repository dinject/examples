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
public class FooController {

  @Get
  List<Foo> getAll() {
    return new ArrayList<>();
  }

  /**
   * Find the foo by id.
   *
   * @param id The foo identifier
   * @return The foo or 404
   */
  @Get("/:id")
  Foo getById(long id) {

    Foo foo = new Foo();
    foo.id = id;
    foo.name = "foo";
    foo.startDate = LocalDate.now();

    return foo;
  }

  /**
   * Save the foo.
   * <p>
   * This will perform an upsert and update the foo if it already exists.
   *
   * @param foo The foo payload
   * @return The id of the foo inserted or updated.
   */
  @Post
  UUID save(Foo foo) {

    // do save ...
    return UUID.randomUUID();
  }
}
