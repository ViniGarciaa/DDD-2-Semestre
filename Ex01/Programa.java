package Ex01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
        ArrayList<Conta> listaConta = new ArrayList<>();
		ArrayList<ContaCorrente> listaContaCorrente = new ArrayList<>();
		ArrayList<ContaPoupan�a> listaContaPoupan�a = new ArrayList<>();
		ArrayList<ContaSal�rio> listaContaSal�rio = new ArrayList<>();
		
        int id;
		int opcao;
		String agencia;
		String numero;
		double saldo;
		
		
		do {
			System.out.printf("SISTEMA DE CADASTRO DE CONTAS\n\n");
			System.out.printf("Escolha uma op��o de conta: \n");
			System.out.printf("1 - Conta Corrente \n"+
							  "2 - Conta Poupan�a \n"+
					 		  "3 - Conta Sal�rio \n"+
					 		  "4 - Sair \n\n");
			System.out.printf("Digite a op��o que deseja: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				ContaCorrente CC = new ContaCorrente();
	               
                id = listaConta.size() + 1;
                CC.setId(id);
               
                System.out.printf("\nDigite a ag�ncia: ");
                agencia = ler.next();
                CC.setAgencia(agencia);
               
                System.out.printf("Digite o n�mero da Conta Corrente: ");
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
				ContaPoupan�a CP = new ContaPoupan�a();
	               
                id = listaConta.size() + 1;
                CP.setId(id);
               
                System.out.printf("\nDigite a ag�ncia: ");
                agencia = ler.next();
                CP.setAgencia(agencia);
               
                System.out.printf("Digite o n�mero da Conta Poupan�a: ");
                numero = ler.next();
                CP.setNumero(numero);
                
                System.out.printf("Digite o saldo: ");
                saldo = ler.nextInt();
                CP.setSaldo(saldo);
      
                listaContaPoupan�a.add(CP);
               
                System.out.printf("Conta Poupan�a criada com sucesso!");
                System.in.read();
				
			}
			else if (opcao == 3) {
				ContaSal�rio CS = new ContaSal�rio();
	               
                id = listaConta.size() + 1;
                CS.setId(id);
               
                System.out.printf("\nDigite a ag�ncia: ");
                agencia = ler.next();
                CS.setAgencia(agencia);
               
                System.out.printf("Digite o n�mero da Conta Poupan�a: ");
                numero = ler.next();
                CS.setNumero(numero);
                
                System.out.printf("Digite o saldo: ");
                saldo = ler.nextInt();
                CS.setSaldo(saldo);
      
                listaContaSal�rio.add(CS);
               
                System.out.printf("Conta Sal�rio criada com sucesso!");
                System.in.read();
				
			}			
		}
		while (opcao != 4);

		ler.close();

	}

}