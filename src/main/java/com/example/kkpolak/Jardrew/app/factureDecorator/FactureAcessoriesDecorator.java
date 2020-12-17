package com.example.kkpolak.Jardrew.app.factureDecorator;

import com.example.kkpolak.Jardrew.app.bedFactory.Bed;
import java.util.List;

public abstract class FactureAcessoriesDecorator extends Facture {

  public FactureAcessoriesDecorator(
      List<? super Bed> beds) {
    super(beds);
  }
}
