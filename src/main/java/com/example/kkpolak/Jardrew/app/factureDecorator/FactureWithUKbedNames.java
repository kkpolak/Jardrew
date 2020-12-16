package com.example.kkpolak.Jardrew.app.factureDecorator;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FactureWithUKbedNames extends FactureAcessoriesDecorator{

  private Facture facture;

  @Override
  public Double price() {
    return facture.price();
  }

  @Override
  public LocalTime timer() {
    return facture.timer();
  }

  @Override
  public LocalDate date() {
    return facture.date();
  }

  @Override
  public String description() {
    return facture.description();
  }


  @Override
  public String toString() {
    return null;
  }
}
