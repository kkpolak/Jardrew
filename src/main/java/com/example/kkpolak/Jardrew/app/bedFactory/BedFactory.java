package com.example.kkpolak.Jardrew.app.bedFactory;

import com.example.kkpolak.Jardrew.entity.bed.Front;
import com.example.kkpolak.Jardrew.entity.bed.Gora;
import com.example.kkpolak.Jardrew.entity.bed.Listwa;
import com.example.kkpolak.Jardrew.entity.bed.Noga;
import com.example.kkpolak.Jardrew.entity.bed.Poprzeczka;

public interface BedFactory {
  Front produceFront();
  Gora produceGora();
  Listwa produceListwa();
  Noga produceNoga();
  Poprzeczka producePoprzeczka();
}
