package com.example.kkpolak.Jardrew.service.bedService;

import com.example.kkpolak.Jardrew.entity.bed.Poprzeczka;
import com.example.kkpolak.Jardrew.repository.bedRepository.PoprzeczkaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoprzeczkaService {

  @Autowired
  private PoprzeczkaRepository poprzeczkaRepository;

  public Poprzeczka savePoprzeczka(Poprzeczka poprzeczka) {
    return poprzeczkaRepository.save(poprzeczka);
  }

  public List<Poprzeczka> savePoprzeczkas(List<Poprzeczka> poprzeczkas) {
    return poprzeczkaRepository.saveAll(poprzeczkas);
  }

  public List<Poprzeczka> getPoprzeczkas() {
    return poprzeczkaRepository.findAll();
  }

  public Poprzeczka getPoprzeczkaById(int id) {
    return poprzeczkaRepository.findById(id).orElse(null);
  }

  public Poprzeczka getPoprzeczkaByMaterial(String material) {
    return poprzeczkaRepository.findByMaterial(material);
  }

  public String deletePoprzeczka(int id) {
    poprzeczkaRepository.deleteById(id);
    return "front removed ! " + id;
  }

  public Poprzeczka updatePoprzeczka(Poprzeczka poprzeczka) {
    Poprzeczka existingPoprzeczka = poprzeczkaRepository.findById(poprzeczka.getId()).orElse(null);
    existingPoprzeczka.setMaterial(poprzeczka.getMaterial());
    existingPoprzeczka.setLength(poprzeczka.getLength());
    existingPoprzeczka.setSize(poprzeczka.getSize());
    existingPoprzeczka.setWidth(poprzeczka.getWidth());
    return poprzeczkaRepository.save(existingPoprzeczka);
  }
}
