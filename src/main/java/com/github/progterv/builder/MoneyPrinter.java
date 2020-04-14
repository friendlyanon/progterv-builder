package com.github.progterv.builder;

public class MoneyPrinter {
    private final String currencyName;
    private final int currencyValue;

    public MoneyPrinter(String currencyName, int currencyValue) {
        this.currencyName = currencyName;
        this.currencyValue = currencyValue;
    }

    @Override
    public String toString() {
        return "MoneyPrinter{" +
            "\n  currencyName: " + currencyName +
            "\n  currencyValue: " + currencyValue +
            "\n}";
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public int getCurrencyValue() {
        return currencyValue;
    }
}
