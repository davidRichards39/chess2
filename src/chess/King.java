package chess;

import java.awt.Image;
import java.awt.Toolkit;

public class King implements Piece {
	Image img;
	String color;

	public King(String color_) {
		color = color_;
		if (color.equals("red")) {
			img = Toolkit.getDefaultToolkit().getImage("assets/king.png");
		}
		else if(color.equals("blue")) {
			img = Toolkit.getDefaultToolkit().getImage("assets/kingb.png");
		}

	}

	public Image getImage() {
		return img;
	}

	public void click() {
		System.out.printf("I'm a filthy %s king\n", color);
	}

}
