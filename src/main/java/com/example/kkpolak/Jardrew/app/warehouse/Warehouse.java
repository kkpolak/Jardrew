package com.example.kkpolak.Jardrew.app.warehouse;

import com.example.kkpolak.Jardrew.app.warehouse.warehouseStateUpdater.UpdateStateAdd;
import com.example.kkpolak.Jardrew.app.warehouse.warehouseStateUpdater.UpdateStateRemove;
import com.example.kkpolak.Jardrew.app.warehouse.warehouseStateUpdater.UpdateWarehouseStateStrategy;
import com.example.kkpolak.Jardrew.entity.material.Material;
import com.example.kkpolak.Jardrew.service.materialService.MaterialService;
import java.util.HashSet;
import java.util.Set;

public class Warehouse implements Observable{

  private Set<Observer> observers = new HashSet<>();
  private MaterialService materialService;
  private WAREHOUSE_STATE WS;

  @Override
  public void attach(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void detach(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers(UpdateWarehouseStateStrategy stateUpdater) {
    WS = stateUpdater.updateState(WS);
  }

  public WAREHOUSE_STATE getWAREHOUSE_STATE() {
    return WS;
  }

  public void addMaterial(Material material) {
    materialService.saveMaterial(material);
    notifyObservers(new UpdateStateAdd());
  }

  public void removeMaterial(Material material) {
    materialService.deleteMaterial(material.getId());
    notifyObservers(new UpdateStateRemove());
  }


}
