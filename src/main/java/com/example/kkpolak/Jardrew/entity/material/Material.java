package com.example.kkpolak.Jardrew.entity.material;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MATERIAL")
public class Material {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private int id;
  private String name;
  private int prize;
  private int quantity;
}
