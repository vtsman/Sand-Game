package com.ajmvts.sandgame.swing;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow extends JFrame
{
	DrawCanvas p;
	public GameWindow(int width, int height, String name){
		super();
		p = new DrawCanvas(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	    this.setName(name);
	    this.setLocationRelativeTo(null);
	    System.out.println(width + "x" + height);
	    this.setSize(width, height);
	    this.setResizable(false);
	    this.add(p);
	    p.getGraphics().create();
	}
	
	public void drawPixel(int x, int y, int r, int g, int b){
		this.p.drawPixel(x, y, r, g, b);
	}
	
	public void drawPixel(int x, int y, int rgb){
		this.p.drawPixel(x, y, rgb);
	}
	
	private class DrawCanvas extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 3274569327169002163L;
		BufferedImage b;
		
		@Override
		protected void paintComponent(Graphics g){
			g.drawImage(b, 0, 0, this);
			System.out.printf("0x%x\n", this.b.getRGB(0, 0));
		}
		
		DrawCanvas(int width, int height){
			b = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		}
		
		public void drawPixel(int x, int y, int r, int g, int b){
			drawPixel(x, y, (r << 16) + (g << 8) + b);
		}
		
		public void drawPixel(int x, int y, int rgb){
			this.b.setRGB(x, y, rgb);
		}
	}
}
