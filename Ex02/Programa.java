package Ex02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		ArrayList<PessoaF�sica> listaPessoaF�sica = new ArrayList<>();
		ArrayList<PessoaJur�dica> listaPessoaJur�dica = new ArrayList<>();
		
        int id;
		String nome;
		String endere�o;
		int telefone;
		String CPF;
		int CNPJ;
		int opcao;
		
		do {
			System.out.printf("CADASTRO DE USU�RIO \n\n");
			System.out.printf("Escolha uma op��o: \n");
			System.out.printf("1 - Cadastrar Pessoa F�sica \n"+
							  "2 - Cadastrar Pessoa Jur�dica \n"+
					 		  "3 - Sair \n\n");
			System.out.printf("Digite a op��o desejada: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				PessoaF�sica PF = new PessoaF�sica();
	               
                id = listaPessoa.size() + 1;
                PF.setId(id);
               
                System.out.printf("\nDigite o Nome: ");
                nome = ler.next();
                PF.setNome(nome);
               
                System.out.printf("Digite o Endere�o: ");
                endere�o = ler.next();
                PF.setEndereco(endere�o);
                
                System.out.printf("Digite o Telefone: ");
                telefone = ler.nextInt();
                PF.setTelefone(telefone);
                
                System.out.printf("Digite o CPF: ");
                CPF = ler.next();
                PF.setCpf(CPF);
      
                listaPessoaF�sica.add(PF);
               
                System.out.printf("Pessoa F�sica Cadastrada");
                System.in.read();
				
			}
			
			else if (opcao == 2) {
				PessoaJur�dica PJ = new PessoaJur�dica();
	               
                id = listaPessoa.size() + 1;
                PJ.setId(id);
               
                System.out.printf("\nDigite o Nome: ");
                nome = ler.next();
                PJ.setNome(nome);
               
                System.out.printf("Digite o Endere�o: ");
                endere�o = ler.next();
                PJ.setEndereco(endere�o);
                
                System.out.printf("Digite o Telefone: ");
                telefone = ler.nextInt();
                PJ.setTelefone(telefone);
                
                System.out.printf("Digite o CNPJ: ");
                CNPJ = ler.nextInt();
                PJ.setCnpj(CNPJ);
      
                listaPessoaJur�dica.add(PJ);
               
                System.out.printf("Pessoa Jur�dica adicionada!");
                System.in.read();
				
			}		
		}
		while (opcao != 3);

		ler.close();

	}

}