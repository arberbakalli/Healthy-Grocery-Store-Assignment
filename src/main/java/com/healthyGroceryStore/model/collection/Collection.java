package com.healthyGroceryStore.model.collection;

import java.util.List;

public class Collection {
  private List<ArtObjectsItem> artObjects;
  private CountFacets countFacets;
  private int count;
  private int elapsedMilliseconds;
  private List<FacetsItem> facets;

  public List<ArtObjectsItem> getArtObjects() {
    return artObjects;
  }

  public CountFacets getCountFacets() {
    return countFacets;
  }

  public int getCount() {
    return count;
  }

  public int getElapsedMilliseconds() {
    return elapsedMilliseconds;
  }

  public List<FacetsItem> getFacets() {
    return facets;
  }

  @Override
  public String toString() {
    return "Collection{"
        + "artObjects="
        + artObjects
        + ", countFacets="
        + countFacets
        + ", count="
        + count
        + ", elapsedMilliseconds="
        + elapsedMilliseconds
        + ", facets="
        + facets
        + '}';
  }
}
