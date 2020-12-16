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
public class BedIsabella extends Bed implements BedFactory{

  @Override
  public Front produceFront() {
    return null;
  }

  @Override
  public Gora produceGora() {
    return new ElementBuilder
        .Builder(321)
        .withMaterial("MDF")
        .withLength(321)
        .withWidth(321)
        .withSize(321)
        .buildToGora();
  }

  @Override
  public Listwa produceListwa() {
    return new ElementBuilder
        .Builder(321)
        .withMaterial("Sklejka3")
        .withLength(321)
        .withWidth(321)
        .withSize(321)
        .buildToListwa();
  }

  @Override
  public Noga produceNoga() {
    return new ElementBuilder
        .Builder(321)
        .withMaterial("Sklejka3")
        .withLength(321)
        .withWidth(321)
        .withSize(321)
        .buildToNoga();
  }

  @Override
  public Poprzeczka producePoprzeczka() {
    return new ElementBuilder
        .Builder(321)
        .withMaterial("Sklejka3")
        .withLength(321)
        .withWidth(321)
        .withSize(321)
        .buildToPoprzeczka();
  }
}
