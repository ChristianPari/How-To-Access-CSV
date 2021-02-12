package com.example.demo.model;

import com.opencsv.bean.CsvBindByName;

public class User {
  @CsvBindByName
  private long id;
  @CsvBindByName
  private String first_name;
  @CsvBindByName
  private String last_name;
  @CsvBindByName
  private String city;
  @CsvBindByName
  private String state;

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", first_name='" + first_name + '\'' +
      ", last_name='" + last_name + '\'' +
      ", city='" + city + '\'' +
      ", state='" + state + '\'' +
      '}';
  }
}
