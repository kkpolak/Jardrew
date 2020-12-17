package com.example.kkpolak.Jardrew.app.factureDecorator;

import com.example.kkpolak.Jardrew.app.bedFactory.Bed;
import com.example.kkpolak.Jardrew.app.bedFactory.BedScarlet;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import lombok.AllArgsConstructor;

public class FactureWithUKbedNames extends FactureAcessoriesDecorator{

  private Facture facture;

  public FactureWithUKbedNames(
      List<? super Bed> beds) {
    super(beds);
  }

  public FactureWithUKbedNames(Facture facture){
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
    beds.forEach(x -> ((Bed) x).setName(((Bed) x).getName() + "UK"));
    StringBuilder sb = new StringBuilder();

    beds.forEach(x-> sb.append(((Bed) x).getName()));
    return sb.toString();
  }
}
