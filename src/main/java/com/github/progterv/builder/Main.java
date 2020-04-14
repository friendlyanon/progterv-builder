package com.github.progterv.builder;

public class Main {
    public static void main(String[] args) {
        MoneyPrinterBuilder builder = new MoneyPrinterBuilder()
            .setCurrencyName("HUF")
            .setCurrencyValue(1000);
        MoneyPrinter printer = builder.build();
        System.out.println(printer);
    }
}
