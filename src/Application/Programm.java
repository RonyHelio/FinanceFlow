package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import Entiteis.Departament;
import Entiteis.Worker;
import EntiteisEnum.WorkerLevel;

public class Programm {
	public static void main(String[] args) throws ParseException {
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); //define o formato de data esperado
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Digite o nome do seu departamento: ");
		String nomeDepartamento = entrada.nextLine();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nameFuncionario = entrada.nextLine();
		System.out.print("Level: ");
		String level = entrada.nextLine();
		System.out.print("Salário base: ");
		double salarioBase = entrada.nextDouble();
		Worker worker = new Worker(nameFuncionario, WorkerLevel.valueOf(level), salarioBase, new Departament(nomeDepartamento));
		
		
		System.out.println("Quantos contratos serão cadastrados? ");
		int quantidade = entrada.nextInt();
		
		for (int i = 0; i < quantidade; i++) {
			
			System.out.print("Dados do contrato #" + (i+1) + ":");
			
			System.out.print("Data: (DD/MM/YYYY): ");
			String data = entrada.nextLine();
			java.util.Date date = dateFormat.parse(data); //transforma a string data em data formato padrão definido
			
			System.out.print("Valor por hora: ");
			double valorHora = entrada.nextDouble();
			
			System.out.print("Tempo de duração: ");
			int tempoTrabalhado = entrada.nextInt();
		}
		entrada.close();
	}
}
