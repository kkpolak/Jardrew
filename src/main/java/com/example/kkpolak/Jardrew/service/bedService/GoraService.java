package com.example.kkpolak.Jardrew.service.bedService;

import com.example.kkpolak.Jardrew.entity.bed.Front;
import com.example.kkpolak.Jardrew.entity.bed.Gora;
import com.example.kkpolak.Jardrew.repository.bedRepository.FrontRepository;
import com.example.kkpolak.Jardrew.repository.bedRepository.GoraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoraService {

  @Autowired
  private GoraRepository goraRepository;

  public Gora saveGora(Gora gora) {
    return goraRepository.save(gora);
  }

  public List<Gora> saveGoras(List<Gora> goras) {
    return goraRepository.saveAll(goras);
  }

  public List<Gora> getGoras() {
    return goraRepository.findAll();
  }

  public Gora getGoraById(int id) {
    return goraRepository.findById(id).orElse(null);
  }

  public Gora getGoraByMaterial(String material) {
    return goraRepository.findByMaterial(material);
  }

  public String deleteGora(int id) {
    goraRepository.deleteById(id);
    return "front removed ! " + id;
  }

  public Gora updateGora(Gora gora) {
    Gora existingGora = goraRepository.findById(gora.getId()).orElse(null);
    existingGora.setMaterial(gora.getMaterial());
    existingGora.setLength(gora.getLength());
    existingGora.setSize(gora.getSize());
    existingGora.setWidth(gora.getWidth());
    return goraRepository.save(existingGora);
  }

}
