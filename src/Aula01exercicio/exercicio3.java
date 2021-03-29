package exerciciosinicio;
import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int A,B,C,D, Difernca;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		Difernca = A*B - C*D;
		
		System.out.println("Diferença = " + Difernca);
		
		sc.close();
	}

}
