package com.healthyGroceryStore.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;

@LoadPolicy(LoadType.MERGE)
@Config.Sources({"system:properties", "classpath:api.properties"})
public interface Configuration extends Config {

  @Key("api.base.path")
  String basePath();

  @Key("api.base.uri")
  String baseURI();

  @Key("api.superSecret.key")
  String key();

  @Key("api.superSecret.value")
  String value();

  @Key("log.all")
  boolean logAll();
}
