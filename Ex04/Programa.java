package Ex04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<PessoaF�sica> pessoaF�sicaList = new ArrayList<>();
		ArrayList<PessoaJur�dica> pessoaJur�dicaList = new ArrayList<>();
		
		int option;
		
		int id;
		String name;
		int cnpj;
		int cpf;
		int confirmar;
	
		
		do {
			
	        System.out.printf("CADASTRO DE USU�RIO \n" +
	                "Escolha uma op��o:\n\n" +
	                "1) Pessoa F�sica\n" +
	                "2) Pessoa Jur�dica\n" +
	                "3) Sair\n\n");
	        System.out.printf("Digite a op��o desejada => ");
	        
	        option = ler.nextInt();
	        
	        
	        if (option == 1) {
	        	
	        	
	        	
	        	do {
	        		
		        	PessoaF�sica pf = new PessoaF�sica();
			        
		        	
		            id = pessoaF�sicaList.size() + 1;
	                pf.setId(id);
		        	
		            System.out.printf("Digite o nome => ");
	                name = ler.next();
	                pf.setName(name);

	                System.out.printf("Digite o CPF => ");
	                cpf = ler.nextInt();
	                pf.setCpf(cpf);

	                
	                System.out.printf("As informa��es est�o corretas?\n\n" +
	    					"0 - REINICIAR\n" +
	    					"1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");
	    
	                confirmar = ler.nextInt();
	                
	                pessoaF�sicaList.add(pf);
	                
	                System.out.printf("Pessoa F�sica cadastrada");
	                System.in.read();
	                
	                
	        		
	        	} while (confirmar != 1);

	        	
	        } else if (option == 2) {
	        	
	        	do {
	        		
		        	PessoaJur�dica pj = new PessoaJur�dica();
			        
		        	
		            id = pessoaJur�dicaList.size() + 1;
	                pj.setId(id);
		        	
		            System.out.printf("Digite o nome => ");
	                name = ler.next();
	                pj.setName(name);

	                System.out.printf("Digite o CNPJ => ");
	                cnpj = ler.nextInt();
	                pj.setCnpj(cnpj);

	                
	                System.out.printf("As informa��es est�o corretas?\n\n" +
	    					"0 - REINICIAR\n" +
	    					"1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");
	    
	                confirmar = ler.nextInt();
	                
	                pessoaJur�dicaList.add(pj);
	                
	                System.out.printf("Pessoa Jur�dica cadastrada");
	                System.in.read();
	                
	              
	        	} while (confirmar != 1);
	        		        	
	        }
		
		} while (option != 0);
		
		ler.close();
	}	
}