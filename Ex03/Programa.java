package Ex03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		
		
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<ContaSal�rio> contaSal�rioList = new ArrayList<>();
		ArrayList<ContaPoupan�a> contaPoupan�aList = new ArrayList<>();
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
	                "Escolha qual tipo de conta voc� deseja:\n\n" +
	                "1) Conta Poupan�a\n" +
	                "2) Conta Corrente\n" +
	                "3) Conta Sal�rio\n" +
	                "4) Sair\n\n");
	        System.out.printf("Escolha a op��o desejada => ");
	        
	        option = ler.nextInt();
	        
	        
	        if (option == 1) {
	        	
	        
	        	do {
	        		
		        	ContaPoupan�a cp = new ContaPoupan�a();
		        	
	                System.out.printf("Digite a ag�ncia => ");
	                agencia = ler.next();
	                cp.setAgencia(agencia);

	                System.out.printf("Digite o n�mero => ");
	                numero = ler.next();
	                cp.setNumero(numero);

	                System.out.printf("Digite a quantia de dep�sito => ");
	                saldo = ler.nextDouble();
	                cp.setSaldo(saldo);

	                System.out.printf("Digite o limite de cheque especial => ");
	                rentabilidade = ler.nextDouble();
	                cp.setRentabilidade(rentabilidade);

	                
	                System.out.printf("As informa��es est�o corretas?\n\n" +
	    					"0 - REINICIAR\n" +
	    					"1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");
	    
	                confirmar = ler.nextInt();
	                
	                contaPoupan�aList.add(cp);
	                
	                System.out.printf("Conta Poupan�a cadastrada");
	                System.in.read();
	                
	        		
	        	} while (confirmar != 1);

	        	
	        } else if (option == 2) {
	        	
	        	do {
	        		
		        	ContaCorrente cc = new ContaCorrente();
			        
	                System.out.printf("Digite a ag�ncia => ");
	                agencia = ler.next();
	                cc.setAgencia(agencia);

	                System.out.printf("Digite o n�mero => ");
	                numero = ler.next();
	                cc.setNumero(numero);

	                System.out.printf("Digite a quantia que deseja depositar => ");
	                saldo = ler.nextDouble();
	                cc.setSaldo(saldo);

	                System.out.printf("Digite o limite de cheque especial => ");
	                chequeEspecial = ler.nextDouble();
	                cc.setChequeEspecial(chequeEspecial);
	                
	                System.out.printf("As informa��es est�o corretas?\n\n" +
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
	        		
		        	ContaSal�rio cs = new ContaSal�rio();
			        
	                System.out.printf("Digite a ag�ncia => ");
	                agencia = ler.next();
	                cs.setAgencia(agencia);

	                System.out.printf("Digite o n�mero => ");
	                numero = ler.next();
	                cs.setNumero(numero);

	                System.out.printf("Digite a quantia que deseja depositar => ");
	                saldo = ler.nextDouble();
	                cs.setSaldo(saldo);

	                System.out.printf("Digite o CNPJ do empregador => ");
	                cnpj = ler.nextInt();
	                cs.setCnpjEmpregador(cnpj);
	                
	                System.out.printf("As informa��es est�o corretas?\n\n" +
	    					"0 - REINICIAR\n" +
	    					"1 - CONFIRMAR\n\n");
	                System.out.printf("Responda => ");
	    
	                confirmar = ler.nextInt();
	                
	                contaSal�rioList.add(cs);
	                
	                System.out.printf("Conta Sal�rio cadastrada");
	                System.in.read();
	                
	                
	        		
	        	} while (confirmar != 1);
	        	
	        }
	        	
		} while (option != 4);
		
		ler.close();
	}
}