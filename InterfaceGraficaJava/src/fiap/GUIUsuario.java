package fiap;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class GUIUsuario extends JFrame{
	private JLabel lbNome, lbEndereco, lbNumero, lbBairro, lbCidade;
	private JTextField tfNome, tfEndereco, tfNumero, tfBairro, tfCidade;
	private JButton btSalvar, btCancelar;
	
	public GUIUsuario() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setTitle("Cadastro de Cliente");
		setBounds(0,0,400,300);
		setLayout(null);
		
		// criando objetos para o formulário
		lbNome = new JLabel("Nome:");
		lbEndereco = new JLabel("Endereço:");
		lbNumero = new JLabel("Número:");
		lbBairro = new JLabel("Bairro:");
		lbCidade = new JLabel("Cidade: ");
		tfNome = new JTextField();
		tfEndereco= new JTextField();
		tfNumero= new JTextField();
		tfBairro= new JTextField();
		tfCidade = new JTextField();
		btSalvar = new JButton("Salvar");
		btCancelar = new JButton("Cancelar");
		
		// definindo tamanho e posição dos objetos
		lbNome.setBounds(35,20,80,25);
		tfNome.setBounds(85,20,180,25);
		lbEndereco.setBounds(14,70,80,25);
		tfEndereco.setBounds(85,70,280,25);
		lbNumero.setBounds(23,120,80,25);
		tfNumero.setBounds(85,120,40,25);
		lbBairro.setBounds(135,120,80,25);
		tfBairro.setBounds(185,120,180,25);
		lbCidade.setBounds(27,170,80,25);
		tfCidade.setBounds(85,170,180,25);
		btSalvar.setBounds(80,220,100,25);
		btCancelar.setBounds(185,220,100,25);
		
		// adicionando os objetos ao formulário
		add(lbNome);
		add(tfNome);
		add(lbEndereco);
		add(tfEndereco);
		add(lbNumero);
		add(tfNumero);
		add(lbBairro);
		add(tfBairro);
		add(lbCidade);
		add(tfCidade);
		add(btSalvar);
		add(btCancelar);
	}
	
	private void definirEventos() {
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
			}
		});
	}
}
