import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill person = new Bill();
		
		System.out.print("Sexo: ");
		person.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		person.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		person.softDrink = sc.nextInt();		
		System.out.print("Quantidade de espetinhos: ");
		person.barbecue = sc.nextInt();
		System.out.println();
		System.out.println("RELATORIO:");
		System.out.printf("Consumo = R$ %.2f%n", person.feeding());
		
		if (person.feeding() > 30.00) {
			System.out.println("Isento de Couvert");
		}
		else {
			System.out.printf("Couvert = R$ %.2f%n", person.cover());
		}
		
		System.out.printf("Ingresso = R$ %.2f%n", person.ticket());
		System.out.println();
		System.out.printf("Valor a pagar = R$ %.2f%n", person.total());
		
		
		sc.close();

	}

}
