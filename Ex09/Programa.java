package Ex09;

import java.util.Scanner;
import java.util.ArrayList;


public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n;
		double lado;
		double base;
		double altura;
		double raio;
		
		ArrayList<Quadrado>listaQuadrado = new ArrayList<>();
		ArrayList<Retangulo>listaRetangulo = new ArrayList<>();
		ArrayList<Circulo>listaCirculo = new ArrayList<>();
		
		
		System.out.println("Quantas formas voc� ir� criar? ");
		n = ler.nextInt();
		
		
		
		
		for (int i =0; i<n; i++) {
			
			System.out.println("Gostaria de criar um quadrado, ret�ngulo ou circulo? ");
			String forma = ler.next().toUpperCase();
			
			if (forma.equals("CIRCULO")) {
				System.out.println("Digite o tamanho do raio: ");
				raio = ler.nextDouble();
				
				Circulo cc = new Circulo();
				cc.setRaio(raio);
				
				listaCirculo.add(cc);
				
			}else if (forma.equals("RETANGULO") || forma.equals("RET�NGULO")) {
				System.out.println("Informe a base do ret�ngulo: ");
				base = ler.nextDouble();
				
				Retangulo rt = new Retangulo();
				rt.setBase(base);
				
				System.out.println("Informe a altura do ret�ngulo: ");
				altura = ler.nextDouble();
				rt.setAltura(altura);
					
				listaRetangulo.add(rt);
			}else if (forma.equals("QUADRADO")) {
				
				
				System.out.println("Digite o lado do quadrado: ");
				lado = ler.nextDouble();
				Quadrado qd = new Quadrado();
				qd.setLado(lado);
				
					
				listaQuadrado.add(qd);
			}
		}
		
		if (!listaQuadrado.isEmpty()) {
			System.out.println("-------DADOS DOS QUADRADOS-------");
			for (Quadrado q : listaQuadrado) {
				
				System.out.printf("VALOR LADOS: %.2f  VALOR PERIMETRO: %.2f VALOR �REA: %.2f \n", q.getLado(), q.calcularPerimetro(), q.calcularArea());
			}
		}
		
		if (!listaRetangulo.isEmpty()) {
			System.out.println("\n -------DADOS DOS RET�NGULOS-------");
			for (Retangulo r : listaRetangulo) {
				
				System.out.printf("VALOR BASE: %.2f  VALOR ALTURA: %.2f VALOR PERIMETRO: %.2f VALOR �REA: %.2f \n", r.getBase(),r.getAltura(), r.calcularPerimetro(), r.calcularArea());
			}
		}
		if (!listaCirculo.isEmpty()) {
			System.out.println("\n -------DADOS DOS CIRCULOS-------");
			for (Circulo c: listaCirculo) {
				
				System.out.printf("VALOR RAIO: %.2f VALOR DI�METRO: %.2f  VALOR �REA: %.2f  VALOR PERIMETRO: %.2f", c.getRaio(), c.getDiametro(), c.calcularArea(), c.calcularPerimetro());
			}
		}
		
	}

}