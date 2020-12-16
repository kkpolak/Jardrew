package com.example.kkpolak.Jardrew.app.factureDecorator;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;

public abstract class Facture {
  public abstract Double price();
  public abstract LocalTime timer();
  public abstract LocalDate date();
  public abstract String description();
  public abstract String toString();
}
