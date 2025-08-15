package com.healthyGroceryStore.model.collection;

import java.util.List;

public class FacetsItem {
  private int prettyName;
  private int otherTerms;
  private String name;
  private List<FacetsItem> facets;
  private int value;
  private String key;

  public int getPrettyName() {
    return prettyName;
  }

  public int getOtherTerms() {
    return otherTerms;
  }

  public String getName() {
    return name;
  }

  public List<FacetsItem> getFacets() {
    return facets;
  }

  public int getValue() {
    return value;
  }

  public String getKey() {
    return key;
  }

  @Override
  public String toString() {
    return "FacetsItem{"
        + "prettyName="
        + prettyName
        + ", otherTerms="
        + otherTerms
        + ", name='"
        + name
        + '\''
        + ", facets="
        + facets
        + ", value="
        + value
        + ", key='"
        + key
        + '\''
        + '}';
  }
}
