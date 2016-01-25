import java.awt.event.KeyEvent;

import ledControl.BoardController;
import ledControl.gui.KeyBuffer;

public class DotBird {
	
	public static BoardController	controller;
	public static KeyBuffer		buffer;   // KeyBuffer für die Tastatureingaben
	public static Boolean gameOverFlag = false;
	private static Menu menu = new Menu();
	public static Bird bird;

	public static void main(String[] args) {
		controller = BoardController.getBoardController();
		buffer = controller.getKeyBuffer();
		menu.start();   // Startmenu aufrufen
	}
	
	public static void game(){
		//Generiere Vogel mit x = 4 und y = 5;
		bird = new Bird();
		
		//Hindernisse generieren
		Hindernisse hindernis1 = new Hindernisse(randomNumber(1, 5));
		
		//Auf- und Abbewegung
		while (gameOverFlag == false){
			KeyEvent event = buffer.pop();
	
			//Abbewegung
			if(event == null){
				try {
					Thread.sleep(160);
				} catch(java.lang.InterruptedException ie) {
					System.out.println(ie);
				} 
				bird.fallen();
			} else {
				//Aufbewegung
				if(event.getID() == java.awt.event.KeyEvent.KEY_RELEASED){
				}
				switch (event.getKeyCode()){
					case java.awt.event.KeyEvent.VK_UP:
						// der rote Punkt soll bewegt werden. Das darf nur dann
						// geschehen, wenn der Punkt sich dadurch nicht ueber den
						//  OBEREN Bildrand hinaus bewegt
						if (bird.getY() > 0){
							bird.steigen();
							try {
								Thread.sleep(105);
							} catch(java.lang.InterruptedException ie) {
								System.out.println(ie);
							}
						} break;
				}
			}
			
			DotBird.draw();
			
			// Hindernisse
			if(hindernis1.getX() <= 0) {
				hindernis1 = new Hindernisse(randomNumber(1, 5));
			}
			
			hindernis1.update();
			
			//Kollisionserkennung Vogel -> Hindernis
			if(bird.getX() == hindernis1.getX()) {
				if(hindernis1.getMinY() <= bird.getY()) {
					if(bird.getY() <= hindernis1.getMaxY()) {
						//nanananana
					} else {
						menu.gameOver();
						break;
					}
				} else {
					menu.gameOver();
					break;
				}
			}
			
			DotBird.draw();
						
			//Bodenberührung
			if (bird.getY() == 11){
				menu.gameOver();
				break; 
			}
		}
		gameOverFlag = false;		// Flag wieder deaktivieren, da es sonst nicht möglich wäre eine neue Runde zu starten
	}
	
	// LED-Board zeichnen/updaten
	public static void draw() {
		controller.resetColors();   					// Zuruecksetzen des Bildes
		controller.setColor(bird.getX(), bird.getY(), 127, 0, 0);		// Zeichnen des roten Punktes an der gespeicherten Position
		controller.updateLedStripe();					// Darstellung des neu gezeichneten Bildes auf dem Board
	}
	
	//Eine zufällige Zahl zwischen x und y generieren
	public static int randomNumber(int x, int y) {
		int number = (int)(Math.random() * y) + x;
		return number;
	}
}
