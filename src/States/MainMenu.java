package States;

import gears.GBase;
import gears.GSprite;
import gears.GState;
import gears.GUtils;
import Cards.AssetManager;
import Entities.IButtonCallback;
import Entities.TextButton;


public class MainMenu extends GState {
	private GSprite background;
	@Override
	public void create(){
		super.create();
		
		//Initializing the images here so that get resource isn't null.
		AssetManager.initImages();
		
		background = new GSprite(0, 0, AssetManager.mainMenuBG);
		add(background);
		
		TextButton hostGame = new TextButton(450, 300, 100, 30, GUtils.RGBAf(45, 45, 45, 1), "Host Game", null);
		hostGame.setCallback(new IButtonCallback() {
			
			@Override
			public void callback() {
				//Enter the host game state
				GBase.log("Enter the Host Game state");
			}
			
		});
		add(hostGame);
		
		TextButton joinGame = new TextButton(450, 375, 100, 30, GUtils.RGBAf(45, 45, 45, 1), "Join Game", null);
		joinGame.setCallback(new IButtonCallback() {
			
			@Override
			public void callback() {
				//Enter the host game state
				GBase.log("Enter the Join Game state");
			}
			
		});
		add(joinGame);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		super.update();
		GBase.log((long)1000/60);
	}

}
