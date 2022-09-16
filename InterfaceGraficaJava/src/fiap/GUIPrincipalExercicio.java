package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIPrincipalExercicio extends JFrame{
	private Container contentPane;
	private JMenuBar menuBar;
	private JMenu menuArquivo, menuCores, menuJanelas;
	private JMenuItem menuItemSair, menuItemSobre, menuItemAzul, menuItemVerde, menuItemCinza, menuItemCiano, menuItemClientes;
	
	public GUIPrincipalExercicio() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setTitle("Janela Principal");
		setBounds(0,0,800,600);
		contentPane = getContentPane();
		
		menuBar = new JMenuBar();
		menuArquivo = new JMenu("Arquivo");
		menuArquivo.setMnemonic('A');
		menuCores = new JMenu("Cores");
		menuCores.setMnemonic('C');
		menuJanelas = new JMenu("Janelas");
		menuJanelas.setMnemonic('J');
		menuItemSair = new JMenuItem("Sair", new ImageIcon(getClass().getResource("exit_icon.png")));
		menuItemSobre = new JMenuItem("Sobre");
		menuItemAzul = new JMenuItem("Azul");
		menuItemVerde = new JMenuItem("Verde");
		menuItemCinza = new JMenuItem("Cinza");
		menuItemCiano = new JMenuItem("Ciano");
		menuItemClientes = new JMenuItem("Clientes");
		setJMenuBar(menuBar);
		menuBar.add(menuArquivo);
		menuBar.add(menuCores);
		menuBar.add(menuJanelas);
		menuArquivo.add(menuItemSobre);
		menuArquivo.add(menuItemSair);
		menuCores.add(menuItemAzul);
		menuCores.add(menuItemVerde);
		menuCores.add(menuItemCinza);
		menuCores.add(menuItemCiano);
		menuJanelas.add(menuItemClientes);
	}
	
	private void definirEventos() {
		menuItemSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Olá! Seja bem Vindo!");
			}
		});
		
		menuItemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		menuItemAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIAzul azul = new GUIAzul();
				contentPane.removeAll();
				contentPane.add(azul);
				contentPane.validate();
			}
		});
		
		menuItemVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIVerde verde = new GUIVerde();
				contentPane.removeAll();
				contentPane.add(verde);
				contentPane.validate();
			}
		});
		
		menuItemCinza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUICinza cinza = new GUICinza();
				contentPane.removeAll();
				contentPane.add(cinza);
				contentPane.validate();
			}
		});
		
		menuItemCiano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUICiano ciano = new GUICiano();
				contentPane.removeAll();
				contentPane.add(ciano);
				contentPane.validate();
			}
		});
		
		menuItemClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUICliente cliente = new GUICliente();
				contentPane.removeAll();
				contentPane.add(cliente);
				contentPane.validate();
			}
		});
	}
}
