package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {

	private static StockMarket instance;
    private List<Stock> stocks;

    private StockMarket() {
        stocks = new ArrayList<>();
    }

    public static StockMarket getInstance() {
        if (instance == null) {
            synchronized (StockMarket.class) {
                if (instance == null) {
                    instance = new StockMarket();
                }
            }
        }
        return instance;
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void showAllStocks() {
        for (Tradable stock : stocks) {
            System.out.println(stock);
            System.out.println("====================================");
        }
    }

    public void tradeStocks(String iD, String bid) {
        for (Stock stock : stocks) {
            if(stock.getID().equals(iD))
                stock.setBid(bid);
        }
    }

    public void removeStock(String iD) {
        int index = -1;
        for (int i=0;i < stocks.size();i++) {
            if(stocks.get(i).getID().equals(iD))
                index = i;
        }
        if(index!=-1)
            stocks.remove(index);
    }

    public void startTrading() {

        System.out.println("Trading starts  here");

        this.addStock(new MassLot("MASLOT", 50, "Massachusetts State Lottery Commission"));
        this.addStock(new InfyStock("INFOSYS", 50, "INFOSYS Company"));
        System.out.println("All  the stocks available in the stock market at the start");
        showAllStocks();

        tradeStocks("MASLOT", "35");
        tradeStocks("INFOSYS", "37");
        System.out.println("Current status of the Stocks in the stock market after bid one");
        showAllStocks();
        tradeStocks("MASLOT", "39");
        tradeStocks("INFOSYS", "51");
        System.out.println("Current status of the Stocks in the stock market after bid two");
        showAllStocks();
        tradeStocks("MASLOT", "29");
        tradeStocks("INFOSYS", "17");
        System.out.println("Current status of the Stocks in the stock market after bid three");
        showAllStocks();
        tradeStocks("MASLOT", "42");
        tradeStocks("INFOSYS", "18");
        System.out.println("Current status of the Stocks in the stock market after bid four");
        showAllStocks();
        tradeStocks("MASLOT", "39");
        tradeStocks("INFOSYS", "41");
        System.out.println("Current status of the Stocks in the stock market after bid five");
        showAllStocks();
        tradeStocks("MASLOT", "36");
        tradeStocks("INFOSYS", "45");
        System.out.println("Current status of the Stocks in the stock market after bid six");
        showAllStocks();
        System.out.println("All Stocks available in the stock market");
        showAllStocks();

        removeStock("MASLOT");
        System.out.println("Stocks available in the stock market after removing a stock");
        showAllStocks();
    }


}

