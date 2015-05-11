package States;

import gears.GBase;
import gears.GSprite;
import gears.GState;
import gears.GUtils;

import java.awt.Color;
import java.awt.Rectangle;
import java.net.URL;

import javax.swing.JTextField;
import javax.swing.JTextPane;

import Cards.AssetManager;
import Entities.IButtonCallback;
import Entities.TextButton;


public class MainMenu extends GState {
	//TODO: Make input text areas, and JTextAreas integrated, so that I can get access to htmltext
	private GSprite background;
	private JTextField test;
	private JTextPane test2;
	@Override
	public void create(){
		super.create();
		
		//Initializing the images here so that get resource isn't null.
		AssetManager.initImages();
		
		background = new GSprite(0, 0, AssetManager.mainMenuBG);
		add(background);
		
		/*
		for(int i = 0; i < 5000; i++){
			GSprite spr = new GSprite(Math.random() * GBase.gameWidth, Math.random() * GBase.gameHeight, null){
				double totalElapsed = 0.0;
				double movespeed = Math.random();
				double spinspeed = Math.random();
				@Override
				public void update(){
					super.update();
					totalElapsed += GBase.elapsedSeconds * spinspeed;
					x += Math.sin(totalElapsed) * movespeed;
					y += Math.cos(totalElapsed) * movespeed;
				}
			};
			spr.createImage(10, 10, new Color((int)(Math.random()*Integer.MAX_VALUE), false));
			GBase.log((int)(Math.random()*Integer.MAX_VALUE));
			add(spr);
		}
		*/
		TextButton hostGame = new TextButton(450, 300, 100, 30, GUtils.RGBAf(45, 45, 45, 1), "Host Game", null);
		hostGame.setCallback(new IButtonCallback() {
			
			@Override
			public void callback() {
				//Enter the host game state
				GBase.log("Enter the Host Game state");
				GBase.stateManager.addState(new HostGame());
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
		
		/*
		//Create a text field at a specified position.
		test = new JTextField();
		test.setBounds(new Rectangle(50, 400, 200, 20));
		test.setBackground(new Color(0x0, false));
		test.setForeground(new Color(0xFFFFFFFF, false));
		GBase.gameInstance.add(test);
		test.setVisible(true);
		
		//Create a text area at a specified position.
		test2 = new JTextPane();
		test2.setBounds(new Rectangle(500, 400, 200, 150));
		test2.setBackground(new Color(0x0, false));
		test2.setEditable(false);
		test2.setContentType("text/html");
		GBase.gameInstance.add(test2);
		test2.setVisible(true);
		*/
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		//GBase.gameInstance.remove(test);
		//test = null;
		super.destroy();
		
	}
}
