package org.example.Entities;

import lombok.Getter;
import org.example.enums.Symbol;

import java.util.*;

@Getter
public class Board implements Subject{
    int size;
    Symbol[][] grid ;
    Set<IObserver> observers;
    public Board(int size)
    {
        grid = new Symbol[size][size];
        for(Symbol[]row:grid)
        {
            Arrays.fill(row,Symbol.EMPTY);
        }
        observers = new HashSet<>();
    }
    public int getSize()
    {
        return grid.length;
    }
    public void mark(Symbol[][]grid,Symbol symbol,Pos pos)
    {
        grid[pos.getRow()][pos.getCol()]=symbol;
    }

    @Override
    public void notifyObserver() {

    }

    @Override
    public void addObserver(IObserver observer) {

    }

    @Override
    public void remove(IObserver observer) {

    }
}
