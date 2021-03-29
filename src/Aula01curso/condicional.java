package Aula01curso;

import java.util.Scanner;

public class condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double time = sc.nextDouble();

		if (time < 12) {
			System.out.println("Good morning ");
		} else if (time <= 12 && time < 18)
			;
		{
			System.out.println("Good afternoon");
		}
		if (time >= 18) {
			System.out.println("good everning");
		}
		sc.close();
	}

}
