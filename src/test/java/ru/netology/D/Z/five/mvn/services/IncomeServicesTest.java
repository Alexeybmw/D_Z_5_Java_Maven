package ru.netology.D.Z.five.mvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class IncomeServicesTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/data.csv")
    void shouldCalculateIncome(int expected, int income, int expense, int threshold) {
        IncomeServices service = new IncomeServices();

        int actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);


    }

}