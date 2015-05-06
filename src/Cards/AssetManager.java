package Cards;
import java.awt.Image;

import javax.swing.ImageIcon;

public class AssetManager {
	
	public static Image mainMenuBG;
	
	public static void initImages(){
		mainMenuBG = new ImageIcon(AssetManager.class.getResource("/TitleCard.png")).getImage();
	}

}
