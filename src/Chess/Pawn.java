package Chess;

import java.awt.Image;
import java.awt.Toolkit;

public class Pawn {
	Image pawnr;
	int pawnx;
	int pawny;

	public Pawn(int color, int x, int y) {
		
		if (color == 1) {
			pawnr = Toolkit.getDefaultToolkit().getImage("assets/pawn.png");
		}
		else if(color ==2) {
			pawnr = Toolkit.getDefaultToolkit().getImage("assets/pawnb.png");
		}
		
		pawnx = x;
		pawny = y;		
		
	}
	
	
}
