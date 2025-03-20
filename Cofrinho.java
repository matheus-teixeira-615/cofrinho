package cofrinho;
import java.util.ArrayList;

public class Cofrinho {
	
	//array e suas modificações
	private ArrayList<Moeda> valores = new ArrayList<>();
	
	public void addMoeda(Moeda moeda) {
		valores.add(moeda);
		System.out.println("");
		System.out.println("Moeda adicionada amigo ;)");
		System.out.println("--------------------------------------------------");
		System.out.println("");
	}
	
	public void removerMoeda (Moeda moeda) {
		if (valores.remove(moeda)) {
			System.out.println("");
			System.out.println("Moeda desfragmentada com sucesso.");
			System.out.println("--------------------------------------------------");
			System.out.println("");
		}
		else {
			System.out.println("");
			System.out.println("Moeda não encontrada,tente de novo.");
			System.out.println("--------------------------------------------------");
			System.out.println("");
		}
	}
	
	public void listarMoeda() {
		System.out.println("Moedas no cofrinho: ");
		for (Moeda moeda : valores) {
			moeda.info();
		}

	}
	
	public void calcularTotal() {
		double total = 0;
		for (Moeda moeda : valores) {
			total += moeda.conversaoParaReal();
		}
		System.out.println("Total do seu cofrinho em Reais: R$ " + total);
	}
	
}
