package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System .in);		
		
		double rendaAnualComSalario, rendaAnualComPrestacaoServico, rendaAnualComGanhoDeCapital, gastosMedicos, gastosEducacionais;
		
		//Leitura dos dados
		
		System.out.print("Renda anual com salario: ");		
		rendaAnualComSalario = sc.nextDouble();
		
		System.out.print("Renda anual com prestacao de servico: ");		
		rendaAnualComPrestacaoServico = sc.nextDouble();
		
		System.out.print("Renda anual com ganho de capital: ");		
		rendaAnualComGanhoDeCapital = sc.nextDouble();
		
		System.out.print("Gastos medicos: ");		
		gastosMedicos = sc.nextDouble();
		
		System.out.print("Gastos educacionais: ");		
		gastosEducacionais = sc.nextDouble();

	}

}

