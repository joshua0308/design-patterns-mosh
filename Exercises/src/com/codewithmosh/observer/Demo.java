package com.codewithmosh.observer;

public class Demo {
    public static void show() {
        var statusBar = new StatusBar();
        var stockListView = new StockListView();

        var teslaStock = new Stock("TSLA", 10);
        var aaplStock = new Stock("AAPL", 20);
        var deltaStock = new Stock("DLTA", 30);

        // show popular stocks
        statusBar.addStock(teslaStock);
        statusBar.addStock(aaplStock);

        // show all stocks
        stockListView.addStock(teslaStock);
        stockListView.addStock(aaplStock);
        stockListView.addStock(deltaStock);

        teslaStock.setPrice(100);

        stockListView.removeStock(teslaStock);

        teslaStock.setPrice(1000);
    }
}
