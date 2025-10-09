package meujogo.Modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {

	private int x, y;
	private  int dx, dy;
	private Image Imagem;
	private int largura, altura;
	
	public Player() {
		this.x=100;
		this.y=100;
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon("res\\");
		Imagem = referencia.getImage();
		altura = Imagem.getHeight(null);
		largura = Imagem.getWidth(null);
	}
	
	public void update() {
		x += dx;
		y += dy;
	}
	
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		if(codigo == KeyEvent.VK_UP ) {
			dy=-3;
		}
	if(codigo == KeyEvent.VK_DOWN) {
		dy=3;
	}
	if(codigo == KeyEvent.VK_LEFT ) {	
		dx=-3;
	}
    if(codigo == KeyEvent.VK_RIGHT ) {
	dy=3;
}
	}


public void KeyRelease(KeyEvent tecla) {
	int codigo = tecla.getKeyCode();
	if(codigo == KeyEvent.VK_UP ) {
		dy=0;
	}
   if(codigo == KeyEvent.VK_DOWN) {
	dy=0;
}
  if(codigo == KeyEvent.VK_LEFT ) {	
   dx=0;	
}
  if(codigo == KeyEvent.VK_RIGHT ) {
   dy=0;
}
}
}
