package chess;

import java.awt.Image;
import java.awt.Toolkit;

public class Pawn implements Piece {
	Image img;
	String color;

	public Pawn(String color_) {
		color = color_;
		if (color.equals("red")) {
			img = Toolkit.getDefaultToolkit().getImage("assets/pawn.png");
		}
		else if(color.equals("blue")) {
			img = Toolkit.getDefaultToolkit().getImage("assets/pawnb.png");
		}

	}

	public Image getImage() {
		return img;
	}

	public void click() {
		System.out.printf("I'm a filthy %s pawn\n", color);
	}
	
}
