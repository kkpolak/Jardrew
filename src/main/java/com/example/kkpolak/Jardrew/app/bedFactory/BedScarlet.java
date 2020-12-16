package com.example.kkpolak.Jardrew.app.bedFactory;

import com.example.kkpolak.Jardrew.app.ElementBuilder;
import com.example.kkpolak.Jardrew.entity.bed.Front;
import com.example.kkpolak.Jardrew.entity.bed.Gora;
import com.example.kkpolak.Jardrew.entity.bed.Listwa;
import com.example.kkpolak.Jardrew.entity.bed.Noga;
import com.example.kkpolak.Jardrew.entity.bed.Poprzeczka;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BedScarlet implements BedFactory{

  private float price;
  private int quantity;

  @Override
  public Front produceFront() {
     return new ElementBuilder
         .Builder(123)
         .withMaterial("Sklejka1")
         .withLength(123)
         .withWidth(123)
         .withSize(123)
         .buildToFront();
  }

  @Override
  public Gora produceGora() {
    return new ElementBuilder
        .Builder(123)
        .withMaterial("Sklejka1")
        .withLength(123)
        .withWidth(123)
        .withSize(123)
        .buildToGora();
  }

  @Override
  public Listwa produceListwa() {
    return new ElementBuilder
        .Builder(123)
        .withMaterial("Sklejka1")
        .withLength(123)
        .withWidth(123)
        .withSize(123)
        .buildToListwa();
  }

  @Override
  public Noga produceNoga() {
    return new ElementBuilder
        .Builder(123)
        .withMaterial("Sklejka1")
        .withLength(123)
        .withWidth(123)
        .withSize(123)
        .buildToNoga();
  }

  @Override
  public Poprzeczka producePoprzeczka() {
    return new ElementBuilder
        .Builder(123)
        .withMaterial("Sklejka1")
        .withLength(123)
        .withWidth(123)
        .withSize(123)
        .buildToPoprzeczka();
  }


}
