package cofrinho;

class Real extends Moeda{
	
	public Real(double valor) {
		super(valor);
	}
	
	public void info() {
		System.out.println("Real: R$ " + valor);
	}
	
	public double conversaoParaReal() {
		return valor;
	}

}
