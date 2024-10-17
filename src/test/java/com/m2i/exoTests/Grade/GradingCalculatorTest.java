package com.m2i.exoTests.Grade;

import org.junit.Assert;
import org.junit.Test;

public class GradingCalculatorTest {

//    **Les scénarios de tests** :
//
//- Score : 95%, Présence : 90 => Note: A
//- Score : 85%, Présence : 90 => Note: B
//- Score : 65%, Présence : 90 => Note: C
//- Score : 95%, Présence : 65 => Note: B
//- Score : 95%, Présence : 55 => Note: F
//- Score : 65%, Présence : 55 => Note: F
//- Score : 50%, Présence : 90 => Note: F

    @Test
    public void whenGetGrade_95_90_Then_A(){
        int score = 95;
        int presence = 90;

        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('A', result);
    }

    @Test
    public void whenGetGrade_85_90_Then_B(){
        int score = 85;
        int presence = 90;

        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('B', result);
    }

    @Test
    public void whenGetGrade_65_90_Then_C(){
        int score = 65;
        int presence = 90;

        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('C', result);
    }

    @Test
    public void whenGetGrade_95_65_Then_B(){
        int score = 95;
        int presence = 65;

        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('B', result);
    }

    @Test
    public void whenGetGrade_95_55_Then_F(){
        int score = 95;
        int presence = 55;

        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('F', result);
    }

    @Test
    public void whenGetGrade_65_55_Then_F(){
        int score = 65;
        int presence = 55;

        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('F', result);
    }

    @Test
    public void whenGetGrade_50_90_Then_A(){
        int score = 50;
        int presence = 90;

        // Arrange
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);

        // Act
        char result = gradingCalculator.getGrade();

        // Assert
        Assert.assertEquals('F', result);
    }
}
