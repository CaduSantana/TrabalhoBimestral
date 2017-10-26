package Model;
//Imports
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InterfaceDoFuncionario implements  Janela{
	
	
	static Scanner tec = new Scanner(System.in);
	static ArrayList funcionarios = new ArrayList();
	private static int funcionarioID = 0;

	public static void main(String[] args) {
		//TelaInicial
		// TODO Substituir O system out pelo JOPTION
		int escolha = 1;
		
		JOptionPane.showMessageDialog(painel,"Olá Bem Vindo :3 \n");
		JOptionPane.showMessageDialog(painel,"Oque Deseja Fazer?  \n");
		//Tela De Seleção
		while (escolha != 0) {

			System.out.println("Selecione umas das opções \n" + "1) Registrar Funcionario \n" + "0)Sair");
			
			//a variavel escolah vai decidir qual matodo vai utilizar
			escolha = tec.nextInt();
			switch (escolha) {
			case 1:
				registraFun(painel);
				break;
			}
		}
	}

	public void removePro() {
		//TODO removerPro
	}

	public void alteraPreco() {
		//TODO alteraPreco
	}

	public static void registraFun(JPanel painel) {
		//Preenche o formulario
		JOptionPane.showInputDialog(painel,"Nome do Funcionario :");
		String nome = tec.next();

		JOptionPane.showInputDialog(painel,"RG Do Funcionario :");
		int RG = tec.nextInt();

		JOptionPane.showInputDialog(painel,"Salario do Funcionario :");
		double salario = tec.nextDouble();
		
		//pede para o metodo geraFuncionarioId gerar um id para o funcionario
		geraFuncionarioID(painel);
		//Funcionario vai receber os dados para que ele seja adicionado em funcionarios(ArrayList)
		Funcionario funcionario = new Funcionario(nome, funcionarioID, RG, salario);
		funcionarios.add(funcionario);

	}

	public static int geraFuncionarioID(JPanel painel) {
		//caso funcionarios esteja vazio ele recebera obrigatoriamente funcionarioID=1
		if (funcionarios == null || funcionarios.size() == 0 || funcionarioID<1) {
			funcionarioID = 0;
			JOptionPane.showMessageDialog(painel,"Seu ID é 0");
		} else {
			//caso funcionarios já tenha algo ...
			for (int i = 1; i < funcionarios.size(); i++) {
				funcionarioID += 1;
			}
			JOptionPane.showMessageDialog(painel,"Seu ID é " + funcionarioID);
		}
		//retorna funcionario
		return funcionarioID;

	}
}
