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
		
		//consolidado de renda
		
		double impostoSobreSalario, impostoSobrePrestaoServico, impostoCapital;
		
		if(rendaAnualComSalario / 12 < 3000) {
			
			impostoSobreSalario = 0.0;
			
		} else if(rendaAnualComSalario / 12 >= 3000 && rendaAnualComSalario / 12  < 5000) {
			
			impostoSobreSalario = (rendaAnualComSalario * 10 ) / 100;
			
		} else {
			
			impostoSobreSalario = (rendaAnualComSalario * 20 ) / 100;
			
		}
		
		
		if(rendaAnualComPrestacaoServico > 0.0) {
			
			impostoSobrePrestaoServico =  (rendaAnualComPrestacaoServico * 15 ) / 100;
			
		} else {
			
			impostoSobrePrestaoServico = 0.0;
		}
		
		
		if(rendaAnualComGanhoDeCapital > 0.0) {
			
			impostoCapital = (rendaAnualComGanhoDeCapital * 20) / 100;
			
		} else {
			
			impostoCapital = 0.0;
			
		}
		
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println ("CONSOLIDADO DE RENDA: ");
		System.out.printf("Imposto sobre salário: R$ %.2f%n", impostoSobreSalario);
		System.out.printf("Imposto sobre serviços: R$ %.2f%n", impostoSobrePrestaoServico);
		System.out.printf("Imposto sobre ganho de capital: R$ %.2f%n", impostoCapital);
		
		//deducoes
		
		double maximoDedutivel, gastosDedutivel;		
		
		gastosDedutivel = gastosEducacionais + gastosMedicos;
		
		if(gastosDedutivel > 0.0) {
			
			maximoDedutivel = (impostoSobreSalario + impostoSobrePrestaoServico + impostoCapital) * 0.3;
			
		} else {
			
			maximoDedutivel = 0.0;
		}
		
		System.out.println();
		System.out.println ("DEDUÇOES: ");
		System.out.printf("Máximo dedutível: R$ %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedutíveis: R$ %.2f%n", gastosDedutivel);	
		
		
		//resumo
	
		
		double impostoBruto = impostoSobreSalario + impostoSobrePrestaoServico + impostoCapital;
		double abatimento;
		
		if(gastosDedutivel < maximoDedutivel) {
			
			abatimento = gastosDedutivel;
			
		} else {
			
			abatimento = maximoDedutivel;
			
		}
		
		System.out.println();
		System.out.println("RESUMO: ");
		System.out.printf("Imposto bruto total: R$ %.2f%n", impostoBruto);
		System.out.printf("Abatimento: R$ %.2f%n", abatimento);
		System.out.printf("Imposto devido: R$ %.2f%n", impostoBruto - abatimento);

	}

}




