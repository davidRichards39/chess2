package chess;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

public class Board {
	// board assets
	Image light;
	Image board;
	
	ImageObserver obs;

	// board spaces
	Space[][] spaces;

	// board dimensions
	int startX;
	int startY;
	int width;
	int height;
	
	public Board(int startX_, int startY_, int width_, int height_) {
		startX = startX_;
		startY = startY_;
		width = width_;
		height = height_;
	
		// load the assets
		light = Toolkit.getDefaultToolkit().getImage("assets/light.png");
		board = Toolkit.getDefaultToolkit().getImage("assets/chess board.png");

		// create the two dimensional array for board spaces
		spaces = new Space[8][8];

		// create all of the board spaces
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				spaces[x][y] = new Space(x, y, width, height);
			}
		}
		
		// create the pawns
		for (int x = 0; x < 8; x ++) {
			spaces[x][1].piece = new Pawn("red");
			spaces[x][6].piece = new Pawn("blue");
		}

		// create the pawns
		// create the kings
		// create the queens
		// create the rooks
		// create the bishops
		// create the horses

	}
	
	public void draw(Graphics g, ImageObserver obs) {
		// draw the board and light
		g.drawImage(board, 0, 0, obs);
		
		// draw the spaces
		for (int x = 0; x < 8; x++) {
			for (int y = 0; y < 8; y++) {
				spaces[x][y].draw(g, obs, startX, startY);;
			}
		}
	}
	
	public void click(int x, int y) {
		int boardX = x - startX;
		int boardY = y - startY;
		int spaceX = boardX / 77;
		int spaceY = boardY / 77;
		
		// If the click is off the board, return, pass the click location in space coordinates
		if (boardX < 0 || boardY < 0) {
			return;
		} else if (spaceX > 7 || spaceY > 7) {
			return;
		} else {
			spaces[spaceX][spaceY].click(boardX % 77, boardY % 77);
		}
	}
}
