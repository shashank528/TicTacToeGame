package org.example.Entities;

import lombok.Getter;
import org.example.Strategy.PlayerStrategy;
import org.example.enums.Symbol;
@Getter
public class Player
{
  private PlayerStrategy playerStrategy;
  private Symbol symbol;
  private String name;
  public Player(PlayerStrategy playerStrategy,Symbol symbol,String name)
  {
      this.playerStrategy = playerStrategy;
      this.symbol = symbol;
      this.name = name;
  }
  public Pos makeMove(int n,String name)
  {
      return playerStrategy.makeMove(n, name);
  }

}
