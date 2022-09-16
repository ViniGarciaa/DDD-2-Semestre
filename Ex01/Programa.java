package Ex01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
        ArrayList<Conta> listaConta = new ArrayList<>();
		ArrayList<ContaCorrente> listaContaCorrente = new ArrayList<>();
		ArrayList<ContaPoupança> listaContaPoupança = new ArrayList<>();
		ArrayList<ContaSalário> listaContaSalário = new ArrayList<>();
		
        int id;
		int opcao;
		String agencia;
		String numero;
		double saldo;
		
		
		do {
			System.out.printf("SISTEMA DE CADASTRO DE CONTAS\n\n");
			System.out.printf("Escolha uma opção de conta: \n");
			System.out.printf("1 - Conta Corrente \n"+
							  "2 - Conta Poupança \n"+
					 		  "3 - Conta Salário \n"+
					 		  "4 - Sair \n\n");
			System.out.printf("Digite a opção que deseja: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				ContaCorrente CC = new ContaCorrente();
	               
                id = listaConta.size() + 1;
                CC.setId(id);
               
                System.out.printf("\nDigite a agência: ");
                agencia = ler.next();
                CC.setAgencia(agencia);
               
                System.out.printf("Digite o número da Conta Corrente: ");
                numero = ler.next();
                CC.setNumero(numero);
                
                System.out.printf("Digite o saldo: ");
                saldo = ler.nextInt();
                CC.setSaldo(saldo);
      
                listaContaCorrente.add(CC);
               
                System.out.printf("Conta Corrente criada com sucesso!");
                System.in.read();
				
			}
			
			else if (opcao == 2) {
				ContaPoupança CP = new ContaPoupança();
	               
                id = listaConta.size() + 1;
                CP.setId(id);
               
                System.out.printf("\nDigite a agência: ");
                agencia = ler.next();
                CP.setAgencia(agencia);
               
                System.out.printf("Digite o número da Conta Poupança: ");
                numero = ler.next();
                CP.setNumero(numero);
                
                System.out.printf("Digite o saldo: ");
                saldo = ler.nextInt();
                CP.setSaldo(saldo);
      
                listaContaPoupança.add(CP);
               
                System.out.printf("Conta Poupança criada com sucesso!");
                System.in.read();
				
			}
			else if (opcao == 3) {
				ContaSalário CS = new ContaSalário();
	               
                id = listaConta.size() + 1;
                CS.setId(id);
               
                System.out.printf("\nDigite a agência: ");
                agencia = ler.next();
                CS.setAgencia(agencia);
               
                System.out.printf("Digite o número da Conta Poupança: ");
                numero = ler.next();
                CS.setNumero(numero);
                
                System.out.printf("Digite o saldo: ");
                saldo = ler.nextInt();
                CS.setSaldo(saldo);
      
                listaContaSalário.add(CS);
               
                System.out.printf("Conta Salário criada com sucesso!");
                System.in.read();
				
			}			
		}
		while (opcao != 4);

		ler.close();

	}

}