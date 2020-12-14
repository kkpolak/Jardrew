package com.example.kkpolak.Jardrew.controller.bedController;

import com.example.kkpolak.Jardrew.entity.bed.Gora;
import com.example.kkpolak.Jardrew.service.bedService.GoraService;
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
@RequestMapping("/gora")
public class GoraController {

  @Autowired
  private GoraService goraService;

  @PostMapping("/addGora")
  public Gora addGora(@RequestBody Gora gora) {
    return goraService.saveGora(gora);
  }

  @PostMapping("/addGoras")
  public List<Gora> addGoras(@RequestBody List<Gora> goras) {
    return goraService.saveGoras(goras);
  }

  @GetMapping("/goras")
  public List<Gora> findAllGoras() {
    return goraService.getGoras();
  }

  @GetMapping("/goraById/{id}")
  public Gora findGoraById(@PathVariable int id) {
    return goraService.getGoraById(id);
  }

  @GetMapping("/{material}")
  public Gora findGoraByMaterial(@PathVariable String material) {
    return goraService.getGoraByMaterial(material);
  }

  @PutMapping("/update")
  public Gora updateGora(@RequestBody Gora gora) {
    return goraService.updateGora(gora);
  }

  @DeleteMapping("/delete/{id}")
  public String deleteGora(@PathVariable int id) {
    return goraService.deleteGora(id);
  }
}
