import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;


public class MainFrame
{
	


public MainFrame()
{
	
}

public static void main(String[] args)
{
	
	
//	JPanel panny = new JPanel(new BorderLayout());
	CardTable tabby = new CardTable();
	/////
	JFrame frame = new JFrame("CARDS BABY");
	JTextArea textPanel = new JTextArea("the best card game on the planet");
	textPanel.
	textPanel.setEditable(false);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(tabby, BorderLayout.CENTER);
	frame.getContentPane().add(textPanel, BorderLayout.NORTH);
	frame.setSize(800, 576);
	frame.setVisible(true);
	/////
	System.out.println(tabby.getCardFromDeck(2).getSymbol());
	
	
}



}
