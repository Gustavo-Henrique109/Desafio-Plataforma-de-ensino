package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas aulas tem o curso? ");
		int qtd = sc.nextInt();
		
		List<Lesson> list = new ArrayList<>();
		
		for (int i=0; i<qtd; i++) {
			System.out.printf("\nDados da %da aula:\n", i+1);
			System.out.print("Conte�do ou tarefa (c/t)? ");
			char ch = sc.next().charAt(0);
			System.out.print("T�tulo: ");
			sc.nextLine();
			String titulo = sc.nextLine();
			
			if (ch == 'c') {
				System.out.print("URL do v�deo: ");
				String url = sc.nextLine();
				System.out.print("Dura��o em segundos: ");
				int sec = sc.nextInt();
				
				list.add(new Video(titulo, url, sec));
				
			} else {
				System.out.print("Descri��o: ");
				String descricao = sc.nextLine();
				System.out.print("Quantidade de quest�es: ");
				Integer questoes = sc.nextInt();
				
				list.add(new Task(titulo, descricao, questoes));
			}
		}
		
		int duration = 0;
		for (Lesson obj : list) {
			duration += obj.duration();
		}
		
		System.out.printf("\nDURA��O TOTAL DO CURSO = %d segundos", duration);
	
		sc.close();
	}
}

 
















