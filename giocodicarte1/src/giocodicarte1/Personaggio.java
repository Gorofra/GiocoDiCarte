package giocodicarte1;
//CLASSE ASTRATTA PRINCIPALE
public abstract class Personaggio {
	private int forza;
	private String nome;
	protected Personaggio(String nome) {
		this.setNome(nome);
	}
	public void setForza(int forza) {
		if(forza>=0) {
			this.forza=forza;
		}
		else {
			forza=0; 
		}
	}
	public int getForza() {
		return this.forza;
	}
	public int attacca() {
		return 0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
