package com.example.kkpolak.Jardrew.repository.materialRepository;

import com.example.kkpolak.Jardrew.entity.material.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material,Integer> {
  Material findByName(String name);
}
