package com.example.kkpolak.Jardrew.controller.materialController;

import com.example.kkpolak.Jardrew.entity.bed.Front;
import com.example.kkpolak.Jardrew.entity.material.Material;
import com.example.kkpolak.Jardrew.service.bedService.FrontService;
import com.example.kkpolak.Jardrew.service.materialService.MaterialService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/material")
public class MaterialController {

  @Autowired
  private MaterialService materialService;

  @PostMapping("/addMaterial")
  public Material addMaterial(@RequestBody Material material) {
    return materialService.saveMaterial(material);
  }

  @PostMapping("/addMaterials")
  public List<Material> addFMaterials(@RequestBody List<Material> materials) {
    return materialService.saveMaterials(materials);
  }

  @GetMapping("/materials")
  public List<Material> findAllMaterials() {
    return materialService.getPMaterials();
  }

  @GetMapping("/materialById/{id}")
  public Material findMaterialById(@PathVariable int id) {
    return materialService.getMaterialById(id);
  }


  @GetMapping("/{material}")
  public Material findMaterialByName(@PathVariable String name) {
    return materialService.getMaterialByName(name);
  }

  @PutMapping("/update")
  public Material updateMaterial(@RequestBody Material material) {
    return materialService.updateMaterial(material);
  }

  @DeleteMapping("/delete/{id}")
  public String deleteMaterial(@PathVariable int id) {
    return materialService.deleteMaterial(id);
  }
}
