package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIAzul extends JPanel{
	private JLabel lbAzul;
	private JButton btAzul;
	
	public GUIAzul() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setLayout(null);
		lbAzul = new JLabel("Cor de fundo azul");
		lbAzul.setBounds(50, 10, 150, 25);
		btAzul = new JButton("Azul");
		btAzul.setBounds(50, 40, 140, 40);
		btAzul.setToolTipText("Clique para mudar a cor de fundo para azul");
		
		add(lbAzul);
		add(btAzul);
	}
	
	private void definirEventos() {
		btAzul.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.blue);
			}
		});
	}
}
