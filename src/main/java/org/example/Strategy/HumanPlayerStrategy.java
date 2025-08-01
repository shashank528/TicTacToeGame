package org.example.Strategy;

import org.example.Entities.Pos;

import java.util.Scanner;

public class HumanPlayerStrategy implements PlayerStrategy{
    @Override
    public Pos makeMove(int n,String name) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi "+name+" please enter row between 0 to " + (n-1));
        int row = sc.nextInt();
        System.out.println("Hi "+name+" please enter col between 0 to " + (n-1));
        int col = sc.nextInt();
        return new Pos(row,col);
    }
}
