package Entities;

import gears.GBase;
import gears.GObject;
import gears.GSprite;

import java.awt.Graphics2D;

public class Button extends GObject {
	protected GSprite rest, hover, pressed;
	protected int state;
	protected int lastState;
	public IButtonCallback callback;
	public Button(double x, double y, int width, int height) {
		super(x, y, width, height);
	}
	
	public void setHoverSprite(GSprite hover){
		this.hover = hover;
	}
	
	public void setRestSprite(GSprite rest){
		this.rest = rest;
	}
	
	public void setPressedSprite(GSprite pressed){
		this.pressed = pressed;
	}
	
	@Override
	public void update(){
		lastState = state;
		if(checkPointInBounds(GBase.input.getMouseLocation())){
			if(GBase.input.mouseDown()){
				state = 2;
			}else{
				if(lastState == 2)
					callback.callback();
				state = 1;
			}
		}else{
			state = 0;
		}
		if(lastState != state){
			switch(state){
			case 0: //rest
				rest.restartAnimation();
				break;
				
			case 1: //hover
				hover.restartAnimation();
				break;
				
			case 2: //pressed
				pressed.restartAnimation();
				break;
			}
		}
		switch(state){
		case 0: //rest
			rest.x = x;
			rest.y = y;
			rest.update();
			break;
			
		case 1: //hover
			hover.x = x;
			hover.y = y;
			hover.update();
			break;
			
		case 2: //pressed
			pressed.x = x;
			pressed.y = y;
			pressed.update();
			break;
		}
		
	}
	
	@Override
	public void render(Graphics2D g){
		switch(state){
		case 0: //rest
			rest.render(g);
			break;
			
		case 1: //hover
			hover.render(g);
			break;
			
		case 2: //pressed
			pressed.render(g);
			break;
		}
	}
	
	public void setCallback(IButtonCallback callback){
		this.callback = callback;
	}

}
