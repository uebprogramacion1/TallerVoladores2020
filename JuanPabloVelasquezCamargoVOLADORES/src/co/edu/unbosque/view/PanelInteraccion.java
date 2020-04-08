package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class PanelInteraccion extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel Titulo;
	private JButton btonHidroavion;
	private JButton btonHelicoptero;
	private JButton btonPajaro;
	private JButton btonSuperman;
	private JButton btonEliminar;

	public PanelInteraccion() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {

		setLayout(null);
		TitledBorder border = BorderFactory.createTitledBorder("Interacción...");
		border.setTitleColor(Color.BLACK);
		setBorder(border);

		Titulo = new JLabel("Informacion sobre:", SwingConstants.CENTER);
		Titulo.setForeground(Color.black);
		Titulo.setFont(new Font("Times New Roman", 1, 32));
		Titulo.setBounds(60, 12, 321, 40);
		add(Titulo);

		btonHidroavion = new JButton("Hidroavión");
		btonHidroavion.setForeground(Color.BLACK);
		btonHidroavion.setBackground(Color.WHITE);
		btonHidroavion.setFont(new Font("Times New Roman", 0, 28));
		btonHidroavion.setBounds(52, 57, 199, 46);
		add(btonHidroavion);

		btonHelicoptero = new JButton("Helicóptero");
		btonHelicoptero.setForeground(Color.BLACK);
		btonHelicoptero.setBackground(Color.WHITE);
		btonHelicoptero.setFont(new Font("Times New Roman", 0, 28));
		btonHelicoptero.setBounds(52, 111, 199, 46);
		add(btonHelicoptero);

		btonPajaro = new JButton("Pájaro");
		btonPajaro.setForeground(Color.BLACK);
		btonPajaro.setBackground(Color.WHITE);
		btonPajaro.setFont(new Font("Times New Roman", 0, 28));
		btonPajaro.setBounds(302, 57, 199, 46);
		add(btonPajaro);

		btonSuperman = new JButton("Superman");
		btonSuperman.setForeground(Color.BLACK);
		btonSuperman.setBackground(Color.WHITE);
		btonSuperman.setFont(new Font("Times New Roman", 0, 28));
		btonSuperman.setBounds(302, 111, 199, 46);
		add(btonSuperman);

		// Crea un icono que referencie a la imagen en disco
		ImageIcon iconoOriginal = new ImageIcon("Imagen\\btonEliminar.png");
		int ancho = 140; // Ancho en pixeles que tendra el icono escalado
		int alto = 200; // Alto (para que conserve la proporcion pasamos -1)
		// Obtiene un icono en escala con las dimensiones especificadas
		ImageIcon iconoEscala = new ImageIcon(
				iconoOriginal.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH));

		btonEliminar = new JButton("LimpiarT");
		btonEliminar.setIcon(iconoEscala);
		btonEliminar.setForeground(Color.BLACK);
		btonEliminar.setBackground(Color.BLACK);
		// btonEliminar.setFont(new Font("Times New Roman", 0, 28));
		btonEliminar.setBounds(541, 57, 70, 100);
		add(btonEliminar);
	}

	public JLabel getTitulo() {
		return Titulo;
	}

	public void setTitulo(JLabel titulo) {
		Titulo = titulo;
	}

	public JButton getBtonHidroavion() {
		return btonHidroavion;
	}

	public void setBtonHidroavion(JButton btonHidroavion) {
		this.btonHidroavion = btonHidroavion;
	}

	public JButton getBtonHelicoptero() {
		return btonHelicoptero;
	}

	public void setBtonHelicoptero(JButton btonHelicoptero) {
		this.btonHelicoptero = btonHelicoptero;
	}

	public JButton getBtonPajaro() {
		return btonPajaro;
	}

	public void setBtonPajaro(JButton btonPajaro) {
		this.btonPajaro = btonPajaro;
	}

	public JButton getBtonSuperman() {
		return btonSuperman;
	}

	public void setBtonSuperman(JButton btonSuperman) {
		this.btonSuperman = btonSuperman;
	}

	public JButton getBtonEliminar() {
		return btonEliminar;
	}

	public void setBtonEliminar(JButton btonEliminar) {
		this.btonEliminar = btonEliminar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
