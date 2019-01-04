package game.main;
import java.util.jar.*;
import java.awt.image.*;

import game.players.*;

public class Main {
	
	/*
	 * This game is meant to be a game based on choices,
	 * with less focus on graphics and more focus on game
	 * and story elements, this game is meant to make the
	 * player think about their actions, and what effects
	 * they may cause. Due to less focus on graphics, this
	 * game should have more than a few endings.
	 * 
	 * Endings may include
	 * "True, Dark Side, Good Samaritan" etc. (More to come as the story develops)
	 * 
	 * Setting:
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Story elements:
	 * For more details check out story.docx
	 * 
	 * 
	 * 
	 * Goals:
	 * Set up Github, and include a couple of people into the project
	 * 
	 * 
	 * 
	 */
	
	public static void start(Player player/*episode, etc.*/) {
		player = new Player();
		player.setName("Player 1");
		System.out.print(player.getName());
	}
	
	

	public static void main(String[] args) {
		System.out.println("Successful startup.");
		/*
		 * Throw exceptions for array out of bounds when starting up graphics,
		 * for missing resources, for missing indices, etc.
		 */
		Player player = null;
		
		start(player);

	}

}
