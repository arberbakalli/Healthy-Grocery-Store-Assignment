package com.healthyGroceryStore.model.artObject;

import java.util.List;

public class ArtObjectPage {
  private List<Object> similarPages;
  private Object audioFileLabel2;
  private AdlibOverrides adlibOverrides;
  private String objectNumber;
  private Object audioFileLabel1;
  private String id;
  private String plaqueDescription;
  private Object audioFile1;
  private String updatedOn;
  private String lang;
  private String createdOn;
  private List<Object> tags;

  public List<Object> getSimilarPages() {
    return similarPages;
  }

  public Object getAudioFileLabel2() {
    return audioFileLabel2;
  }

  public AdlibOverrides getAdlibOverrides() {
    return adlibOverrides;
  }

  public String getObjectNumber() {
    return objectNumber;
  }

  public Object getAudioFileLabel1() {
    return audioFileLabel1;
  }

  public String getId() {
    return id;
  }

  public String getPlaqueDescription() {
    return plaqueDescription;
  }

  public Object getAudioFile1() {
    return audioFile1;
  }

  public String getUpdatedOn() {
    return updatedOn;
  }

  public String getLang() {
    return lang;
  }

  public String getCreatedOn() {
    return createdOn;
  }

  public List<Object> getTags() {
    return tags;
  }
}
