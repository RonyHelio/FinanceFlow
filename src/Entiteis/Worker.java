package Entiteis;

import java.util.ArrayList;
import java.util.List;

import EntiteisEnum.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private double baseSalary;
	
	private Departament departamente;
	
	List<HourContract> Contract = new ArrayList<>();
	
	
	
	public List<HourContract> getLista() {
		return Contract;
	}


	public Worker(String name, WorkerLevel level, double baseSalary) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
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
}
