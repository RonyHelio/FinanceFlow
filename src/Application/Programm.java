package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import Entiteis.Departament;
import Entiteis.HourContract;
import Entiteis.Worker;
import EntiteisEnum.WorkerLevel;

public class Programm {
	public static void main(String[] args) throws ParseException {
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); //define o formato de data esperado
		SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
		
		System.out.println("Digite o nome do seu departamento: ");
		String nomeDepartamento = entrada.nextLine();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nameFuncionario = entrada.nextLine();
		System.out.print("Level: ");
		String level = entrada.nextLine().toUpperCase();
		System.out.print("Salário base: ");
		double salarioBase = entrada.nextDouble();
		Worker worker = new Worker(nameFuncionario, WorkerLevel.valueOf(level), salarioBase, new Departament(nomeDepartamento));
		
		
		System.out.println("Quantos contratos serão cadastrados? ");
		int quantidade = entrada.nextInt();
		
		for (int i = 1; i < (quantidade+1); i++) {
			
			System.out.print("Dados do contrato #" + i + ":");
			
			System.out.print("Data: (DD/MM/YYYY): ");
			Date dataContrato = dateFormat.parse(entrada.next());
			
			System.out.print("Valor por hora: ");
			double valorHora = entrada.nextDouble();
			
			System.out.print("Tempo de duração: ");
			int tempoTrabalhado = entrada.nextInt();
			
			HourContract hourContrct = new HourContract(dataContrato, valorHora, tempoTrabalhado);
			worker.addContracts(hourContrct);
		}
		
		System.out.println();
		System.out.println();
		Calendar cal = Calendar.getInstance();  //extrai data e hora atuais do sistema!! 
		
		System.out.print("Entre com o mês e ano desejado: (MM/yyyy):");
		Date dataDesejada = sdf.parse(entrada.next());
		cal.setTime(dataDesejada);
		int month = cal.get(Calendar.MONTH) + 1; //esse método retorna o mês que o objeto recebeu.
		int year = cal.get(Calendar.YEAR); //retorna o ano digitado para o usúario
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartament().getName());
		System.out.println("Renda do mês" + month + "/" + year +": " + worker.income(month, year));
		entrada.close();
	}
}
