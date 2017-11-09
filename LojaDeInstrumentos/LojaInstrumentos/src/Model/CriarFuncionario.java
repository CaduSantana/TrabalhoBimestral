package Model;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CriarFuncionario extends JFrame implements Funcoes{
	JTextField senha;
	JTextField cSenha;
	public void criarTela() {
		
		this.setTitle("LojaDeInstrumentos-Cadastrar Funcionario");
		this.setLayout(new GridLayout(2, 1));
		this.add(criarInsereDados());
		this.add(criarBotoesEscolha());
		this.setBounds(500, 500, 200, 300);
		this.setDefaultCloseOperation(3);
		this.setVisible(true);

	}

	private Component criarInsereDados() {
		JLabel l=new JLabel("Login: ");
		JTextField login = new JTextField(15);
		//Senha
		JLabel s=new JLabel("Senha: ");
		senha = new JTextField(15);
		JLabel comfirmS=new JLabel("Confirma Senha: ");
		cSenha= new JTextField(15);
		//Senha
		JPanel painel = new JPanel(new FlowLayout());
		painel.add(l);
		painel.add(login);
		painel.add(s);
		painel.add(senha);
		painel.add(comfirmS);
		painel.add(cSenha);
		return painel;
	}
	
	private Component criarBotoesEscolha() {
		JButton confirma=new JButton("Confirmar");
		JPanel painel = new JPanel(new FlowLayout());
		painel.add(confirma);
		funcaoDosBotoes(confirma,null,null);
		return painel;
	}

	@Override
	public void funcaoDosBotoes(JButton a, JButton b, JButton c) {
		a.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					//TODO Salvar no Banco de Dados
				TelaInsercaoFuncionario tela=new TelaInsercaoFuncionario();
				tela.criarTela();
				
			}		
		});
		
	}
}
