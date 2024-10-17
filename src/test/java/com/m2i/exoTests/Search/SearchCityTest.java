package com.m2i.exoTests.Search;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SearchCityTest {

    private SearchCity searchCity;

    private List<String> cities = List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");

//1. Si le texte de la recherche contient moins de 2 caractères, ***Une exception est levée de type NotFoundException***.

    @Test
    public void WhenSearchHasLess2Caracters() {
        // Arrange
        searchCity = new SearchCity(cities);

        // Assert
        Assert.assertThrows(NotFoundException.class, () -> {
            searchCity.search("t");
        });
    }


}
