package org.example.myapp.service;

import org.example.myapp.web.HelloDto;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class MyService {

  public List<HelloDto> findAll() {

    List<HelloDto> list = new ArrayList<>();
    list.add(new HelloDto(12, "Jim"));
    list.add(new HelloDto(13, "Spock"));

    return list;
  }
}
