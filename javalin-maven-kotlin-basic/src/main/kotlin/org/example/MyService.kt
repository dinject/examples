package org.example

import javax.inject.Singleton

@Singleton
class MyService {

  fun doStuff() : String {
    return "My Service says Hello"
  }
}
