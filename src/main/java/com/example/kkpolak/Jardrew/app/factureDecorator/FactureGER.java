package com.example.kkpolak.Jardrew.app.factureDecorator;

import com.example.kkpolak.Jardrew.app.bedFactory.Bed;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class FactureGER extends Facture{

  public FactureGER(List<? super Bed> beds) {
    super(beds);
  }

  @Override
  public Double price() {
    return beds.stream().mapToDouble(f -> (double) f).sum() + beds.size() * 10;
  }

  @Override
  public LocalTime timer() {
    return LocalTime.now();
  }

  @Override
  public LocalDate date() {
    return LocalDate.now();
  }

  @Override
  public String description() {
    return "german facture";
  }

  @Override
  public String toString() {
    return null;
  }
}
