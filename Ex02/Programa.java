package Ex02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		ArrayList<PessoaFísica> listaPessoaFísica = new ArrayList<>();
		ArrayList<PessoaJurídica> listaPessoaJurídica = new ArrayList<>();
		
        int id;
		String nome;
		String endereço;
		int telefone;
		String CPF;
		int CNPJ;
		int opcao;
		
		do {
			System.out.printf("CADASTRO DE USUÁRIO \n\n");
			System.out.printf("Escolha uma opção: \n");
			System.out.printf("1 - Cadastrar Pessoa Física \n"+
							  "2 - Cadastrar Pessoa Jurídica \n"+
					 		  "3 - Sair \n\n");
			System.out.printf("Digite a opção desejada: ");
			opcao = ler.nextInt();
			
			if (opcao == 1) {
				PessoaFísica PF = new PessoaFísica();
	               
                id = listaPessoa.size() + 1;
                PF.setId(id);
               
                System.out.printf("\nDigite o Nome: ");
                nome = ler.next();
                PF.setNome(nome);
               
                System.out.printf("Digite o Endereço: ");
                endereço = ler.next();
                PF.setEndereco(endereço);
                
                System.out.printf("Digite o Telefone: ");
                telefone = ler.nextInt();
                PF.setTelefone(telefone);
                
                System.out.printf("Digite o CPF: ");
                CPF = ler.next();
                PF.setCpf(CPF);
      
                listaPessoaFísica.add(PF);
               
                System.out.printf("Pessoa Física Cadastrada");
                System.in.read();
				
			}
			
			else if (opcao == 2) {
				PessoaJurídica PJ = new PessoaJurídica();
	               
                id = listaPessoa.size() + 1;
                PJ.setId(id);
               
                System.out.printf("\nDigite o Nome: ");
                nome = ler.next();
                PJ.setNome(nome);
               
                System.out.printf("Digite o Endereço: ");
                endereço = ler.next();
                PJ.setEndereco(endereço);
                
                System.out.printf("Digite o Telefone: ");
                telefone = ler.nextInt();
                PJ.setTelefone(telefone);
                
                System.out.printf("Digite o CNPJ: ");
                CNPJ = ler.nextInt();
                PJ.setCnpj(CNPJ);
      
                listaPessoaJurídica.add(PJ);
               
                System.out.printf("Pessoa Jurídica adicionada!");
                System.in.read();
				
			}		
		}
		while (opcao != 3);

		ler.close();

	}

}