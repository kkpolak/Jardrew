package com.example.kkpolak.Jardrew.app;

import com.example.kkpolak.Jardrew.entity.bed.Front;
import com.example.kkpolak.Jardrew.entity.bed.Gora;
import com.example.kkpolak.Jardrew.entity.bed.Listwa;
import com.example.kkpolak.Jardrew.entity.bed.Noga;
import com.example.kkpolak.Jardrew.entity.bed.Poprzeczka;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ElementBuilder {

  private int id;
  private String material;
  private int length;
  private int width;
  private int size;

  public static class Builder {
    private int id;
    private String material;
    private int length;
    private int width;
    private int size;

    public Builder(int id){
      this.id = id;
    }

    public Builder withMaterial(String material){
      this.material = material;

      return this;
    }

    public Builder withLength(int length){
      this.length = length;

      return this;
    }

    public Builder withWidth(int width){
      this.width = width;

      return this;
    }

    public Builder withSize(int size){
      this.size = size;

      return this;
    }

    public ElementBuilder build(){
      ElementBuilder element = new ElementBuilder();
      element.id = this.id;
      element.length = this.length;
      element.material = this.material;
      element.size = this.size;
      element.width = this.width;

      return  element;
    }

    public Front buildToFront(){
      return new Front(this.id,this.material,this.length, this.width,this.size);
    }

    public Gora buildToGora(){
      return new Gora(this.id,this.material,this.length, this.width,this.size);
    }

    public Listwa buildToListwa(){
      return new Listwa(this.id,this.material,this.length, this.width,this.size);
    }

    public Noga buildToNoga(){
      return new Noga(this.id,this.material,this.length, this.width,this.size);
    }

    public Poprzeczka buildToPoprzeczka(){
      return new Poprzeczka(this.id,this.material,this.length, this.width,this.size);
    }
  }
}
