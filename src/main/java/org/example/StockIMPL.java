package org.example;

public class StockIMPL {
    public static void main(String[] args) {
        Stock stock1 = new Stock("ORCL","Oracle Corporation",34.5,34.35);
        System.out.println("Stock symbol name    = "+stock1.stockSymbol);
        System.out.println("Stock  name          = "+stock1.stockName);
        System.out.println("Stock previous price = "+stock1.previousClosingPrice);
        System.out.println("Stock current  price = "+stock1.currentPrice);
        System.out.println("stock change percent = "+stock1.getChangePercent());

    }
}