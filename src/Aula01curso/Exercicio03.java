package curso;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	 public static void main(String[] args) {
	  
	  Locale.setDefault(Locale.US);
	  Scanner scan = new Scanner(System.in);
	  double largura =0;
	  double comprimento =0;
	  double valorMetroQuad = 0;
	  double tamanhoArea =0;
	  double area =0;
	  double preco;
	  
	  System.out.println("Entre com a largura do terreno: ");
	  largura = scan.nextDouble();
	  
	  System.out.println("Entre com o comprimento do terreno: ");
	  comprimento = scan.nextDouble();
	  
	  System.out.println("Entre com o valor do metro quadrado : ");
	  valorMetroQuad = scan.nextDouble();
	  
	  area = largura * comprimento;
	  preco = area * valorMetroQuad;
	  tamanhoArea = largura * comprimento;
	  
	  System.out.printf(" A largura do terreno é : %.1f%n", largura);
	  System.out.printf(" O comprimento do terreno é %.1f%n", comprimento);
	  System.out.printf(" O tamanho da area é: %.2f%n" , tamanhoArea);
	  System.out.printf( " O preço da área é: %.2f%n",preco);
	  
	  scan.close();

	 }

	}

	


