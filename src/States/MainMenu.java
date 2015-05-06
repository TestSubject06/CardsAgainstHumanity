package States;

import gears.GBase;
import gears.GSprite;
import gears.GState;
import Cards.AssetManager;


public class MainMenu extends GState {
	private GSprite background;
	@Override
	public void create(){
		super.create();
		
		//Initializing the images here so that get resource isn't null.
		AssetManager.initImages();
		
		background = new GSprite(0, 0, AssetManager.mainMenuBG);
		add(background);
	}

}
