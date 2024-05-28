package giocodicarte1;

//CLASSE FISICA EROE
public class Eroe extends Personaggio implements Umano {

	{
		this.setForza(10);
	}
	public Eroe(String nome) {
		super(nome);
	}

	@Override
	public int combatte() {
		return 3;
	}
	@Override
	public int attacca() {
		return this.combatte();
	}

}
