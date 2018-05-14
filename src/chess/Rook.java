package chess;

import java.awt.Image;
import java.awt.Toolkit;

public class Rook implements Piece {
	Image img;
	String color;

	public Rook(String color_) {
		color = color_;
		if (color.equals("red")) {
			img = Toolkit.getDefaultToolkit().getImage("assets/rook.png");
		}
		else if(color.equals("blue")) {
			img = Toolkit.getDefaultToolkit().getImage("assets/rookb.png");
		}

	}

	public Image getImage() {
		return img;
	}

	public void click() {
		System.out.printf("I'm a filthy %s rook\n", color);
	}

}
