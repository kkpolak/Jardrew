package com.example.kkpolak.Jardrew.service.bedService;

import com.example.kkpolak.Jardrew.entity.bed.Front;
import com.example.kkpolak.Jardrew.repository.bedRepository.FrontRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrontService {

  @Autowired
  private FrontRepository frontRepository;

  public Front saveFront(Front front) {
    return frontRepository.save(front);
  }

  public List<Front> saveFronts(List<Front> fronts) {
    return frontRepository.saveAll(fronts);
  }

  public List<Front> getFronts() {
    return frontRepository.findAll();
  }

  public Front getFrontById(int id) {
    return frontRepository.findById(id).orElse(null);
  }

  public Front getFrontByMaterial(String material) {
    return frontRepository.findByMaterial(material);
  }

  public String deleteFront(int id) {
    frontRepository.deleteById(id);
    return "front removed ! " + id;
  }

  public Front updateFront(Front front) {
    Front existingFront = frontRepository.findById(front.getId()).orElse(null);
    existingFront.setMaterial(front.getMaterial());
    existingFront.setLength(front.getLength());
    existingFront.setSize(front.getSize());
    existingFront.setWidth(front.getWidth());
    return frontRepository.save(existingFront);
  }

}
