package org.example;

public class Stock {
    String stockSymbol;
    String stockName;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String stockSymbol, String stockName, double previousClosingPrice, double currentPrice) {
        this.stockSymbol = stockSymbol;
        this.stockName = stockName;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;

    }
    public double getChangePercent(){
        double changePercent= (currentPrice-previousClosingPrice)/previousClosingPrice*100;
        return changePercent;
    }
}
