package testes;
import java.util.Scanner;

	public class exer01  {
	public static void main(String[] args) {
		
	String nomeFuncionario;
	double salBruto, salLiquido, horasTrab, valorHTrab;
	double inss = 1.10;

	Scanner sc = new Scanner(System.in);

	System.out.println("Programa:::");
	System.out.println("Calcula Sal�rio Bruto e Sal�rio L�quido");
	System.out.print("\nEntre com o nome do Funcion�rio: ");
	nomeFuncionario = sc.nextLine();

	System.out.print("Informe a Quantidade de horas Trabalhadas: ");
	horasTrab = sc.nextDouble();

	System.out.print("Informe o valor das horas Trabalhadas: R$ ");
	valorHTrab = sc.nextDouble();

	salBruto = (horasTrab * valorHTrab);
	salLiquido = (salBruto - inss);
	System.out.println("\n\n:::: Exibi��o dos dados informados ::::::::::");
	System.out.println("Nome: "+nomeFuncionario);
	System.out.printf("Sal�rio Bruto: R$ %.2f", salBruto);
	System.out.printf("\nSal�rio Liquido: R$ %.2f", salLiquido);
	System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::");

	System.out.println("Fim do Programa!!!");
	sc.close();
}
}