package org.example.service;

import io.dinject.SystemContext;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyServiceTest {

  @Test
  public void hi_using_di() {

    final MyService bean = SystemContext.getBean(MyService.class);

    assertEquals("hello", bean.hi());
  }
}
