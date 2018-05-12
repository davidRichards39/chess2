package Chess;

import java.awt.Image;
import java.awt.Toolkit;

public class King {
	Image kingr;
	int kingx;
	int kingy;

	public King(int color, int x, int y) {
		if (color == 1) {
			kingr = Toolkit.getDefaultToolkit().getImage("assets/king.png");
		}
		else if(color ==2) {
			kingr = Toolkit.getDefaultToolkit().getImage("assets/kingb.png");
		}
		
		kingx = x;
		kingy = y;
	}

}
