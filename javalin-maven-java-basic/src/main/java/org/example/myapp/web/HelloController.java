package org.example.myapp.web;

import io.dinject.controller.Controller;
import io.dinject.controller.Delete;
import io.dinject.controller.Form;
import io.dinject.controller.Get;
import io.dinject.controller.MediaType;
import io.dinject.controller.Path;
import io.dinject.controller.Post;
import io.dinject.controller.Produces;
import io.dinject.controller.Validator;
import io.javalin.http.Context;
import io.swagger.v3.oas.annotations.Hidden;
import org.example.myapp.service.MyService;

import javax.inject.Inject;
import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.example.myapp.web.AppRoles.ADMIN;

/**
 * Hello resource manager.
 * <p>
 * Simple API for Hello resources.
 */
//@Hidden
@Valid
@Controller
@Path("/hello")
class HelloController {

  private final MyService myService;

//  private final Validator validator;

  @Inject
  HelloController(MyService myService) {//, Validator validator) {
    this.myService = myService;
//    this.validator = validator;
  }

  /**
   * Return the Hello DTO.
   *
   * @param id         The hello Id.
   * @param date       The name of the hello
   * @param otherParam Optional other parameter
   * @return The Hello DTO given the id and name.
   * @deprecated Please migrate away
   */
//  @Deprecated
  @Get("/:id/:date")
  HelloDto hello(int id, LocalDate date, String otherParam) {
    return new HelloDto(id, date.toString(), otherParam);
  }

  /**
   * Find Hellos by name.
   *
   * @param name       The name to search for
   * @param otherParam My option parameter
   * @return The Hellos that we found.
   */
  @Get("/findbyname/:name")
  List<HelloDto> findByName(String name, String otherParam) {
    return new ArrayList<>();
  }

  /**
   * Save the hello using json body.
   *
   * @param foo The hello doo id
   * @param dto The hello body as json
   */
  @Roles({ADMIN})
  @Post("/savebean/:foo")
  void saveBean(String foo, HelloDto dto, Context context) {
    // save hello data ...
    System.out.println("save " + foo + " dto:" + dto);
  }

  /**
   * Create the new Hello using a form.
   */
  @Post("saveform")
  @Form
  void saveForm(HelloForm helloForm) {
//    validator.validate(helloForm);

    System.out.println("saving "+helloForm);
  }


  @Post("saveform2")
  @Form
  void saveForm2(String name, String email, String url) {
    System.out.println("name " + name + " email:" + email + " url:" + url);
  }

  @Hidden
  @Get
  List<HelloDto> getAll() {
    return myService.findAll();
  }

  //  @Hidden
  @Delete(":id")
  void deleteById(int id) {
    System.out.println("deleting " + id);
  }

  @Produces(MediaType.TEXT_PLAIN)
  @Get("message")
  String getPlainMessage() {

    return "hello world";
  }
}
