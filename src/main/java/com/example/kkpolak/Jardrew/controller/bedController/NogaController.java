package com.example.kkpolak.Jardrew.controller.bedController;

import com.example.kkpolak.Jardrew.entity.bed.Noga;
import com.example.kkpolak.Jardrew.service.bedService.NogaService;
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
@RequestMapping("/noga")
public class NogaController {

  @Autowired
  private NogaService nogaService;

  @PostMapping("/addNoga")
  public Noga addNoga(@RequestBody Noga noga) {
    return nogaService.saveNoga(noga);
  }

  @PostMapping("/addNogas")
  public List<Noga> addNogas(@RequestBody List<Noga> nogas) {
    return nogaService.saveNogas(nogas);
  }

  @GetMapping("/nogas")
  public List<Noga> findAllNogas() {
    return nogaService.getNogas();
  }

  @GetMapping("/nogaById/{id}")
  public Noga findNogaById(@PathVariable int id) {
    return nogaService.getNogaById(id);
  }

  @GetMapping("/{material}")
  public Noga findNogaByMaterial(@PathVariable String material) {
    return nogaService.getNogaByMaterial(material);
  }

  @PutMapping("/update")
  public Noga updateNoga(@RequestBody Noga noga) {
    return nogaService.updateNoga(noga);
  }

  @DeleteMapping("/delete/{id}")
  public String deleteNoga(@PathVariable int id) {
    return nogaService.deleteNoga(id);
  }

}
