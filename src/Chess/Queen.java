package Chess;

import java.awt.Image;
import java.awt.Toolkit;

public class Queen implements Piece {
	Image img;
	String color;

	public Queen(String color_) {
		color = color_;
		if (color.equals("red")) {
			img = Toolkit.getDefaultToolkit().getImage("assets/queen.png");
		}
		else if(color.equals("blue")) {
			img = Toolkit.getDefaultToolkit().getImage("assets/queenb.png");
		}

	}

	public Image getImage() {
		return img;
	}

	public void click() {
		System.out.printf("I'm a filthy %s queen\n", color);
	}

}
