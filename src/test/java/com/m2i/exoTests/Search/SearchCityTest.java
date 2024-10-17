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

    // 2. Si le texte de recherche est égal ou supérieur à 2 caractères, il doit renvoyer tous les noms de ville commençant par le texte de recherche exact.
    //   Par exemple, pour le texte de recherche "Va", la fonction doit renvoyer Valence et Vancouver

    @Test
    public void WhenSearchHasMore2Caracters() throws NotFoundException
    {
        // Arrange
        searchCity = new SearchCity(cities);
        List<String> expectedResult = List.of("Valence", "Vancouver");

        // Act
        List<String> result = searchCity.search("Va");

        // Assert
        Assert.assertTrue(result.containsAll(expectedResult));
    }

    // 3. La fonctionnalité de recherche doit être insensible à la casse

    @Test
    public void searchIsNotSensitive() throws NotFoundException
    {
        // Arrange
        searchCity = new SearchCity(cities);
        List<String> expectedResult = List.of("Valence", "Vancouver");

        // Act
        List<String> result = searchCity.search("Va");

        // Assert
        Assert.assertTrue(result.containsAll(expectedResult));
    }

    // 4. La fonctionnalité de recherche devrait également fonctionner lorsque le texte de recherche n'est qu'une partie d'un nom de ville
    //   Par exemple "ape" devrait renvoyer la ville "Budapest"

    @Test
    public void WhenSearchWordIsNotComplete() throws NotFoundException {
        // Arrange
        searchCity = new SearchCity(cities);
        List<String> expectedResult = List.of("Budapest");

        // Act
        List<String> result = searchCity.search("ape");

        // Assert
        Assert.assertTrue(result.containsAll(expectedResult));
    }

    // 5. Si le texte de recherche est un « * » (astérisque), il doit renvoyer tous les noms de ville.

    @Test
    public void WhenSearchWordContainAsterisk() throws NotFoundException
    {
        // Arrange
        searchCity = new SearchCity(cities);
        List<String> expectedResult = cities;

        // Act
        List<String> result = searchCity.search("*");

        // Assert
        Assert.assertTrue(result.containsAll(expectedResult));
    }

}
