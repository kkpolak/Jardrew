package com.example.kkpolak.Jardrew.controller.bedController;

import com.example.kkpolak.Jardrew.entity.bed.Listwa;
import com.example.kkpolak.Jardrew.service.bedService.ListwaService;
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
@RequestMapping("/listwa")
public class ListwaController {

  @Autowired
  private ListwaService listwaService;

  @PostMapping("/addListwa")
  public Listwa addListwa(@RequestBody Listwa listwa) {
    return listwaService.saveListwa(listwa);
  }

  @PostMapping("/addListwas")
  public List<Listwa> addListwas(@RequestBody List<Listwa> listwas) {
    return listwaService.saveListwas(listwas);
  }

  @GetMapping("/listwas")
  public List<Listwa> findAllListwas() {
    return listwaService.getListwas();
  }

  @GetMapping("/listwaById/{id}")
  public Listwa findListwaById(@PathVariable int id) {
    return listwaService.getListwaById(id);
  }

  @GetMapping("/{material}")
  public Listwa findListwaByMaterial(@PathVariable String material) {
    return listwaService.getListwaByMaterial(material);
  }

  @PutMapping("/update")
  public Listwa updateListwa(@RequestBody Listwa listwa) {
    return listwaService.updateListwa(listwa);
  }

  @DeleteMapping("/delete/{id}")
  public String deleteListwa(@PathVariable int id) {
    return listwaService.deleteListwa(id);
  }
}
