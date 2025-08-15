package com.healthyGroceryStore.model.collection;

public class Links {
  private String web;
  private String self;

  public String getWeb() {
    return web;
  }

  public String getSelf() {
    return self;
  }

  @Override
  public String toString() {
    return "Links{" + "web='" + web + '\'' + ", self='" + self + '\'' + '}';
  }
}
