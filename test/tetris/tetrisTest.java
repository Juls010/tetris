package tetris;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tetris.GameController;

import java.awt.*;

class TetrisTest {
	private GameController game;
	private Board board;
	
	@BeforeEach
	void setUp() {
		game = new GameController();
		board = new Board();
	}
	
	@Test
	void testInicialScoreIsZero() {
		assertEquals(0, game.currentScore(), "The initial score must be 0.");
	}
	
}