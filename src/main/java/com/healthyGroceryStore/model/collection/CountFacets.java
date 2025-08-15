package com.healthyGroceryStore.model.collection;

public class CountFacets {
  private int ondisplay;
  private int hasimage;

  public int getOndisplay() {
    return ondisplay;
  }

  public int getHasimage() {
    return hasimage;
  }

  @Override
  public String toString() {
    return "CountFacets{" + "ondisplay=" + ondisplay + ", hasimage=" + hasimage + '}';
  }
}
