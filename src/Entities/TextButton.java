package Entities;

import gears.GSprite;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextButton extends Button {
	protected String text;
	public TextButton(double x, double y, int width, int height, Color baseplateColor, String text, Font font) {
		super(x, y, width, height);
		this.text = text;
		rest = new GSprite(0, 0, null);
		hover = new GSprite(0, 0, null);
		pressed = new GSprite(0, 0, null);
		
		if(font == null)
			font = new Font("Arial", Font.BOLD, 12);
		
		//Build the button. It's going to look super sketchy because it's all generated instead of based on an image
		rest.createImage(width, height, baseplateColor);
		Graphics2D context = (Graphics2D)rest.fullImage.getGraphics();
		context.setRenderingHint(
		        RenderingHints.KEY_TEXT_ANTIALIASING,
		        RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		context.setFont(font);
		FontMetrics fontMetrix = context.getFontMetrics(font);
		int fontHeight = fontMetrix.getAscent() - fontMetrix.getDescent();
		int textWidth = fontMetrix.stringWidth(text);
		context.drawString(text, (width - textWidth)/2, (height + fontHeight)/2);
		
		//Build the hover
		hover.createImage(width, height, baseplateColor.brighter());
		context = (Graphics2D)hover.fullImage.getGraphics();
		context.setRenderingHint(
		        RenderingHints.KEY_TEXT_ANTIALIASING,
		        RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		context.setFont(font);
		fontMetrix = context.getFontMetrics(font);
		fontHeight = fontMetrix.getAscent() - fontMetrix.getDescent();
		textWidth = fontMetrix.stringWidth(text);
		context.drawString(text, (width - textWidth)/2, (height + fontHeight)/2);
		
		//Build the pressed
		pressed.createImage(width, height, baseplateColor.darker());
		context = (Graphics2D)pressed.fullImage.getGraphics();
		context.setRenderingHint(
		        RenderingHints.KEY_TEXT_ANTIALIASING,
		        RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		context.setFont(font);
		fontMetrix = context.getFontMetrics(font);
		fontHeight = fontMetrix.getAscent() - fontMetrix.getDescent();
		textWidth = fontMetrix.stringWidth(text);
		context.drawString(text, (width - textWidth)/2+1, (height + fontHeight)/2+1);
	}

}
