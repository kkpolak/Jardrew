package com.example.kkpolak.Jardrew.app.factureDecorator;

import com.example.kkpolak.Jardrew.app.bedFactory.Bed;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

public class FactureUK extends Facture{
  List<? super Bed> beds;

  public FactureUK(List<? super Bed> beds) {
    this.beds = beds;
  }

  public void addBed (Bed bed){
    beds.add(bed);
  }

  public List<? super Bed> getBeds() {
    return beds;
  }

  @Override
  public Double price() {
    return beds.stream().mapToDouble(f -> (double) f).sum() + beds.size() * 11;
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
    return "uk facture from jardrew";
  }


  @Override
  public String toString() {
    return null;
  }
}
