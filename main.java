package cofrinho;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		
        System.out.println("Bem vindo(a) ao seu Cofrinho Digital");
        while (true) {
            System.out.println("1- Adicionar moeda");
            System.out.println("2- Remover moeda");
            System.out.println("3- Listar moedas");
            System.out.println("4- Ver total em Reais");
            System.out.println("5- Sair");
            System.out.print("Escolha uma opção: ");
            
            int escolha = scanner.nextInt();
            if (escolha == 1) {
        	
	        	System.out.print("Qual o tipo de moeda? (Real, Dolar, Euro): ");
	        	String tipo = scanner.next();
	        	
	        	System.out.print("Digite o valor: ");
	        	double valor = scanner.nextDouble();
	        	
	        	//usando switch como escolha e fazendo ignorar letras maiusculas ou minusculas.
	        	switch (tipo.toLowerCase()) {
		        	case "real":
		        		cofrinho.addMoeda(new Real(valor));
		        		break;
		        		
		        	case "dolar":
		        		cofrinho.addMoeda(new Dolar(valor));
		        		break;
		        		
		        	case "euro":
		        		cofrinho.addMoeda(new Euro(valor));
		        		break;
		        		
		        	default:
		        		System.out.println("Aconteceu algum erro no processo ><");
			    		System.out.println("--------------------------------------------------");
		       }
            }
        	
	    	else if (escolha == 2) {
	    		
	    		System.out.print("Escolha a moeda para remover (Dolar, Euro, Real): ");
	    		String moedaRemover = scanner.next();
	    		
	    		System.out.print("Digite o valor da moeda a ser removida: ");
	    		double valorRemover = scanner.nextDouble();
	    		
	    		//mesma coisa que o switch, ignorar o tamanho das letras para nao dar erro.
	    		if (moedaRemover.equalsIgnoreCase("Dolar")) {
	    			cofrinho.removerMoeda(new Dolar(valorRemover));
	    		}
	    		else if (moedaRemover.equalsIgnoreCase("Euro")) {
	    			cofrinho.removerMoeda(new Euro(valorRemover));
	    		}
	    		else if (moedaRemover.equalsIgnoreCase("Real")) {
	    			cofrinho.removerMoeda(new Real(valorRemover));
	    		}
	    		else {
	    			System.out.println("Moeda inválida ou não encontrada");
	    		} 
	    	}
	    	else if (escolha == 3) {
	    		cofrinho.listarMoeda();
	    		
	    		//coloquei varios desses traços no codigo para deixar mais legivel.
	    		System.out.println("--------------------------------------------------");
	    	}
	    	else if (escolha == 4) {
	    		cofrinho.calcularTotal();
	    		System.out.println("--------------------------------------------------");
	    	}
	    	else if (escolha == 5) {
	    		System.out.println("Fechando o programa...");
	    		break;
	    	}
	    	else {
	    		
	    		//e alguns espaços tambem.
	    		System.out.println("");
	    		System.out.println("opção invalida !!");
	    		System.out.println("--------------------------------------------------");
	    		System.out.println("");
	    	}

        }  
        scanner.close();
	}      
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
