package ocnxmlgen.src;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class start extends JFrame{
	
	private JLabel item1;
	
	public start(){
		super("Overcast Network XML generator");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("Welcome to the unofficial OCN XML generator by Captain_Elliott and Timothee38");
		add(item1);
		
	}
	
	
}
