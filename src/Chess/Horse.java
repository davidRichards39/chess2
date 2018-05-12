package Chess;

import java.awt.Image;
import java.awt.Toolkit;

public class Horse {
	Image horser;
	int horsex;
	int horsey;

	public Horse(int color, int x, int y) {
		if (color == 1) {
			horser = Toolkit.getDefaultToolkit().getImage("C:/Users/Galen/eclipse-workspace/desktop app/horse.png");
		} else if (color == 2) {
			horser = Toolkit.getDefaultToolkit().getImage("C:/Users/Galen/eclipse-workspace/desktop app/horseb.png");
		}
		horsex = x;
		horsey = y;
	}

}
