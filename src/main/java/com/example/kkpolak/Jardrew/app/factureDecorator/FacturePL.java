package com.example.kkpolak.Jardrew.app.factureDecorator;

import com.example.kkpolak.Jardrew.app.bedFactory.Bed;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Timer;

public class FacturePL extends Facture{



  @Override
  public Double price() {
    return beds.stream().mapToDouble(f -> (double) f).sum();
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
    return "faktura";
  }

  @Override
  public String toString() {
    return null;
  }
}
