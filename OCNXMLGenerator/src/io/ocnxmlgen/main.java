package io.ocnxmlgen;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class main {
	public static void main(String[] args) {

		//Getting current monitor size (works on multi screen setups)
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth();
		int height = gd.getDisplayMode().getHeight();
		
		//int height = 1500;
		//int width = 750;
	
		
		start Start = new start();
		Start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Start.setSize(width,height);
		Start.setVisible(true);

		
		
		
	}
}
