package com.example.kkpolak.Jardrew.app.warehouse.warehouseStateUpdater;

import com.example.kkpolak.Jardrew.app.warehouse.WAREHOUSE_STATE;

public interface UpdateWarehouseStateStrategy {
  WAREHOUSE_STATE updateState(WAREHOUSE_STATE ws);
}
