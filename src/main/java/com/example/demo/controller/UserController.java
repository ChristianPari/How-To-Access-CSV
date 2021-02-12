package com.example.demo.controller;

import com.example.demo.model.User;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

  @GetMapping("/csv")
  public String readCSV() {
    List<User> users = null;

    try {
      users = new CsvToBeanBuilder(new FileReader("C:/Users/Chris/Documents/github/Java/Accessing-CSV-from-SB-App/src/main" +
        "/resources/Users.csv"))
        .withType(User.class)
        .build()
        .parse();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    if (!users.isEmpty()) {
      for (var user : users) {
        System.out.println(user);
      }

      return "Results inside the terminal!";
    } else return "Error: No users found!";
  }

}
