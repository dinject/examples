package org.example.myapp.web;

//import org.hibernate.validator.constraints.URL;

import org.hibernate.validator.constraints.URL;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Valid
public class HelloForm {

  @NotNull
  String name;

  @Email @Size(max = 100)
  String email;

  @URL
  String url;

  @Future
  LocalDate startDate;

  @Override
  public String toString() {
    return "HelloForm{" +
      "name='" + name + '\'' +
      ", email='" + email + '\'' +
      ", url='" + url + '\'' +
      ", startDate=" + startDate +
      '}';
  }
}
