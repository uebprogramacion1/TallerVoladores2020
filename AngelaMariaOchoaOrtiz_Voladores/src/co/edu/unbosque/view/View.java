package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class View extends JFrame {
	
	private Panel_2 p;
	private Panel_botones b;
	
public View(){
	
	setTitle("Composer");
	getContentPane().setLayout(null);
	setSize(800,550);
	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	getContentPane().setBackground(Color.GRAY);
	
	inicializarComponentes();
	
	setResizable( true );
    setLocationRelativeTo( null );
    setVisible(true);
}

private void inicializarComponentes() {

	p = new Panel_2();
	p.setBounds(12,20,753,450);
	p.setBackground(Color.WHITE);
	add(p);
	
	b = new Panel_botones();
	b.setBounds(12,20,753,450);
	b.setBackground(Color.WHITE);
	add(b);
	

	
}
public void mostrarMensajeSalida (String mensaje) {
	
	p.getSalida1().setText(mensaje);
	
}

public Panel_2 getP() {
	return p;
}

public void setP(Panel_2 p) {
	this.p = p;
}

public Panel_botones getB() {
	return b;
}

public void setB(Panel_botones b) {
	this.b = b;
}


}
