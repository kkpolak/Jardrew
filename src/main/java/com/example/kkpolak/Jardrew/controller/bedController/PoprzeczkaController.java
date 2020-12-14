package com.example.kkpolak.Jardrew.controller.bedController;

import com.example.kkpolak.Jardrew.entity.bed.Poprzeczka;
import com.example.kkpolak.Jardrew.service.bedService.PoprzeczkaService;
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
@RequestMapping("/poprzeczka")
public class PoprzeczkaController {

  @Autowired
  private PoprzeczkaService poprzeczkaService;

  @PostMapping("/addPoprzeczka")
  public Poprzeczka addPoprzeczka(@RequestBody Poprzeczka poprzeczka) {
    return poprzeczkaService.savePoprzeczka(poprzeczka);
  }

  @PostMapping("/addPoprzeczkas")
  public List<Poprzeczka> addPoprzeczkas(@RequestBody List<Poprzeczka> poprzeczkas) {
    return poprzeczkaService.savePoprzeczkas(poprzeczkas);
  }

  @GetMapping("/poprzeczkas")
  public List<Poprzeczka> findAllPoprzeczkas() {
    return poprzeczkaService.getPoprzeczkas();
  }

  @GetMapping("/poprzeczkaById/{id}")
  public Poprzeczka findPoprzeczkaById(@PathVariable int id) {
    return poprzeczkaService.getPoprzeczkaById(id);
  }

  @GetMapping("/{material}")
  public Poprzeczka findMaterialByMaterial(@PathVariable String material) {
    return poprzeczkaService.getPoprzeczkaByMaterial(material);
  }

  @PutMapping("/update")
  public Poprzeczka updatePoprzeczka(@RequestBody Poprzeczka poprzeczka) {
    return poprzeczkaService.updatePoprzeczka(poprzeczka);
  }

  @DeleteMapping("/delete/{id}")
  public String deletePoprzeczka(@PathVariable int id) {
    return poprzeczkaService.deletePoprzeczka(id);
  }
}
