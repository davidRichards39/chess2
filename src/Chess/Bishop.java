package Chess;

import java.awt.Image;
import java.awt.Toolkit;

public class Bishop {
	
	Image bishopr;
	int bishopx;
	int bishopy;

	public Bishop(int color, int x, int y) {
		if (color == 1) {
			bishopr = Toolkit.getDefaultToolkit().getImage("C:/Users/Galen/eclipse-workspace/desktop app/bishop.png");
		}
		else if(color ==2) {
			bishopr = Toolkit.getDefaultToolkit().getImage("C:/Users/Galen/eclipse-workspace/desktop app/bishopb.png");
		}
		
		bishopx = x;
		bishopy = y;
	}

}
