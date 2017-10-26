package Model;

public class Funcionario {
	
	private String nome;
	private int registroID;
	private int RG;
	private Double salario;
	
	public Funcionario(String nome, int registroID, int rG, double salario) {
		super();
		this.nome = nome;
		this.registroID = registroID;
		RG = rG;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRegistroID() {
		return registroID;
	}
	public void setRegistroID(int registroID) {
		this.registroID = registroID;
	}
	public int getRG() {
		return RG;
	}
	public void setRG(int rG) {
		RG = rG;
	}
	public	double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}