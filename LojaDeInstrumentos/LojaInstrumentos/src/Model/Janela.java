package Model;

import javax.swing.JFrame;
import javax.swing.JPanel;

public interface Janela {

	public static void main(String[] args) {
			JPanel painel=new JPanel();
			JFrame janela=new JFrame("Loja De Instrumentos");
			janela.setSize(300,200);
			janela.add(painel);
			janela.setVisible(true);		
	}

}
