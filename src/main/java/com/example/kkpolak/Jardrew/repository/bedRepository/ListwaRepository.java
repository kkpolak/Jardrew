package com.example.kkpolak.Jardrew.repository.bedRepository;


import com.example.kkpolak.Jardrew.entity.bed.Listwa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListwaRepository extends JpaRepository<Listwa, Integer> {
  Listwa findByMaterial(String material);
}
