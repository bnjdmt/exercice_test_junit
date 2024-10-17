package com.m2i.exoTests.Search;

import java.util.List;

public class SearchCity {

    private List<String> cities;

    public SearchCity(List<String> cities) {
        this.cities = cities;
    }

    public List<String> search(String word) throws NotFoundException {

        if (2 <= word.length()) {
            return cities.stream()
                    .filter(s -> s.contains(word))
                    .toList();
        } else {
            throw new NotFoundException("ça va péter");
        }

    }
}
