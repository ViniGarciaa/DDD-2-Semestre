package Ex06;

import java.util.Scanner;

public abstract class Pessoa {
	
	Scanner ler = new Scanner(System.in);
	
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Pessoa() {
		
	}
	
	public void editarNome(String nome) {
		System.out.print("Digite seu nome: ");
		nome = ler.next();
		
		if (name.length() > 1) {
			System.out.print("Nome alterado ");
		} else {
			System.out.print("N?o ? possivel alterar o nome. no m?nimo mais de 1 caractere.");
		}
	}
}