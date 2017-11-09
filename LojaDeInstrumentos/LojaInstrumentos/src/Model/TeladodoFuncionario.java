package Model;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TeladodoFuncionario extends JFrame implements Model.Funcoes {
	public void criarTela() {
		this.setTitle("LojaDeInstrumentos-Tela Do Funcionario");
		this.setLayout(new GridLayout(2, 1));
		this.add(criarBotoesEscolha());
		this.setBounds(500, 500, 200, 300);
		this.setDefaultCloseOperation(3);
		this.setVisible(true);
	}

	private Component criarBotoesEscolha() {
		JButton RemoveProd = new JButton("Remover Produto");
		JButton alterPreco = new JButton("Alterar Preço");
		//funcaoDosBotoes(RemoveProd,alterPreco,null);
		JPanel painel = new JPanel(new FlowLayout());
		painel.add(RemoveProd);
		painel.add(alterPreco);
		return null;
	}

	@Override
	public void funcaoDosBotoes(JButton a, JButton b, JButton c) {
		// TODO Auto-generated method stub
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//TODO Implementar Produto
			}
		});
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//TODO Implementar Preço
			}
		});
	}
}
