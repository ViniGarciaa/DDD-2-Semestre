package Ex04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<PessoaFísica> pessoaFísicaList = new ArrayList<>();
		ArrayList<PessoaJurídica> pessoaJurídicaList = new ArrayList<>();
		
		int option;
		
		int id;
		String name;
		int cnpj;
		int cpf;
		int confirmar;
	
		
		do {
			
	        System.out.printf("CADASTRO DE USUÁRIO \n" +
	                "Escolha uma opção:\n\n" +
	                "1) Pessoa Física\n" +
	                "2) Pessoa Jurídica\n" +
	                "3) Sair\n\n");
	        System.out.printf("Digite a opção desejada => ");
	        
	        option = ler.nextInt();
	        
	        
	        if (option == 1) {
	        	
	        	
	        	
	        	do {
	        		
		        	PessoaFísica pf = new PessoaFísica();
			        
		        	
		            id = pessoaFísicaList.size() + 1;
	                pf.setId(id);
		        	
		            System.out.printf("Digite o nome => ");
	                name = ler.next();
	                pf.setName(name);

	                System.out.printf("Digite o CPF => ");
	                cpf = ler.nextInt();
	                pf.setCpf(cpf);

	                
	                System.out.printf("As informações estão corretas?\n\n" +
	    					"0 - REINICIAR\n" +
	    					"1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");
	    
	                confirmar = ler.nextInt();
	                
	                pessoaFísicaList.add(pf);
	                
	                System.out.printf("Pessoa Física cadastrada");
	                System.in.read();
	                
	                
	        		
	        	} while (confirmar != 1);

	        	
	        } else if (option == 2) {
	        	
	        	do {
	        		
		        	PessoaJurídica pj = new PessoaJurídica();
			        
		        	
		            id = pessoaJurídicaList.size() + 1;
	                pj.setId(id);
		        	
		            System.out.printf("Digite o nome => ");
	                name = ler.next();
	                pj.setName(name);

	                System.out.printf("Digite o CNPJ => ");
	                cnpj = ler.nextInt();
	                pj.setCnpj(cnpj);

	                
	                System.out.printf("As informações estão corretas?\n\n" +
	    					"0 - REINICIAR\n" +
	    					"1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");
	    
	                confirmar = ler.nextInt();
	                
	                pessoaJurídicaList.add(pj);
	                
	                System.out.printf("Pessoa Jurídica cadastrada");
	                System.in.read();
	                
	              
	        	} while (confirmar != 1);
	        		        	
	        }
		
		} while (option != 0);
		
		ler.close();
	}	
}