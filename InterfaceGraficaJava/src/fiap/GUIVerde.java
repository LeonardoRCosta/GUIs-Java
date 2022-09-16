package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIVerde extends JPanel{
	private JLabel lbVerde;
	private JButton btVerde;
	
	public GUIVerde() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setLayout(null);
		lbVerde = new JLabel("Cor de fundo verde");
		lbVerde.setBounds(50, 10, 150, 25);
		btVerde = new JButton("Verde");
		btVerde.setBounds(50, 40, 140, 40);
		btVerde.setToolTipText("Clique para mudar a cor de fundo para verde");
		
		add(lbVerde);
		add(btVerde);
	}
	
	private void definirEventos() {
		btVerde.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.green);
			}
		});
	}

}
