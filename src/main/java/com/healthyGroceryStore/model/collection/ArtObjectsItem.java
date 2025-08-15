package com.healthyGroceryStore.model.collection;

import java.util.List;

public class ArtObjectsItem {
  private String principalOrFirstMaker;
  private WebImage webImage;
  private HeaderImage headerImage;
  private String objectNumber;
  private List<Object> productionPlaces;
  private Links links;
  private boolean hasImage;
  private boolean showImage;
  private String id;
  private String title;
  private String longTitle;
  private boolean permitDownload;

  public String getPrincipalOrFirstMaker() {
    return principalOrFirstMaker;
  }

  public WebImage getWebImage() {
    return webImage;
  }

  public HeaderImage getHeaderImage() {
    return headerImage;
  }

  public String getObjectNumber() {
    return objectNumber;
  }

  public List<Object> getProductionPlaces() {
    return productionPlaces;
  }

  public Links getLinks() {
    return links;
  }

  public boolean isHasImage() {
    return hasImage;
  }

  public boolean isShowImage() {
    return showImage;
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getLongTitle() {
    return longTitle;
  }

  public boolean isPermitDownload() {
    return permitDownload;
  }

  @Override
  public String toString() {
    return "ArtObjectsItem{"
        + "principalOrFirstMaker='"
        + principalOrFirstMaker
        + '\''
        + ", webImage="
        + webImage
        + ", headerImage="
        + headerImage
        + ", objectNumber='"
        + objectNumber
        + '\''
        + ", productionPlaces="
        + productionPlaces
        + ", links="
        + links
        + ", hasImage="
        + hasImage
        + ", showImage="
        + showImage
        + ", id='"
        + id
        + '\''
        + ", title='"
        + title
        + '\''
        + ", longTitle='"
        + longTitle
        + '\''
        + ", permitDownload="
        + permitDownload
        + '}';
  }
}
