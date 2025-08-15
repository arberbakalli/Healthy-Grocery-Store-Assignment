package com.healthyGroceryStore.model.artObject;

import java.util.List;

public class Classification {
  private List<String> iconClassIdentifier;
  private List<String> places;
  private List<Object> motifs;
  private List<Object> periods;
  private List<String> objectNumbers;
  private List<String> people;
  private List<Object> events;
  private List<String> iconClassDescription;

  public List<String> getIconClassIdentifier() {
    return iconClassIdentifier;
  }

  public List<String> getPlaces() {
    return places;
  }

  public List<Object> getMotifs() {
    return motifs;
  }

  public List<Object> getPeriods() {
    return periods;
  }

  public List<String> getObjectNumbers() {
    return objectNumbers;
  }

  public List<String> getPeople() {
    return people;
  }

  public List<Object> getEvents() {
    return events;
  }

  public List<String> getIconClassDescription() {
    return iconClassDescription;
  }
}
