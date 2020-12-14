package com.example.kkpolak.Jardrew.repository.bedRepository;

import com.example.kkpolak.Jardrew.entity.bed.Poprzeczka;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoprzeczkaRepository extends JpaRepository<Poprzeczka, Integer> {
  Poprzeczka findByMaterial(String material);
}
