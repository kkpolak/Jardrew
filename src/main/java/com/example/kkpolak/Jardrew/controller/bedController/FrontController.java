package com.example.kkpolak.Jardrew.controller.bedController;

import com.example.kkpolak.Jardrew.entity.bed.Front;
import com.example.kkpolak.Jardrew.service.bedService.FrontService;
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
@RequestMapping("/front")
public class FrontController {

  @Autowired
  private FrontService frontService;

  @PostMapping("/addFront")
  public Front addFront(@RequestBody Front front) {
    return frontService.saveFront(front);
  }

  @PostMapping("/addFronts")
  public List<Front> addFronts(@RequestBody List<Front> fronts) {
    return frontService.saveFronts(fronts);
  }

  @GetMapping("/fronts")
  public List<Front> findAllFronts() {
    return frontService.getFronts();
  }

  @GetMapping("/frontById/{id}")
  public Front findFrontById(@PathVariable int id) {
    return frontService.getFrontById(id);
  }


  @GetMapping("/{material}")
  public Front findFrontByMaterial(@PathVariable String material) {
    return frontService.getFrontByMaterial(material);
  }

  @PutMapping("/update")
  public Front updateFront(@RequestBody Front front) {
    return frontService.updateFront(front);
  }

  @DeleteMapping("/delete/{id}")
  public String deleteFront(@PathVariable int id) {
    return frontService.deleteFront(id);
  }

}
