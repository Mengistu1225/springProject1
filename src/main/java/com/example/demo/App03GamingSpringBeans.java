package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		(var context = new AnnotationConfigApplicationContext(GammingConfiguration.class))
		{
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
		

	}

}
