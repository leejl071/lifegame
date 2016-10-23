package LifeGame;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class windows extends JFrame{
	private final gameMap gamemap;
	public windows(int row,int col)
	{
		gamemap=new gameMap(row,col);
		new Thread(gamemap).start(); 
		add(gamemap);//add thread
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graphics g = null;
		windows window=new windows(50,60);
		
        JMenuBar menu = new JMenuBar();
        JMenu options = new JMenu("Options");
        JMenuItem arrow = options.add("Figure1");
        JMenuItem square = options.add("Figure2");
        window.setJMenuBar(menu);
        menu.add(options);
        arrow.addActionListener(window.new Figure1ActionListener());
        square.addActionListener(window.new Figure2ActionListener());
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(1200, 1000);
        window.setTitle("the life's game");
        window.setVisible(true);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
    }	
	
	  class Figure1ActionListener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		gamemap.setFigure1();
	    	}
	    }
	    
	    class Figure2ActionListener implements ActionListener
	    {
	    	public void actionPerformed(ActionEvent e) 
	    	{
	    		gamemap.setFigure2();
	    	}
	    }
    
	}


