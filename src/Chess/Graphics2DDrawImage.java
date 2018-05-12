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
	Board board;

	public MyCanvas() {
		board = new Board(65, 65, 77, 77);

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				board.click(me.getX(), me.getY());
			}
		});
		
	}

	// draws initial board
	public void paint(Graphics g) {
		board.draw(g, this);
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