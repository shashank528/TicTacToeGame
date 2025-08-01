package org.example.Controller;

import org.example.Entities.Board;
import org.example.Entities.Player;
import org.example.Entities.Pos;
import org.example.enums.Symbol;

import java.util.LinkedList;
import java.util.Queue;

public class TicToeGame implements BoardGame{
    private int moves;
    private Board board;
    private Player playerX;
    private Player playerO;
    public TicToeGame(int moves,Board board,Player playerX,Player playerO)
    {
        this.moves=0;
        this.board=board;
        this.playerX=playerX;
        this.playerO=playerO;
        q.add(playerX);
        q.add(playerO);
    }
    private final Queue<Player> q = new LinkedList<>();
    @Override
    public void play() {
        while(true && moves<=board.getSize()*board.getSize())
        {
            Player  rem = q.remove();
            Pos pos = rem.makeMove(board.getSize(),rem.getName());
            if(isValid(board.getGrid(),pos))
            {
                board.mark(board.getGrid(),rem.getSymbol(),pos);
                if(isGameOver(board.getGrid(),pos))
                {
                    System.out.println(rem.getName()+" wins the game ");
                    printWinningState(board.getGrid());
                    break;
                }
            }
            else
            {
                System.out.println("try again this move is not valid ");
            }
            moves++;
            q.add(rem);
        }
        if(moves==9)
        System.out.println("game is draw");
    }
    public boolean isGameOver(Symbol[][]grid,Pos pos)
    {
        int row=pos.getRow();
        int col=pos.getCol();
        Symbol player = grid[row][col];
        int n = grid.length;

        // Check row
        boolean win = true;
        for (int j = 0; j < n; j++) {
            if (grid[row][j] != player) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // Check column
        win = true;
        for (int i = 0; i < n; i++) {
            if (grid[i][col] != player) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // Check main diagonal
        if (row == col) {
            win = true;
            for (int i = 0; i < n; i++) {
                if (grid[i][i] != player) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // Check anti-diagonal
        if (row + col == n - 1) {
            win = true;
            for (int i = 0; i < n; i++) {
                if (grid[i][n - 1 - i] != player) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        return false;

    }
    public boolean isValid(Symbol[][]grid,Pos pos)
    {
        int row = pos.getRow();
        int col = pos.getCol();

        // Ensure position is within bounds and is EMPTY
        if (row >= 0 && row < grid.length && col >= 0 && col < grid.length) {
            return grid[row][col] == Symbol.EMPTY;
        }
        return false;
    }
    public void  printWinningState(Symbol[][]grid){
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
