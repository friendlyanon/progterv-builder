package com.github.progterv.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MoneyPrinterBuilderTest {
    @Test
    public void testCurrencyName() {
        // Arrange
        MoneyPrinterBuilder builder = new MoneyPrinterBuilder();

        // Act
        MoneyPrinter printer = builder
            .setCurrencyName("HUF")
            .setCurrencyValue(10)
            .build();

        //Assert
        assertEquals("HUF", printer.getCurrencyName());
    }

    @Test
    public void testCurrencyNameNull() {
        // Arrange
        MoneyPrinterBuilder builder = new MoneyPrinterBuilder();

        // Act
        MoneyPrinter printer = builder
            .setCurrencyName(null)
            .setCurrencyValue(10)
            .build();

        //Assert
        assertNull(printer.getCurrencyName());
    }

    @Test
    public void testCurrencyValue() {
        // Arrange
        MoneyPrinterBuilder builder = new MoneyPrinterBuilder();

        // Act
        MoneyPrinter printer = builder
            .setCurrencyValue(10)
            .build();

        //Assert
        assertEquals(printer.getCurrencyValue(), 10);
    }

    @Test(expected = IllegalStateException.class)
    public void testIllegalCurrencyValue() {
        // Arrange
        MoneyPrinterBuilder builder = new MoneyPrinterBuilder();

        // Act
        builder.build();

        //Assert
    }
}
