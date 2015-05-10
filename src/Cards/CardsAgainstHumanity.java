package Cards;
import gears.GGame;

import java.awt.Color;
import States.MainMenu;


public class CardsAgainstHumanity extends GGame {
	
	public static void main(String[] args){
		CardsAgainstHumanity cards = new CardsAgainstHumanity();
	}
	
	public CardsAgainstHumanity(){
		super(new MainMenu(), 800, 600, Color.black);
		//gameFrame.setTitle("Cards Against Humanity");
	}
	
}
