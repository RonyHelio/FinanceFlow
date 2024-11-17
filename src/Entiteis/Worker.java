package Entiteis;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import EntiteisEnum.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	private Departament departament; 
	
	List<HourContract> Contract = new ArrayList<>();
		
	public List<HourContract> getLista() {
		return Contract;
	}


	public Worker(String name, WorkerLevel level, double baseSalary, Departament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void addContracts(HourContract contract) {
		Contract.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		Contract.remove(contract);
	}
	
	public double income(Integer month, Integer year) { // calcula a renda obtida por um funcionário em
														//um determinado mês e ano. 
		Calendar calendar =  Calendar.getInstance();   //classe usada para extrair cada mês e ano do contrato
		double sum = baseSalary;
		
		for (HourContract c: Contract) {	//set time: configura o objeto calendar pra usar essa data
			calendar.setTime(c.getDate()); //getDate: retorna data do contrato
			
			int c_year = calendar.get(Calendar.YEAR);  //extrai o ano do contrato
			int c_month = 1 + calendar.get(Calendar.MONTH); //extrai o mes do contrato
			
			if (c_month == month && c_year == year) { //confere se o mes e ano do contrato é igual
				sum += c.totalValue();				// ao mes e ano passado do parametro
			}
		}
		return sum;
	}


	public Departament getDepartament() {
		return departament;
	}


	public void setDepartament(Departament departament) {
		this.departament = departament;
	}
}

