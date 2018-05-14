package chess;

import java.awt.Image;
import java.awt.Toolkit;

public class Horse implements Piece {
	Image img;
	String color;

	public Horse(String color_) {
		color = color_;
		if (color.equals("red")) {
			img = Toolkit.getDefaultToolkit().getImage("assets/horse.png");
		}
		else if(color.equals("blue")) {
			img = Toolkit.getDefaultToolkit().getImage("assets/horseb.png");
		}

	}

	public Image getImage() {
		return img;
	}

	public void click() {
		System.out.printf("I'm a filthy %s horse\n", color);
	}

}
