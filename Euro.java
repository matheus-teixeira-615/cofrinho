package cofrinho;

class Euro extends Moeda{
	
	public Euro (double valor) {
		super (valor);
	}
	
	public void info() {
		System.out.println("Euro: € " + valor);
	}
	
	//pegando o valor do euro atual 20/03/2025
	public double conversaoParaReal() {
		return valor * 6.45;
	}

}
