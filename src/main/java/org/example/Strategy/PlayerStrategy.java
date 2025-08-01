package org.example.Strategy;

import org.example.Entities.Pos;

public interface PlayerStrategy {
    public Pos makeMove(int n, String name);
}
