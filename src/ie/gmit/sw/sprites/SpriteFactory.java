package ie.gmit.sw.sprites;

import java.awt.image.BufferedImage;

import ie.gmit.sw.Sprite;

public class SpriteFactory {
	
	public static Sprite playerInstance() throws Exception {
		Sprite playerSprite = new Sprite();
		
		
		playerSprite.setName("Player 1");
		playerSprite.setPosition(new Point(0,0));
		playerSprite.drawSprite(Image.loadImages("./resources/images/sprites/default", null));
		
		return playerSprite;
	}
	

}