package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUICiano extends JPanel{
	private JLabel lbCiano;
	private JButton btCiano;
	
	public GUICiano() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setLayout(null);
		lbCiano = new JLabel("Cor de fundo ciano");
		lbCiano.setBounds(50, 10, 150, 25);
		btCiano = new JButton("Ciano");
		btCiano.setBounds(50, 40, 140, 40);
		btCiano.setToolTipText("Clique para mudar a cor de fundo para ciano");
		
		add(lbCiano);
		add(btCiano);
	}
	
	private void definirEventos() {
		btCiano.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.cyan);
			}
		});
	}

}
