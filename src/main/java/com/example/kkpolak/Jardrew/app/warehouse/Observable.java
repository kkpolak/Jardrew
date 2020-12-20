package com.example.kkpolak.Jardrew.app.warehouse;

import com.example.kkpolak.Jardrew.app.warehouse.warehouseStateUpdater.UpdateWarehouseStateStrategy;

public interface Observable {
  void attach(Observer observer);
  void detach(Observer observer);
  void notifyObservers(UpdateWarehouseStateStrategy updateWarehouseStateStrategy);
}
