package com.healthyGroceryStore.collections;

import static com.healthyGroceryStore.data.changeless.TestSuiteTags.CONTRACT;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.apache.http.HttpStatus.SC_OK;

import com.healthyGroceryStore.BaseAPI;
import com.healthyGroceryStore.data.changeless.EndPoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CollectionsContractTest extends BaseAPI {

  @Test
  @Tag(CONTRACT)
  @DisplayName("Should validate the collection schema for GET method")
  void getRijksMuseumCollectionSchema() {
    baseRequest
        .given()
        .when()
        .get(EndPoints.COLLECTION.getPath())
        .then()
        .body(matchesJsonSchemaInClasspath("schemas/collection_schema.json"))
        .statusCode(SC_OK)
        .and()
        .log()
        .ifValidationFails();
  }
}
