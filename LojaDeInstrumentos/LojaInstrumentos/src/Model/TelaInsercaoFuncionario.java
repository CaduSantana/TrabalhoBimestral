package Model;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaInsercaoFuncionario extends JFrame implements Funcoes {
	static JPanel painel = new JPanel(new FlowLayout());
	private static final AbstractButton RegisterFunc = null;

	public void criarTela() {

		this.setTitle("LojaDeInstrumentos");
		this.setLayout(new GridLayout(2, 1));
		this.add(criarInsereDados());
		this.add(criarBotoesEscolha());
		this.setBounds(500, 500, 200, 450);
		this.setDefaultCloseOperation(3);
		this.setVisible(true);

	}

	private Component criarInsereDados() {
		JLabel l = new JLabel("Login: ");
		JTextField login = new JTextField(15);
		JLabel s = new JLabel("Senha: ");
		JTextField senha = new JTextField(15);
		painel.add(l);
		painel.add(login);
		painel.add(s);
		painel.add(senha);
		return painel;
	}

	private Component criarBotoesEscolha() {
		JButton Confirmar= new JButton("Confirmar");
		JButton RegisterFunc = new JButton("Registrar Funcionarios");
		funcaoDosBotoes(RegisterFunc, Confirmar,null);
		painel.add(Confirmar);
		painel.add(RegisterFunc);

		return painel;
	}

	@Override
	public void funcaoDosBotoes(JButton a, JButton b, JButton c) {
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			CriarFuncionario cria = new CriarFuncionario();
			cria.criarTela();
			}
		});
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeladodoFuncionario func= new TeladodoFuncionario();
				func.criarTela();
			}
		});
	}
}