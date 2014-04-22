package me.Captain_Elliott.XMLcreator;


import javax.swing.JFrame;

public class Main {
	
	public static int height = 500;
	public static int width = 250;



	public static void main(String[] args) {

		start start = new start();
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.setSize(height, width);
		start.setVisible(true);

	}
	
	
}
