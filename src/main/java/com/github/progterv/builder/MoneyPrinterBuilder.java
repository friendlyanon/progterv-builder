package com.github.progterv.builder;

public class MoneyPrinterBuilder {
    private String currencyName;
    private int currencyValue;

    public MoneyPrinter build() {
        validateValues();
        return new MoneyPrinter(currencyName, currencyValue);
    }

    private void validateValues() {
        if (currencyValue <= 0) {
            throw new IllegalStateException("currencyValue must be greater than 0");
        }
    }

    public MoneyPrinterBuilder setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
        return this;
    }

    public MoneyPrinterBuilder setCurrencyValue(int currencyValue) {
        this.currencyValue = currencyValue;
        return this;
    }
}
