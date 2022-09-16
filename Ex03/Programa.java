package Ex03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<ContaSalário> contaSalárioList = new ArrayList<>();
		ArrayList<ContaPoupança> contaPoupançaList = new ArrayList<>();
		ArrayList<ContaCorrente> contaCorrenteList = new ArrayList<>();
		
		int option;
		
        String agencia;
        String numero;
        double saldo;
        int cnpj;

        double rentabilidade;
        double chequeEspecial;

		int confirmar;
	
		
		do {
			
	        System.out.printf("SISTEMA DE CADASTRO DE CONTAS \n" +
	                "Escolha qual tipo de conta você deseja:\n\n" +
	                "1) Conta Poupança\n" +
	                "2) Conta Corrente\n" +
	                "3) Conta Salário\n" +
	                "4) Sair\n\n");
	        System.out.printf("Escolha a opção desejada => ");
	        
	        option = ler.nextInt();
	        
	        
	        if (option == 1) {
	        	
	        
	        	do {
	        		
		        	ContaPoupança cp = new ContaPoupança();
		        	
	                System.out.printf("Digite a agência => ");
	                agencia = ler.next();
	                cp.setAgencia(agencia);

	                System.out.printf("Digite o número => ");
	                numero = ler.next();
	                cp.setNumero(numero);

	                System.out.printf("Digite a quantia de depósito => ");
	                saldo = ler.nextDouble();
	                cp.setSaldo(saldo);

	                System.out.printf("Digite o limite de cheque especial => ");
	                rentabilidade = ler.nextDouble();
	                cp.setRentabilidade(rentabilidade);

	                
	                System.out.printf("As informações estão corretas?\n\n" +
	    					"0 - REINICIAR\n" +
	    					"1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");
	    
	                confirmar = ler.nextInt();
	                
	                contaPoupançaList.add(cp);
	                
	                System.out.printf("Conta Poupança cadastrada");
	                System.in.read();
	                
	        		
	        	} while (confirmar != 1);

	        	
	        } else if (option == 2) {
	        	
	        	do {
	        		
		        	ContaCorrente cc = new ContaCorrente();
			        
	                System.out.printf("Digite a agência => ");
	                agencia = ler.next();
	                cc.setAgencia(agencia);

	                System.out.printf("Digite o número => ");
	                numero = ler.next();
	                cc.setNumero(numero);

	                System.out.printf("Digite a quantia que deseja depositar => ");
	                saldo = ler.nextDouble();
	                cc.setSaldo(saldo);

	                System.out.printf("Digite o limite de cheque especial => ");
	                chequeEspecial = ler.nextDouble();
	                cc.setChequeEspecial(chequeEspecial);
	                
	                System.out.printf("As informações estão corretas?\n\n" +
	    					"0 - REINICIAR\n" +
	    					"1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");
	    
	                confirmar = ler.nextInt();
	                
	                contaCorrenteList.add(cc);
	                
	                System.out.printf("Conta Corrente cadastrada");
	                System.in.read();
	                
	                
	        		
	        	} while (confirmar != 1);
	        	
	        	
	        } else if (option == 3) {
	        	
	        	do {
	        		
		        	ContaSalário cs = new ContaSalário();
			        
	                System.out.printf("Digite a agência => ");
	                agencia = ler.next();
	                cs.setAgencia(agencia);

	                System.out.printf("Digite o número => ");
	                numero = ler.next();
	                cs.setNumero(numero);

	                System.out.printf("Digite a quantia que deseja depositar => ");
	                saldo = ler.nextDouble();
	                cs.setSaldo(saldo);

	                System.out.printf("Digite o CNPJ do empregador => ");
	                cnpj = ler.nextInt();
	                cs.setCnpjEmpregador(cnpj);
	                
	                System.out.printf("As informações estão corretas?\n\n" +
	    					"0 - REINICIAR\n" +
	    					"1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");
	    
	                confirmar = ler.nextInt();
	                
	                contaSalárioList.add(cs);
	                
	                System.out.printf("Conta Salário cadastrada");
	                System.in.read();
	                
	                
	        		
	        	} while (confirmar != 1);
	        	
	        }
	        	
		} while (option != 4);
		
		ler.close();
	}
}