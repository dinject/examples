package org.example.web

import javax.validation.constraints.Email

data class HiDto(val id: Long, val other: String) {

  @Email
  var email: String = ""
}
