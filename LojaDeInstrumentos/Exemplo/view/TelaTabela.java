package view;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TelaTabela extends JFrame {
	
	public void criaTela(String titulo){
		this.setTitle(titulo);
		this.setLayout(new GridLayout(2,1));
		this.add(criaPainelTabela());
		this.add(criaPainelBotoes());
		this.setBounds(100, 20, 500, 500);
		this.setDefaultCloseOperation(3);
		this.setVisible(true);
		
	}

	private Component criaPainelTabela() {
		String[] cabecalho = {"Nome","Telefone"};
		String[][] dados = {
				{"Ana","2345678"},
				{"Iudi Tamashiro","40028922"}
		};
		JTable tabela = new JTable(dados, cabecalho);
		JScrollPane painel = new JScrollPane(tabela);
		return painel;
	}
	
	private Component criaPainelBotoes() {
		JButton voltar = new JButton("Voltar");
		JPanel painel = new JPanel(new FlowLayout());
		painel.add(voltar);
		return painel;
	}


}
