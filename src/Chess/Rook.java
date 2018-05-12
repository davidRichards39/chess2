package Chess;

import java.awt.Image;
import java.awt.Toolkit;

public class Rook {
	Image rookr;
	int rookx;
	int rooky;

	public Rook(int color, int x, int y) {
		if (color == 1) {
			rookr = Toolkit.getDefaultToolkit().getImage("C:/Users/Galen/eclipse-workspace/desktop app/rook.png");
		}
		else if(color ==2) {
			rookr = Toolkit.getDefaultToolkit().getImage("C:/Users/Galen/eclipse-workspace/desktop app/rookb.png");
		}
		rookx = x;
		rooky = y;
	}

}
