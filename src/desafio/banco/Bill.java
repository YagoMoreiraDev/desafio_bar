package desafio.banco;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	
	public double cover(double valorConsumo) {
		if (valorConsumo > 30) {
			return 0.0;
		}else {
			return 4.0;
		}
		
	}
	
	public double  feeding() {
		double consumoFinal;
		this.softDrink *= 5;
		this.beer *= 3;
		this.barbecue *= 7;
		
		return consumoFinal = this.softDrink + this.beer + this.barbecue;
	}
	
	public double ticket () {
		double valor;
		if (this.gender == 'F') {
			return valor = 8.0;
		}else {
			return valor = 10.0;
		}
	}
	
	public double total(double valor, double valor1) { 
		return  valor + valor1 + ticket();
	}
}
