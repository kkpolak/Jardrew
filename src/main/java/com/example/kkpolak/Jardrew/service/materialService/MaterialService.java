package com.example.kkpolak.Jardrew.service.materialService;

import com.example.kkpolak.Jardrew.entity.bed.Poprzeczka;
import com.example.kkpolak.Jardrew.entity.material.Material;
import com.example.kkpolak.Jardrew.repository.bedRepository.PoprzeczkaRepository;
import com.example.kkpolak.Jardrew.repository.materialRepository.MaterialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialService {

  @Autowired
  private MaterialRepository materialRepository;

  public Material saveMaterial(Material material) {
    return materialRepository.save(material);
  }

  public List<Material> saveMaterials(List<Material> materials) {
    return materialRepository.saveAll(materials);
  }

  public List<Material> getPMaterials() {
    return materialRepository.findAll();
  }

  public Material getMaterialById(int id) {
    return materialRepository.findById(id).orElse(null);
  }

  public Material getMaterialByName(String name) {
    return materialRepository.findByName(name);
  }

  public String deleteMaterial(int id) {
    materialRepository.deleteById(id);
    return "material removed ! " + id;
  }

  public Material updateMaterial(Material material) {
    Material existingMaterial = materialRepository.findById(material.getId()).orElse(null);
    existingMaterial.setName(material.getName());
    existingMaterial.setPrize(material.getPrize());
    existingMaterial.setQuantity(material.getQuantity());
    return materialRepository.save(existingMaterial);
  }

}
