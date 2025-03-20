package cofrinho;

class Dolar extends Moeda {
	
	
	public Dolar(double valor) {
		super(valor);
	}
	
	public void info() {
		System.out.println("Dólar: US$ " + valor);
	}
	
	//pegando o valor do dolar atual 20/03/2025
	public double conversaoParaReal() {
		return valor * 5.67;
	}
	
}
