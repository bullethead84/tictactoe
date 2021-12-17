package com.aconso;

import com.aconso.model.PlayGround;
import com.aconso.model.Player;
import java.util.List;

public class Game {

  private List players;
  private PlayGround playground;

  public void start() {

  }

  public List<Player> getPlayer() {
    return players;
  }

  public PlayGround getPlayGround() {
    return playground;
  }

  public void setPlayers(List players) {
    this.players = players;
  }

  public void setPlayground(PlayGround playground) {
    this.playground = playground;
  }
}
