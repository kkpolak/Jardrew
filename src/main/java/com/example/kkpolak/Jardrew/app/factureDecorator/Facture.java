package com.example.kkpolak.Jardrew.app.factureDecorator;

import com.example.kkpolak.Jardrew.app.bedFactory.Bed;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public abstract class Facture {

  List<? super Bed> beds;

  public Facture(List<? super Bed> beds){
    this.beds = beds;
  }

  public void addBed (Bed bed){
    beds.add(bed);
  }

  public List<? super Bed> getBeds() {
    return beds;
  }

  public abstract Double price();
  public abstract LocalTime timer();
  public abstract LocalDate date();
  public abstract String description();
  public abstract String toString();
}
