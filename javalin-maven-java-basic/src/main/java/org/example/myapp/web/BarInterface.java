package org.example.myapp.web;

import io.dinject.controller.Get;
import io.dinject.controller.MediaType;
import io.dinject.controller.Path;
import io.dinject.controller.Produces;

import java.util.List;

@Path("/bars")
public interface BarInterface {

  @Get(":id")
  Bar getById(long id);

  @Get("/find/:code")
  List<Bar> findByCode(String code);

  @Produces(MediaType.TEXT_PLAIN)
  @Get
  String barMessage();
}
