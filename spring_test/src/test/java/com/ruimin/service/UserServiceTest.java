package com.ruimin.service;

import static org.junit.Assert.*;

import com.ruimin.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserServiceTest {
UserService userService = new UserServiceImpl();
  @Test
  public void login() {
    userService.login();
  }
}