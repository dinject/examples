package org.example.myapp.web;

import io.javalin.security.Role;

public enum AppRoles implements Role {
  ANYONE, ADMIN, BASIC_USER, ORG_ADMIN;
}
