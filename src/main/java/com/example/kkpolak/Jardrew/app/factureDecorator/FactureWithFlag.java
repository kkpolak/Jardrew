package com.example.kkpolak.Jardrew.app.factureDecorator;

import com.example.kkpolak.Jardrew.app.bedFactory.Bed;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import lombok.AllArgsConstructor;

public class FactureWithFlag extends FactureAcessoriesDecorator{

  private Facture facture;

  public FactureWithFlag(
      List<? super Bed> beds) {
    super(beds);
  }

  public FactureWithFlag(Facture facture){
    super(facture.getBeds());
    this.facture = facture;
  }

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
    return "FLAG" + facture.toString();
  }
}
