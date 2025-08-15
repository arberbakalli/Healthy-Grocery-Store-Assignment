package com.healthyGroceryStore.data.changeless;

public enum UsersErrorsData {
  ERRORS_COLLECTION_NOT_FOUND("error", "user not found");

  /** Key for the error messages, here we would maintain a consistent key for each error. */
  public final String key;

  public final String message;

  UsersErrorsData(String key, String message) {
    this.key = key;
    this.message = message;
  }
}
