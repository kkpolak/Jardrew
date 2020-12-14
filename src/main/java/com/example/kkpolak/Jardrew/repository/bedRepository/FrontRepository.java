package com.example.kkpolak.Jardrew.repository.bedRepository;

import com.example.kkpolak.Jardrew.entity.bed.Front;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FrontRepository extends JpaRepository<Front,Integer> {
  Front findByMaterial(String material);
}
