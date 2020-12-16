package com.example.kkpolak.Jardrew.app.factureDecorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FactureWithFlag extends FactureAcessoriesDecorator{

  private Facture facture;

  @Override
  public float price() {
    return 0;
  }

  @Override
  public String description() {
    return null;
  }

  @Override
  public String title() {
    return null;
  }

  @Override
  public String toString() {
    return null;
  }
}
