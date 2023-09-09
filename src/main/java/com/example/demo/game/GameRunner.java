package com.example.demo.game;

public class GameRunner {
	
    GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game=game;
	}
	public void run() {
		System.out.println("running game: "+game);
		game.down();
		game.up();
		game.left();
		game.right();
		
	}

}
