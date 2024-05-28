package giocodicarte1;
import java.util.*;
public class TestGioco1 {


	public static void main(String[] args) {
		Random random=new Random();
		boolean luna=random.nextBoolean();
		Licantropo.setLunaPiena(luna);
		if(Licantropo.isLunaPiena()) {
			System.out.println("La luna piena sale nel cielo.");
		}
		else {
			System.out.println("La luna non si vede stanotte.");
		}
		Eroe eroe=new Eroe("Eroe");
		Vampiro vampiro=new Vampiro("Vampiro");
		Licantropo licantropo=new Licantropo("Licantropo");
		int scelta=1;
		Scanner scan=new Scanner(System.in);
		while(scelta!=0) {
			scelta=1;
				System.out.println("scegli chi far combattere!");
				System.out.println("1 eroe");
				System.out.println("2 licantropo");
				System.out.println("3 vampiro");

				scelta=scan.nextInt();
			switch(scelta) {
			case 1:
				System.out.println("hai selezionato eroe! contro chi deve combattere?");
				System.out.println("1 per licantropo");
				System.out.println("2 per vampiro");
				scelta=scan.nextInt();
				switch(scelta) {
				case 1:
					System.out.println(Combattimento.Combat(eroe, licantropo)); 
					break;
				case 2:
					System.out.println(Combattimento.Combat(eroe, vampiro));
				}
				break;
			case 2:
				System.out.println("hai selezionato licantropo! contro chi deve combattere?");
				System.out.println("1 per eroe");
				System.out.println("2 per vampiro");
				scelta=scan.nextInt();
				switch(scelta) {
				case 1:
					System.out.println(Combattimento.Combat(licantropo, eroe));
					break;
				case 2:
					System.out.println(Combattimento.Combat(licantropo, vampiro));
				}
				break;
			case 3:
				System.out.println("hai selezionato vampiro! contro chi deve combattere?");
				System.out.println("1 per eroe");
				System.out.println("2 per licantropo");
				scelta=scan.nextInt();
				switch(scelta) {
				case 1:
					System.out.println(Combattimento.Combat(vampiro, eroe));
					break;
				case 2:
					System.out.println(Combattimento.Combat(vampiro, licantropo));
				}
				break;
			case 0:
				scelta=0;
			}
				
			System.out.println("forza eroe: "+ eroe.getForza()+" forza vampiro: "+ vampiro.getForza()+" forza licantropo: "+ licantropo.getForza());
			if(eroe.getForza()==0) {
				scelta=0;
			}
			else if(vampiro.getForza()==0) {
				scelta=0;
			}
			else if(licantropo.getForza()==0) {
				scelta=0;
			}
		}
		if(eroe.getForza()>vampiro.getForza()&eroe.getForza()>licantropo.getForza()) {
			System.out.println("il vincitore è eroe con: "+ eroe.getForza()+" forza");
		}
		else if(vampiro.getForza()>eroe.getForza()&vampiro.getForza()>licantropo.getForza()) {
			System.out.println("il vincitore è vampiro con: "+ vampiro.getForza()+" forza.");
		}
		else {
			System.out.println("il vincitore è licantropo con: "+ licantropo.getForza()+" forza.");
		}
		
		
		
		scan.close();
	}
}
