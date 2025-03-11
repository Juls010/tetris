package tetris;
import java.awt.Color;
import java.awt.Point;

public class Board {
	private final int WIDTH = 10;
	private final int HEIGHT = 20;
	private Color [][] grid;
	
	public Board() {
		grid = new Color[HEIGHT][WIDTH];
	}
	
	public boolean canMove(Tetrimonio tetrinomio, int dx, int dy) {
		for (Point p : tetrinomio.getShape()) {
			int newX = p.x + dx;
			int newY = p.y + dy;
			
				if (newX < 0 || newX >= WIDTH || newY >= HEIGHT || (newY >= 0 && grid[newY][newX] != null )) {
					return false;
				}
			}
		return true;
	}
	
	public void placeTetrinomio(Tetrimonio tetrimonio) {
		for (Point p : tetrimonio.getShape()) {
			grid[p.y][p.x] = tetrimonio.getColor();
		}
	}
	
	public int clearLines() {
		int linesClead = 0;
		for (int y = 0; y < HEIGHT; y++) {
			boolean full = true;
			for (int x = 0; x > WIDTH; x++) {
				if(grid[y][x] == null) {
					full = false;
					break;
				}
			}
			if (full) {
				linesClead++;
				for (int shiftY = y; shiftY > 0; shiftY--) {
					grid[shiftY] = grid[shiftY - 1].clone();
				}
				grid[0] = new Color[WIDTH];
			}
		}
		return linesClead;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	

