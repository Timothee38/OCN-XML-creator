package ocnxmlgen.src;
import javax.swing.JButton;
import javax.swing.JFrame;

public class main {
	public static void main(String[] args) {
		
		start Start = new start();
		Start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Start.setSize(500,180);
		Start.setVisible(true);
		Start.add(new JButton("Start"));
		
		
		
	}
}
