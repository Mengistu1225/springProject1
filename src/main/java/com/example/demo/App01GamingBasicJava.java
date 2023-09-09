package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.PacmanGame;
import com.example.demo.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//var game=new MarioGame();
		//var game=new SuperContraGame();
		var game =new PacmanGame(); // one object creation
		var gameRunner =new GameRunner(game); 
		   // object creation + wiring of dependencise 
		   // game is dependence of GameRunner
		gameRunner.run();
	

	}

}
