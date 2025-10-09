package meujogo.Modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;


import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase<Extends, timer> extends JPanel implements ActionListener{

	private static final String TecladoAdapter = null;
	private Image fundo;
	private Player player;
	private Timer timer;
	
	public Fase() {
		
		setFocusable(true);
		setDoubleBuffered(true);
		
		ImageIcon referencia = new ImageIcon("res\\blackground.pnj");
		fundo = referencia.getImage();
		
		 player = new Player();
		 player.load();
		 
		 addKeyListener(new TecladoAdapter());
		 
		 timer = new Timer(5, this);
		  timer.start();
	}
	public void paint (Graphics g) {
		Graphics2D  grafico = (Graphics2D)g;
		grafico.drawImage(fundo, 0, 0, null);
		ImageObserver paintingChild = null;
		grafico.drawImage(player.getImage(), player.getx(), player.gety(), paintingChild);
		g.dispose();
	}
	private int getimagem() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		player.update();
		repaint();
			
		}
	
	private class TecladoAdapter extends KeyAdapter {
		public void keyPresse(KeyEvent e) {
			player.keyPressed(e);
			
		}
		public void keyRelased(KeyEvent e) {
			player.KeyRelease(e);
	}
	
	}
}


