package arraysvetores;

import java.util.Scanner;

public class ArraysVetores {

	public static void main(String[] args) {
		
		float media[] = new float[3];
		float somaMedia=0,mediaGeral,n1,n2,n3,maiorMedia=0;
		int x; //variável de loop vai percorrer e pegar a nota dos alunos
		Scanner ler = new Scanner(System.in);
		
		for(x=0;x<3;x++) {
			System.out.println("\nEntre com a primeira nota: ");
			n1=ler.nextFloat();
			System.out.println("\nEntre com a segunda nota: ");
			n2=ler.nextFloat();
			System.out.println("\nEntre com a terceira nota: ");
			n3=ler.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			somaMedia += media[x];
			
			if (maiorMedia < media[x]) {
				maiorMedia = media[x];
			}
			
		}
		
		mediaGeral = somaMedia / 3;
		System.out.println("\nMedia geral: "+mediaGeral);
		System.out.println("\nMaior média: "+maiorMedia);

		for (x=0;x<3;x++) {
			System.out.println("\nMedia do participante "+(x+1)+" foi de: "+media[x]);
		}
		
		
	}

}
