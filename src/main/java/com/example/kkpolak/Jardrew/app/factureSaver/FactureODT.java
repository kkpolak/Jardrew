package com.example.kkpolak.Jardrew.app.factureSaver;

public class FactureODT extends FactureSaver{

  @Override
  public String fileExtension() {
    return "odt";
  }

  @Override
  public String name(String name) {
    return name.substring(0, 1).toUpperCase() + name.substring(1);
  }
}
