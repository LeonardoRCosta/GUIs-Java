package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUICinza extends JPanel{
	private JLabel lbCinza;
	private JButton btCinza;
	
	public GUICinza() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setLayout(null);
		lbCinza = new JLabel("Cor de fundo cinza");
		lbCinza.setBounds(50, 10, 150, 25);
		btCinza = new JButton("Cinza");
		btCinza.setBounds(50, 40, 140, 40);
		btCinza.setToolTipText("Clique para mudar a cor de fundo para cinza");
		
		add(lbCinza);
		add(btCinza);
	}
	
	private void definirEventos() {
		btCinza.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.gray);
			}
		});
	}

}
