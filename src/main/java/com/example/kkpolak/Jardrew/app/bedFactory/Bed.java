package com.example.kkpolak.Jardrew.app.bedFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Bed {
  private float price;
  private String name;

  public String siema (){
    return "abc";
  }
}
