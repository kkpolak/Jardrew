package com.example.kkpolak.Jardrew.repository.bedRepository;

import com.example.kkpolak.Jardrew.entity.bed.Gora;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoraRepository extends JpaRepository<Gora,Integer> {
  Gora findByMaterial(String material);
}
