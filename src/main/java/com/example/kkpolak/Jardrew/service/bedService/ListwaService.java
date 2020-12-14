package com.example.kkpolak.Jardrew.service.bedService;

import com.example.kkpolak.Jardrew.entity.bed.Listwa;
import com.example.kkpolak.Jardrew.repository.bedRepository.ListwaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListwaService {
  @Autowired
  private ListwaRepository listwaRepository;

  public Listwa saveListwa(Listwa listwa) {
    return listwaRepository.save(listwa);
  }

  public List<Listwa> saveListwas(List<Listwa> listwas) {
    return listwaRepository.saveAll(listwas);
  }

  public List<Listwa> getListwas() {
    return listwaRepository.findAll();
  }

  public Listwa getListwaById(int id) {
    return listwaRepository.findById(id).orElse(null);
  }

  public Listwa getListwaByMaterial(String material) {
    return listwaRepository.findByMaterial(material);
  }

  public String deleteListwa(int id) {
    listwaRepository.deleteById(id);
    return "front removed ! " + id;
  }

  public Listwa updateListwa(Listwa listwa) {
    Listwa existingListwa = listwaRepository.findById(listwa.getId()).orElse(null);
    existingListwa.setMaterial(listwa.getMaterial());
    existingListwa.setLength(listwa.getLength());
    existingListwa.setSize(listwa.getSize());
    existingListwa.setWidth(listwa.getWidth());
    return listwaRepository.save(existingListwa);
  }
}
