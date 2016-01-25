public class Bird {
	private int xPos;
	private int yPos;
	
	public Bird(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public Bird() {
		this.xPos = 4;
		this.yPos = 5;
	}
	
	public int getX() {
		return this.xPos;
	}
	
	public void setX(int xPos) {
		this.xPos = xPos;
	}
	
	public int getY() {
		return this.yPos;
	}
	
	public void setY(int yPos) {
		this.yPos = yPos;
	}
	
	public void steigen() {
		this.yPos -= 1;
	}
	
	public void fallen() {
		this.yPos += 1;
	}
}
