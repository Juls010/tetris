package tetris;

public class Tetris {

	public static void main(String [] args) {
		
		GameController game = new GameController();
		System.out.println("Bienvenides a Tetris!");
		System.out.println("Puntuación inicial: "+ game.currentScore());
		
		game.dropPiece();
		System.out.println("Puntuación: " + game.currentScore());
		
		
	}
	
	
}
