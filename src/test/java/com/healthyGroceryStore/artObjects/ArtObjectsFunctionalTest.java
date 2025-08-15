package com.healthyGroceryStore.artObjects;

import static com.healthyGroceryStore.data.changeless.TestSuiteTags.CONTRACT;
import static org.apache.http.HttpStatus.SC_OK;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.healthyGroceryStore.BaseAPI;
import com.healthyGroceryStore.data.changeless.EndPoints;
import com.healthyGroceryStore.model.artObject.Object_ID;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ArtObjectsFunctionalTest extends BaseAPI {

  @Test
  @Tag(CONTRACT)
  @DisplayName("Should get an single Art Object and validate anything like {the colors are fine}")
  void getOneArtObject() {
    var objectData =
        baseRequest
            .given()
            .when()
            .get(EndPoints.COLLECTION.getPath() + "/SK-C-5")
            .then()
            .statusCode(SC_OK)
            .and()
            .extract()
            .as(Object_ID.class);

    objectData
        .getArtObject()
        .getColors()
        .forEach(
            color -> assertThat(color.getHex()).isNotBlank() // or is not white hex, black hex, etc.
            );
  }
}
