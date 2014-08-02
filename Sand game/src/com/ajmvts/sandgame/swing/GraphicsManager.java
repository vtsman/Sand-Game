package com.ajmvts.sandgame.swing;

public class GraphicsManager 
{
	static GameWindow window;
	public static void init()
	{
		window= new GameWindow(200, 200, "Sand Game");
		for(int i = 0; i < 20; i++){
			for(int j = 0; j < 20; j++){
				window.drawPixel(i, j, 255, 0, 255);
			}
		}
	}
}
