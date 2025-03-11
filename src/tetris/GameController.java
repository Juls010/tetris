package tetris;


import java.awt.Color;
import java.awt.Point;

public class GameController {
	private Board board;
	private Tetrimonio currentPiece;
	private int score;
	
	public GameController() {
		board = new Board();
		createPiece();
		score = 0;
	}
	
	public void movePiece(int dx, int dy) {
		if(board.canMove(currentPiece, dx, dy)) {
			for (Point p : currentPiece.getShape()) {
				p.x += dx;
				p.y += dy;
				
			}
		}
	}
	
	public void  dropPiece() {
		while (board.canMove(currentPiece, 0, 1)) {
			movePiece(0,1);
		}
		board.placeTetrinomio(currentPiece);
		score +=board.clearLines() * 100;
		createPiece();
	}
	
	private void createPiece() {
		Point[] shape = {new Point(4,0), new Point(5,0), new Point(4,1), new Point(5,1)};
		currentPiece = new Tetrimonio(shape, Color.YELLOW);
	}
	
	public int currentScore() {
		return score;
	}
	
	
}
