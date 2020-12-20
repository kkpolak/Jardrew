package com.example.kkpolak.Jardrew.app.warehouse.warehouseStateUpdater;

import com.example.kkpolak.Jardrew.app.warehouse.WAREHOUSE_STATE;

public class UpdateStateRemove implements UpdateWarehouseStateStrategy{

  @Override
  public WAREHOUSE_STATE updateState(WAREHOUSE_STATE ws) {
    if(ws == WAREHOUSE_STATE.GOOD){
      return WAREHOUSE_STATE.MEDIUM;
    } else if(ws == WAREHOUSE_STATE.MEDIUM){
      return WAREHOUSE_STATE.BAD;
    }else {
      return ws;
    }
  }
}
