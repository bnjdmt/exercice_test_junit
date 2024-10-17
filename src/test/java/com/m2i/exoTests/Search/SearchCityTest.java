package com.m2i.exoTests.Search;

import com.m2i.exoTests.Fib.Fib;
import org.junit.Assert;

import java.util.List;

public class SearchCityTest {

    private SearchCity searchCity;

    private List<String> cities = List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");

//1. Si le texte de la recherche contient moins de 2 caractères, ***Une exception est levée de type NotFoundException***.

    public void WhenSearchHasLess2Caracters() throws ClassNotFoundException {
        // Arrange
        searchCity = new SearchCity(cities);

        // Act
        List<String> result = searchCity.search("t");

        // Assert
        Assert.assertThrows(result.isEmpty());
    }


}
