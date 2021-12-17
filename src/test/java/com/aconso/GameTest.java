package com.aconso;

import static org.assertj.core.api.Assertions.assertThat;

import com.aconso.model.Player;
import org.junit.Test;

public class GameTest {

  @Test
  public void testPlayer() {
    Game game = new Game();
    game.start();
    assertThat(game.getPlayer()).hasSize(2);
  }

  @Test
  public void testPlayground() {
    Game game = new Game();
    game.start();
    assertThat(game.getPlayGround()).isNotNull();
  }

  @Test
  public void testMove() {
    Game game = new Game();
    game.start();
    Player fistPlayer = game.getPlayer().get(0);
    fistPlayer.move();
    assertThat(game.getPlayGround().getMarkingCount()).isEqualTo(1);
  }
}
