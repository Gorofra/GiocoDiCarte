package giocodicarte1;

//CLASSE FISICA VAMPIRO
public class Vampiro extends Personaggio implements Mostro {

	{
		this.setForza(15);
	}
	public Vampiro(String nome) {
		super(nome);
	}

	@Override
	public int azzanna() {
		return 2;
	}
	@Override
	public int attacca() {
		return this.azzanna();
	}

}
