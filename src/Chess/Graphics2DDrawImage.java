package Chess;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {
	// game pieces
	Pawn[] pawn;
	King[] king;
	Queen[] queen;
	Rook[] rook;
	Bishop[] bishop;
	Horse[] horse;
	Image light;
	Image board;
	
	// board spaces
	Spaces spaces;

	public MyCanvas() {
		// initialize members
		spaces = new Spaces();

		pawn = new Pawn[16];
		king = new King[2];
		queen = new Queen[2];
		rook = new Rook[4];
		bishop = new Bishop[4];
		horse = new Horse[4];
		light = Toolkit.getDefaultToolkit().getImage("assets/light.png");
		board = Toolkit.getDefaultToolkit().getImage("assets/chess board.png");
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				clickCapture(me);
			}
		});
		
	}
	
	private void clickCapture(MouseEvent me) {
		int clickx = MouseInfo.getPointerInfo().getLocation().x;
		int clicky = MouseInfo.getPointerInfo().getLocation().y;
		clickx -= 60;
		clicky -= 88;
		for (int i = 0; i < 16; i++) {
			if (clickx > (pawn[i].pawnx - 20) && clickx < (pawn[i].pawnx + 20) && clicky > (pawn[i].pawny - 20)
					&& clicky < (pawn[i].pawny + 20)) {
				System.out.println("pawn" + i);

			}
		}
		for (int i = 0; i < 2; i++) {
			if (clickx > (king[i].kingx - 20) && clickx < (king[i].kingx + 20) && clicky > (king[i].kingy - 20)
					&& clicky < (king[i].kingy + 20)) {
				System.out.println("king" + i);

			} else if (clickx > (queen[i].queenx - 20) && clickx < (queen[i].queenx + 20)
					&& clicky > (queen[i].queeny - 20) && clicky < (king[i].kingy + 20)) {
				System.out.println("queen" + i);
			}
		}

		for (int i = 0; i < 4; i++) {
			if (clickx > (rook[i].rookx - 20) && clickx < (rook[i].rookx + 20) && clicky > (rook[i].rooky - 20)
					&& clicky < (rook[i].rooky + 20)) {
				System.out.println("rook" + i);

			} else if (clickx > (bishop[i].bishopx - 20) && clickx < (bishop[i].bishopx + 20)
					&& clicky > (bishop[i].bishopy - 20) && clicky < (bishop[i].bishopy + 20)) {
				System.out.println("bishop" + i);
			} else if (clickx > (horse[i].horsex - 20) && clickx < (horse[i].horsex + 20)
					&& clicky > (horse[i].horsey - 20) && clicky < (horse[i].horsey + 20)) {
				System.out.println("horse" + i);
			}
		}
	}

	// draws initial board
	public void paint(Graphics g) {
		g.drawImage(board, 0, 0, this);

		// create pawns
		for (int i = 8; i < 16; i++) {
			pawn[i - 8] = new Pawn(1, spaces.spacex[i], spaces.spacey[i]);
			pawn[i] = new Pawn(2, spaces.spacex[i + 40], spaces.spacey[i + 40]);
			g.drawImage(pawn[i - 8].pawnr, pawn[i - 8].pawnx, pawn[i - 8].pawny, this); // red pawns
			g.drawImage(pawn[i].pawnr, pawn[i].pawnx, pawn[i].pawny, this); // blue pawns
		}
		// create king and queen
		for (int i = 0; i < 2; i++) {
			king[i] = new King(i + 1, spaces.spacex[i * 56 + 3], spaces.spacey[i * 56 + 3]);
			queen[i] = new Queen(i + 1, spaces.spacex[i * 56 + 4], spaces.spacey[i * 56 + 4]);
			g.drawImage(king[i].kingr, king[i].kingx, king[i].kingy, this);
			g.drawImage(queen[i].queenr, queen[i].queenx, queen[i].queeny, this);
		}
		// create rest
		for (int i = 0; i < 2; i++) {
			rook[i] = new Rook(i + 1, spaces.spacex[i * 56], spaces.spacey[i * 56]);
			bishop[i] = new Bishop(i + 1, spaces.spacex[i * 56 + 2], spaces.spacey[i * 56 + 2]);
			horse[i] = new Horse(i + 1, spaces.spacex[i * 56 + 1], spaces.spacey[i * 56 + 1]);
			g.drawImage(rook[i].rookr, rook[i].rookx, rook[i].rooky, this);
			g.drawImage(bishop[i].bishopr, bishop[i].bishopx, bishop[i].bishopy, this);
			g.drawImage(horse[i].horser, horse[i].horsex, horse[i].horsey, this);
		}
		for (int i = 2; i < 4; i++) {
			rook[i] = new Rook(i - 1, spaces.spacex[(i - 2) * 56 + 7], spaces.spacey[(i - 2) * 56 + 7]);
			bishop[i] = new Bishop(i - 1, spaces.spacex[(i - 2) * 56 + 5], spaces.spacey[(i - 2) * 56 + 5]);
			horse[i] = new Horse(i - 1, spaces.spacex[(i - 2) * 56 + 6], spaces.spacey[(i - 2) * 56 + 6]);
			g.drawImage(rook[i].rookr, rook[i].rookx, rook[i].rooky, this);
			g.drawImage(bishop[i].bishopr, bishop[i].bishopx, bishop[i].bishopy, this);
			g.drawImage(horse[i].horser, horse[i].horsex, horse[i].horsey, this);
		}

	}
}

public class Graphics2DDrawImage {
	public static void main(String[] a) {

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 765, 765);
		window.getContentPane().add(new MyCanvas());
		window.setVisible(true);
	}
}