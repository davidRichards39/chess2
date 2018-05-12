package Chess;

import java.awt.Image;
import java.awt.Toolkit;

public class Bishop implements Piece {
	Image img;
	String color;

	public Bishop(String color_) {
		color = color_;
		if (color.equals("red")) {
			img = Toolkit.getDefaultToolkit().getImage("assets/bishop.png");
		}
		else if(color.equals("blue")) {
			img = Toolkit.getDefaultToolkit().getImage("assets/bishopb.png");
		}

	}

	public Image getImage() {
		return img;
	}

	public void click() {
		System.out.printf("I'm a filthy %s bishop\n", color);
	}

}
