package snakegame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main 
{

	public Main()
	{
		
		JOptionPane.showMessageDialog(null, "Welcome To Oles' Snake Game");
		JFrame frame = new JFrame();
		Gamepanel gamepanel = new Gamepanel();
		
		frame.add(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Oles' Snakey Game");
		frame.setLocationRelativeTo(null);
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) 
	{
		new Main();

	}

}
