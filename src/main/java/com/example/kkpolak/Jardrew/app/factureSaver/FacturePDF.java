package com.example.kkpolak.Jardrew.app.factureSaver;

public class FacturePDF extends FactureSaver{

  @Override
  public String fileExtension() {
    return "pdf";
  }

  @Override
  public String name(String name) {
    return name.substring(0, 1).toUpperCase() + name.substring(1);
  }

}
