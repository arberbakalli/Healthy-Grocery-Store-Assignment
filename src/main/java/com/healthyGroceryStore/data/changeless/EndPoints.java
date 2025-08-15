package com.healthyGroceryStore.data.changeless;

public enum EndPoints {
  COLLECTION("nl/collection", "Retrieve all collections"),
  COLLECTION_BY_ID("nl/collection/{id}", "Retrieve a collection by ID");

  /** Add other endponts as needed */
  private final String path;

  private final String description;

  EndPoints(String path, String description) {
    this.path = path;
    this.description = description;
  }

  public String getPath() {
    return path;
  }

  public String getDescription() {
    return description;
  }
}
