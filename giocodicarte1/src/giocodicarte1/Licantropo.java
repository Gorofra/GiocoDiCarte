package giocodicarte1;

public class Licantropo extends Personaggio implements Mostro, Umano {
	//CLASSE FISICA LICANTROPO
	private static boolean lunaPiena;
	
	static {
		lunaPiena=false;
	}
	public Licantropo(String nome) {
		super(nome);
		if(isLunaPiena()) {
			this.setForza(15);
		}
		else {
			this.setForza(10);
		}
	}
	@Override
	public int combatte() {
		return 3;
	}

	@Override
	public int azzanna() {
		return 2;
	}
	//METODO CHE UNISCE AZZANNA E COMBATTE A SECONDA DELLA LUNA PIENA
	@Override
	public int attacca() {
		if(Licantropo.isLunaPiena()) {
			return this.azzanna();
		}
		else {
			return this.combatte();
		}
	}

	public static boolean isLunaPiena() {
		return lunaPiena;
	}

	public static void setLunaPiena(boolean lunaPiena) {
		Licantropo.lunaPiena = lunaPiena;
	}

}
