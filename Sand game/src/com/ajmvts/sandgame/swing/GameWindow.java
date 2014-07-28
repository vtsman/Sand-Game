package com.ajmvts.sandgame.swing;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame
{
	public GameWindow(int width, int height, String name){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	    this.setName(name);
	    this.setPreferredSize(new Dimension(width, height));
	    this.setLocationRelativeTo(null);
	}
	
	public void setPixel(int x, int y, int r, int g, int b){
		this.getGraphics().setColor(new Color(r, g, b));
	}
	
	/*public in[] getPixel(int x, int y){
		Color c = this.getGraphics().
	}*/
	
	
}
