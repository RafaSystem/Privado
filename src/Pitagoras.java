import java.util.Scanner;

public class Pitagoras {
	public Pitagoras(){
		int cA = (new Scanner(System.in)).nextInt();
		int cB = (new Scanner(System.in)).nextInt();
	    
		double h = Math.sqrt((cA*cA) + (cB+cB));
		System.out.println("O resultado é: "+h);
		
		new Pitagoras();
	}
}
