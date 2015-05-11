package States;

import gears.GBase;
import gears.GSprite;
import gears.GState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import Entities.Button;
import Entities.IButtonCallback;
import Entities.InputText;
import Entities.TextButton;

public class HostGame extends GState {
	
	private GSprite background;
	private Button closeButton, ok, cancel;
	private InputText name, port;
	private int width = 400;
	private int height = 300;
	
	@Override
	public void create() {
		super.create();
		//Need to have a title, an X, a box for player name a box for port #, an OK button and a Cancel button.
		
		background = new GSprite(GBase.gameWidth/2 - width/2, GBase.gameHeight/2 - height/2, null);
		background.createImage(width, height, new Color(40, 40, 40));
		Graphics2D context = (Graphics2D)background.fullImage.getGraphics();
		context.setFont(new Font("Arial", Font.BOLD, 20));
		context.drawString("Host Game", 3, 20);
		add(background);
		
		closeButton = new TextButton(background.x + background.width - 20, background.y, 20, 20, Color.red.darker(), "X", new Font("Arial", Font.BOLD, 20));//(background.x + background.width - 20, 0, 20, 20);
		closeButton.setCallback(new IButtonCallback() {
			@Override
			public void callback() {
				GBase.stateManager.popState();
			}
		});
		add(closeButton);
		
		name = new InputText(background.x + 10, background.y + 50, background.width - 20);
		name.field.setText("Enter player name");
		add(name);
		
		port = new InputText(background.x + 10,  background.y + 80, background.width - 20);
		port.field.setText("Port (ex: 4777)");
		add(port);
		
		ok = new TextButton(background.x + background.width - 150, background.y + background.height - 20, 60, 20, Color.gray, "OK", new Font("Arial", Font.BOLD, 15));//(background.x + background.width - 20, 0, 20, 20);
		ok.setCallback(new IButtonCallback() {
			@Override
			public void callback() {
				GBase.log("Enter waiting for players state");
			}
		});
		add(ok);
		
		cancel = new TextButton(background.x + background.width - 80, background.y  + background.height - 20, 60, 20, Color.gray, "X", new Font("Arial", Font.BOLD, 15));//(background.x + background.width - 20, 0, 20, 20);
		cancel.setCallback(new IButtonCallback() {
			@Override
			public void callback() {
				GBase.stateManager.popState();
			}
		});
		add(cancel);
		
	}
}
