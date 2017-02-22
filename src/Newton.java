import java.util.Scanner;

public class Newton {

	public Newton(){
		
		double massa = (new Scanner(System.in)).nextDouble();
		double aceleracao = (new Scanner(System.in)).nextDouble();
		
		System.out.println("A forca e: " + massa*aceleracao);
		
	}
	
}
