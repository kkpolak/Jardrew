package com.example.kkpolak.Jardrew.service.bedService;

import com.example.kkpolak.Jardrew.entity.bed.Noga;
import com.example.kkpolak.Jardrew.repository.bedRepository.NogaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NogaService {
  @Autowired
  private NogaRepository nogaRepository;

  public Noga saveNoga(Noga noga) {
    return nogaRepository.save(noga);
  }

  public List<Noga> saveNogas(List<Noga> nogas) {
    return nogaRepository.saveAll(nogas);
  }

  public List<Noga> getNogas() {
    return nogaRepository.findAll();
  }

  public Noga getNogaById(int id) {
    return nogaRepository.findById(id).orElse(null);
  }

  public Noga getNogaByMaterial(String material) {
    return nogaRepository.findByMaterial(material);
  }

  public String deleteNoga(int id) {
    nogaRepository.deleteById(id);
    return "front removed ! " + id;
  }

  public Noga updateNoga(Noga noga) {
    Noga existingNoga = nogaRepository.findById(noga.getId()).orElse(null);
    existingNoga.setMaterial(noga.getMaterial());
    existingNoga.setLength(noga.getLength());
    existingNoga.setSize(noga.getSize());
    existingNoga.setWidth(noga.getWidth());
    return nogaRepository.save(existingNoga);
  }
}
