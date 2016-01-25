public class Hindernisse {
	private static int type;
	private static int speed = 1;
	private int x = 12;
	private int minY;
	private int maxY;
	
	public Hindernisse(int type) {
		Hindernisse.type = type;
		switch(type) {
			case 1:	this.minY = 5; this.maxY = 6; break;
			case 2: this.minY = 4; this.maxY = 7; break;
			case 3: this.minY = 2; this.maxY = 5; break;
			case 4: this.minY = 7; this.maxY = 9; break;
			case 5: this.minY = 4; this.maxY = 6; break;
		}
	}
	
	public void update() {
		x -= speed;
		switch(type) {
			case 1: this.hindernis1(this.x); break;
			case 2: this.hindernis2(this.x); break;
			case 3: this.hindernis3(this.x); break;
			case 4: this.hindernis4(this.x); break;
			case 5: this.hindernis5(this.x); break;
		}
		DotBird.controller.updateLedStripe();
		try {
			Thread.sleep(100);
		} catch(java.lang.InterruptedException ie) {
			System.out.println(ie);
		}
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getMinY() {
		return this.minY;
	}
	
	public int getMaxY() {
		return this.maxY;
	}
	
	public void hindernis1(int posX) {
		DotBird.controller.addColor(posX, 0, 38, 193, 221);
		DotBird.controller.addColor(posX, 1, 38, 193, 221);
		DotBird.controller.addColor(posX, 2, 38, 193, 221);
		DotBird.controller.addColor(posX, 3, 38, 193, 221);
		DotBird.controller.addColor(posX, 4, 38, 193, 221);
		DotBird.controller.addColor(posX, 7, 38, 193, 221);
		DotBird.controller.addColor(posX, 8, 38, 193, 221);
		DotBird.controller.addColor(posX, 9, 38, 193, 221);
		DotBird.controller.addColor(posX, 10, 38, 193, 221);
		DotBird.controller.addColor(posX, 11, 38, 193, 221);
	}
	
	public void hindernis2(int posX) {
		DotBird.controller.addColor(posX, 0, 38, 193, 221);
		DotBird.controller.addColor(posX, 1, 38, 193, 221);
		DotBird.controller.addColor(posX, 2, 38, 193, 221);
		DotBird.controller.addColor(posX, 3, 38, 193, 221);
		DotBird.controller.addColor(posX, 8, 38, 193, 221);
		DotBird.controller.addColor(posX, 9, 38, 193, 221);
		DotBird.controller.addColor(posX, 10, 38, 193, 221);
		DotBird.controller.addColor(posX, 11, 38, 193, 221);
	}
	
	public void hindernis3(int posX) {
		DotBird.controller.addColor(posX, 0, 38, 193, 221);
		DotBird.controller.addColor(posX, 1, 38, 193, 221);
		DotBird.controller.addColor(posX, 6, 38, 193, 221);
		DotBird.controller.addColor(posX, 7, 38, 193, 221);
		DotBird.controller.addColor(posX, 8, 38, 193, 221);
		DotBird.controller.addColor(posX, 9, 38, 193, 221);
		DotBird.controller.addColor(posX, 10, 38, 193, 221);
		DotBird.controller.addColor(posX, 11, 38, 193, 221);
	}

	public void hindernis4(int posX) {
		DotBird.controller.addColor(posX, 0, 38, 193, 221);
		DotBird.controller.addColor(posX, 1, 38, 193, 221);
		DotBird.controller.addColor(posX, 2, 38, 193, 221);
		DotBird.controller.addColor(posX, 3, 38, 193, 221);
		DotBird.controller.addColor(posX, 4, 38, 193, 221);
		DotBird.controller.addColor(posX, 5, 38, 193, 221);
		DotBird.controller.addColor(posX, 6, 38, 193, 221);
		DotBird.controller.addColor(posX, 10, 38, 193, 221);
		DotBird.controller.addColor(posX, 11, 38, 193, 221);
	}

	public void hindernis5(int posX) {
		DotBird.controller.addColor(posX, 0, 38, 193, 221);
		DotBird.controller.addColor(posX, 1, 38, 193, 221);
		DotBird.controller.addColor(posX, 2, 38, 193, 221);
		DotBird.controller.addColor(posX, 3, 38, 193, 221);
		DotBird.controller.addColor(posX, 7, 38, 193, 221);
		DotBird.controller.addColor(posX, 8, 38, 193, 221);
		DotBird.controller.addColor(posX, 9, 38, 193, 221);
		DotBird.controller.addColor(posX, 10, 38, 193, 221);
		DotBird.controller.addColor(posX, 11, 38, 193, 221);
	}
}
