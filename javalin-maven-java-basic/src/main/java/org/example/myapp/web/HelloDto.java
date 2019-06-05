package org.example.myapp.web;

public class HelloDto {

  public int id;
  public String name;
  public String otherParam;

  public HelloDto(int id, String name) {
    this(id, name, null);
  }

  public HelloDto(int id, String name, String otherParam) {
    this.id = id;
    this.name = name;
    this.otherParam = otherParam;
  }

  @Override
  public String toString() {
    return "id:" + id + " name:" + name + " other:" + otherParam;
  }

}
