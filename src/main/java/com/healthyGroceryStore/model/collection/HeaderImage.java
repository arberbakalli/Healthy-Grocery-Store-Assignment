package com.healthyGroceryStore.model.collection;

public class HeaderImage {
  private int offsetPercentageY;
  private int offsetPercentageX;
  private int width;
  private String guid;
  private String url;
  private int height;

  public int getOffsetPercentageY() {
    return offsetPercentageY;
  }

  public int getOffsetPercentageX() {
    return offsetPercentageX;
  }

  public int getWidth() {
    return width;
  }

  public String getGuid() {
    return guid;
  }

  public String getUrl() {
    return url;
  }

  public int getHeight() {
    return height;
  }

  @Override
  public String toString() {
    return "HeaderImage{"
        + "offsetPercentageY="
        + offsetPercentageY
        + ", offsetPercentageX="
        + offsetPercentageX
        + ", width="
        + width
        + ", guid='"
        + guid
        + '\''
        + ", url='"
        + url
        + '\''
        + ", height="
        + height
        + '}';
  }
}
