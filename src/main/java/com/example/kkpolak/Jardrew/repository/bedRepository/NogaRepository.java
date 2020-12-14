package com.example.kkpolak.Jardrew.repository.bedRepository;


import com.example.kkpolak.Jardrew.entity.bed.Noga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NogaRepository extends JpaRepository<Noga, Integer> {
  Noga findByMaterial(String material);
}
