import java.awt.event.KeyEvent;

public class Menu {
	public void zeichneVogel() {
		DotBird.controller.resetColors();
		
		DotBird.controller.addColor(1, 9, 255, 17, 23);
		DotBird.controller.addColor(2, 8, 255, 17, 23);
		// DotBird.controller.addColor(2, 9, 255, 17, 23);
		DotBird.controller.addColor(3, 8, 255, 17, 23);
		DotBird.controller.addColor(3, 7, 255, 17, 23);
		// DotBird.controller.addColor(3, 9, 255, 17, 23);
		DotBird.controller.addColor(4, 5, 255, 17, 23);
		DotBird.controller.addColor(4, 6, 255, 17, 23);
		DotBird.controller.addColor(4, 7, 255, 17, 23);
		DotBird.controller.addColor(4, 8, 255, 17, 23);
		DotBird.controller.addColor(4, 9, 255, 17, 23);
		DotBird.controller.addColor(5, 5, 255, 17, 23);
		DotBird.controller.addColor(5, 6, 255, 17, 23);
		DotBird.controller.addColor(5, 7, 206, 0, 0);
		DotBird.controller.addColor(5, 8, 206, 0, 0);
		DotBird.controller.addColor(5, 9, 255, 17, 23);
		DotBird.controller.addColor(5, 10, 248, 138, 14);
		DotBird.controller.addColor(5, 11, 248, 138, 14);
		DotBird.controller.addColor(6, 4, 237, 62, 31);
		DotBird.controller.addColor(6, 5, 237, 62, 31);
		DotBird.controller.addColor(6, 6, 237, 62, 31);
		DotBird.controller.addColor(6, 7, 206, 0, 0);
		DotBird.controller.addColor(6, 8, 206, 0, 0);
		DotBird.controller.addColor(6, 9, 255, 17, 23);
		DotBird.controller.addColor(6, 11, 248, 138, 14);
		DotBird.controller.addColor(7, 3, 255, 255, 255);
		DotBird.controller.addColor(7, 4, 237, 62, 31);
		// DotBird.controller.addColor(7, 5, 0, 0, 0); //schwarz
		DotBird.controller.addColor(7, 6, 237, 62, 31);
		DotBird.controller.addColor(7, 7, 255, 17, 23);
		DotBird.controller.addColor(7, 8, 255, 17, 23);
		DotBird.controller.addColor(7, 9, 255, 17, 23);
		DotBird.controller.addColor(8, 4, 237, 62, 31);
		DotBird.controller.addColor(8, 5, 237, 62, 31);
		DotBird.controller.addColor(8, 6, 237, 62, 31);
		DotBird.controller.addColor(9, 5, 255, 255, 91);
		DotBird.controller.addColor(9, 6, 255, 255, 91);
		DotBird.controller.addColor(10, 6, 255, 255, 91);

		DotBird.controller.updateLedStripe();
	}
	
	public void gameOver() {
		DotBird.controller.resetColors();
		for(int i = 2; i <= 9; i++) {
			DotBird.controller.addColor(i, i, 255, 0, 0);
		}
		int k = 2;
		for(int j = 9; j >= 2; j--) {
			DotBird.controller.addColor(j, k, 255, 0, 0);
			k++;
		}
		DotBird.controller.updateLedStripe();
		DotBird.gameOverFlag = true;
	}
	
	public void start(){
		this.zeichneVogel();
		
		while(true) {
			KeyEvent event = DotBird.buffer.pop();
			if(event == null){
				try {
					Thread.sleep(250);
				} catch(java.lang.InterruptedException ie) {
					System.out.println(ie);
				}	
			} else {
				if(event.getID() == java.awt.event.KeyEvent.KEY_PRESSED){
				}
				switch (event.getKeyCode()){
					case java.awt.event.KeyEvent.VK_SPACE:	DotBird.controller.resetColors(); DotBird.controller.updateLedStripe(); DotBird.game(); break;
				}
			}
		}
	}
}
