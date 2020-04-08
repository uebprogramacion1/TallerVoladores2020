package co.edu.unbosque.view;
import javax.swing.*;
import java.awt.*;

public class PanelTextField extends JPanel{

	private static final long serialVersionUID = 1L;
	private JTextField texto = new JTextField();
	
	
	
	public PanelTextField() {
		try {
			cargar();
			addComponentes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void cargar() throws Exception {
		setLayout(new GridLayout(1,0));
		texto.setBackground(Color.BLACK);
		texto.setForeground(new Color(255, 255, 255));
		texto.setFont(new Font("",Font.BOLD,30));
	    texto.setHorizontalAlignment(JTextField.CENTER);
		
	}
	
	public void addComponentes() {
		add(texto);
		
	}

	public JTextField getTexto() {
		return texto;
	}

	public void setTexto(JTextField texto) {
		this.texto = texto;
	}
	
    
	
}
