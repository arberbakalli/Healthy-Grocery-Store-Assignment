package com.healthyGroceryStore.collections;

import static com.healthyGroceryStore.data.changeless.TestSuiteTags.FUNCTIONAL;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.healthyGroceryStore.BaseAPI;
import com.healthyGroceryStore.data.changeless.EndPoints;
import com.healthyGroceryStore.model.collection.Collection;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CollectionsFunctionalTest extends BaseAPI {

  @Test
  @Tag(FUNCTIONAL)
  @DisplayName("Should updating an existing user")
  void getRijksMuseumCollection() {
    var data =
        baseRequest
            .when()
            .get(EndPoints.COLLECTION.getPath())
            .then()
            .statusCode(HttpStatus.SC_OK)
            .extract()
            .as(Collection.class);
    /**
     * At this point since the json is mapped to java objects you could assert pretty much anything,
     * stream through lists, positive, negative, edge cases, null checks, etc...
     */
    data.getArtObjects()
        .forEach(
            artObject -> {
              assertThat(artObject.getObjectNumber()).isNotBlank();
              assertThat(artObject.getTitle()).isNotBlank();
              assertThat(artObject.getWebImage()).isNotNull();
              assertThat(artObject.getWebImage().getUrl()).isNotBlank();
            });
  }
}
