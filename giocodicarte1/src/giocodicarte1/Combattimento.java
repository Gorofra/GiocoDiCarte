package giocodicarte1;
import java.util.*;

public class Combattimento {

	public static String Combat(Personaggio p1, Personaggio p2) {
		Random random=new Random();
		int r1=random.nextInt(0, 10);
		Personaggio vincente3=(r1>5)? p1:p2;
		if(vincente3==p1) {
			p1.setForza(p1.getForza()+p2.attacca());
			p2.setForza(p2.getForza()-p2.attacca());
			
			
			return "vince "+p1.getNome()+" forza "+p1.getNome()+" "+ p1.getForza()+" forza "+p2.getNome()+" "+ p2.getForza()+".";
		}
		else {
			p2.setForza(p2.getForza()+p1.attacca());
			p1.setForza(p1.getForza()-p1.attacca());
			
			
			return "vince "+p2.getNome()+" forza "+p2.getNome()+" "+ p2.getForza()+" forza "+p1.getNome()+" "+ p1.getForza()+".";
		}
	}
}
