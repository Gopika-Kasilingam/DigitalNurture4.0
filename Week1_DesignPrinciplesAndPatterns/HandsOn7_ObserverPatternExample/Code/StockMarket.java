package Week1_DesignPrinciplesAndPatterns.HandsOn7_ObserverPatternExample.Code;

import java.util.*;

/*
 * StockMarket is the subject that maintains stock price and notifies all observers when it changes.
 */
public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockPrice);  // Push the new price to all observers
        }
    }

    // Simulate a stock price update
    public void setStockPrice(double price) {
        System.out.println("\nStock price updated to: " + price);
        this.stockPrice = price;
        notifyObservers();  // Notify all observers of the change
    }
}
