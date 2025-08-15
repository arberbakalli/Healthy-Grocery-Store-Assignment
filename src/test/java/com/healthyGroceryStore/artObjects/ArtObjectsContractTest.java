package com.healthyGroceryStore.artObjects;

import static com.healthyGroceryStore.data.changeless.TestSuiteTags.CONTRACT;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.apache.http.HttpStatus.SC_OK;

import com.healthyGroceryStore.BaseAPI;
import com.healthyGroceryStore.data.changeless.EndPoints;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ArtObjectsContractTest extends BaseAPI {

  @Test
  @Tag(CONTRACT)
  @DisplayName("Should validate the Art Object schema for GET method")
  void getOneArtObject() {
    baseRequest
        .given()
        .when()
        .get(EndPoints.COLLECTION.getPath() + "/SK-C-5")
        .then()
        .body(matchesJsonSchemaInClasspath("schemas/art_object_schema.json"))
        .statusCode(SC_OK)
        .and()
        .log()
        .ifValidationFails();
  }
}
