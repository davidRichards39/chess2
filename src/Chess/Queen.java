package Chess;

import java.awt.Image;
import java.awt.Toolkit;

public class Queen {
	Image queenr;
	int queenx;
	int queeny;

	public Queen(int color, int x, int y) {
		if (color == 1) {
			queenr = Toolkit.getDefaultToolkit().getImage("assets/queen.png");
		}
		else if(color ==2) {
			queenr = Toolkit.getDefaultToolkit().getImage("assets/queenb.png");
		}
		queenx = x;
		queeny = y;
	}

}
