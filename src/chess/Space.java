package chess;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.ImageObserver;

public class Space {

	int x;
	int y;
	int width;
	int height;
	Piece piece;

	public Space(int x_, int y_, int w, int h) {
		x = x_;
		y = y_;
		width = w;
		height = h;
	}
	
	public void draw(Graphics g, ImageObserver obs, int startX, int startY) {
		// DEBUG: draw the space borders
//		if ((x+y) % 2 == 0) {
//			g.setColor(Color.cyan);
//		} else {
//			g.setColor(Color.magenta);
//		}
//		g.drawRect(startX + (x * 77), startY + (y * 77), width, height);

		if (piece != null) {
			g.drawImage(piece.getImage(), startX + (x * 77) + 16, startY + (y * 77) + 15, obs);
		}
	}
	
	public void click(int x, int y) {
		// Check if the click is within the piece image, and the image exists
		if ((x >= 16 && x <= (77 - 17)) && (y >= 15 && y <= (77 - 16)) && piece != null) {
			piece.click();
		}
	}
}
