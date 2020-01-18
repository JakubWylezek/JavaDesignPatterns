package pl.wylezek.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GamesFactoryTest {

    @Test
    public void shouldReturnActionGame() {
        Games game = GamesFactory.getGame("action", "Doom", 15);
        assertEquals(ActionGame.class, game.getClass());
        assertEquals("Doom", game.getTitle());
        assertEquals(15, game.getPrice());
    }

    @Test
    public void shouldReturnStrategyGame() {
        Games games = GamesFactory.getGame("strategy", "Total War", 200);
        assertEquals(StrategyGame.class, games.getClass());
        assertEquals("Total War", games.getTitle());
        assertEquals(200, games.getPrice());
    }
}