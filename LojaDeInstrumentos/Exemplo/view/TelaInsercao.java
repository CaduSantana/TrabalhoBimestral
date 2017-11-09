package view;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaInsercao extends JFrame {

	JTextField nome;
	JTextField telefone;

	public void criaTela(String nome) {
		this.setTitle(nome);
		this.setLayout(new GridLayout(2, 1));
		this.add(criaPainelDados());
		this.add(criaPainelBotoes());
		this.setBounds(200, 400, 300, 150);
		this.setDefaultCloseOperation(3);
		this.setVisible(true);
	}

	private Component criaPainelBotoes() {
		JButton salvar = new JButton("Salvar");
		JButton listar = new JButton("Listar");
		listar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TelaTabela tt = new TelaTabela();
				tt.criaTela("Contatos");

			}
		});

		JPanel painel = new JPanel(new FlowLayout());
		painel.add(salvar);
		painel.add(listar);

		return painel;
	}

	private Component criaPainelDados() {
		JLabel n = new JLabel("Nome: ");
		nome = new JTextField(15);
		JLabel t = new JLabel("Telefone: ");
		telefone = new JTextField(15);

		JPanel painel = new JPanel(new GridLayout(2, 2));
		painel.add(n);
		painel.add(nome);
		painel.add(t);
		painel.add(telefone);
		return painel;

	}

}
