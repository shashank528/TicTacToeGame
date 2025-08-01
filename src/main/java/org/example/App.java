package org.example;

import org.example.Controller.BoardGame;
import org.example.Controller.TicToeGame;
import org.example.Entities.Board;
import org.example.Entities.Player;
import org.example.Strategy.HumanPlayerStrategy;
import org.example.Strategy.PlayerStrategy;
import org.example.enums.Symbol;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        PlayerStrategy playerStrategy = new HumanPlayerStrategy();
        Player player1 = new Player(playerStrategy, Symbol.X,"shashank");
        Player player2 = new Player(playerStrategy,Symbol.O,"sushu");
        Board board = new Board(3);
        BoardGame game = new TicToeGame(0,board,player1,player2);
        game.play();
    }
}
