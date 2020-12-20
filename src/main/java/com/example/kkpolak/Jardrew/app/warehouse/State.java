package com.example.kkpolak.Jardrew.app.warehouse;

public class State implements Observer{

  private final Warehouse warehouse;
  private WAREHOUSE_STATE WS;

  public State(Warehouse warehouse) {
    this.warehouse = warehouse;
    WS = WAREHOUSE_STATE.MEDIUM;
  }

  @Override
  public void update() {
    WS = warehouse.getWAREHOUSE_STATE();
    System.out.println("current state of warehouse : " + WS.toString());
  }
}
