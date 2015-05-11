package Entities;

import gears.GBase;
import gears.GObject;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JTextField;

public class InputText extends GObject {
	public String text = "";
	public JTextField field;
	public InputText(double X, double Y, double width){
		super(X, Y);
		field = new JTextField();
		field.setBounds(new Rectangle((int)X, (int)Y, (int)width, 20));
		field.setBackground(new Color(0x0, false));
		field.setForeground(new Color(0xFFFFFFFF, false));
		GBase.gameInstance.add(field);
		field.setVisible(true);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		super.update();
		text = field.getText();
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		GBase.gameInstance.remove(field);
		field = null;
		super.destroy();
	}
}
