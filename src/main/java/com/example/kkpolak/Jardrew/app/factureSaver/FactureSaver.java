package com.example.kkpolak.Jardrew.app.factureSaver;

import com.example.kkpolak.Jardrew.app.factureDecorator.Facture;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class FactureSaver {
  public void save(Facture facture) throws IOException {
    Files.write(
        Paths.get( name(facture.description()
            .split(" ")[1])
            + fileExtension() ),
        facture.toString().getBytes(StandardCharsets.UTF_8));
  }

  public abstract String fileExtension();
  public abstract String name(String name);
}
