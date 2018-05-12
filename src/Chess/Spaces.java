package Chess;

public class Spaces {

	public int[] spacex;
	public int[] spacey;

	public Spaces() {
		spacex = new int[64];
		spacey = new int[64];
		int countx;
		int county = 618;
		int row = 0;

		for (int a = 0; a < 8; a++) {
			countx = 80;
			for (int i = 0; i < 8; i++) {
				spacex[i + row] = countx;
				spacey[i + row] = county;
				countx += 76;
			}
			county -= 76;
			row += 8;
		}

	}
}
