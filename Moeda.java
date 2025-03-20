package cofrinho;

abstract class Moeda {
	 double valor;

	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	
	//comparar os valores moedas, para nao ter erro na hora de excluir algum valor
	public boolean equals(Object obj) {
	    if (this == obj) return true;  
	    if (obj == null || getClass() != obj.getClass()) return false;  

	    Moeda moeda = (Moeda) obj;  
	    return Double.compare(moeda.valor, this.valor) == 0;  
	}
	
	public abstract void info();
	public abstract double conversaoParaReal();
	
}
