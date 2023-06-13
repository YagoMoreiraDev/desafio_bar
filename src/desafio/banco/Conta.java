package desafio.banco;
import java.util.Locale;
import java.util.Scanner;

public class Conta {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bill cliente = new Bill();
		
		System.out.print("Sexo: (F/M)");
		cliente.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		cliente.softDrink = sc.nextInt();
	    System.out.print("Quantidade de refrigerantes: ");
	    cliente.beer = sc.nextInt();
	    System.out.print("Quantidade de espetinhos: ");
	    cliente.barbecue = sc.nextInt();
	    
	    double consumoFinal = cliente.feeding();
	    
	    System.out.println("Relátorio:");
	    System.out.println("Consumo = R$ "+ consumoFinal );
	    
	    double couvertFinal = cliente.cover(consumoFinal);
	    
	    if(consumoFinal > 30) {
	    	System.out.println("Isento Couvert");
	    }else {
	    	System.out.println("Couvert = R$ "+couvertFinal);
	    }
	    System.out.println("Ingresso = R$ "+ cliente.ticket());
	    
	    System.out.println("Valor total a pagar é = R$ "+cliente.total(couvertFinal, consumoFinal));
	    
	    
		sc.close();
	}
	
	
}
