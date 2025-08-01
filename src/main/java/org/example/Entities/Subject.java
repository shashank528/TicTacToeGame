package org.example.Entities;

public interface Subject {
    public void notifyObserver();
    public void addObserver(IObserver observer);
    public void remove(IObserver observer);
}
