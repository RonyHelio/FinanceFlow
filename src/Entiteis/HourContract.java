package Entiteis;

import java.util.Date;

public class HourContract {
	private Date date;
	private double valuePerHour;
	private Integer hours;
	
	public double totalValue() { //calcula o total por contrato
		return valuePerHour*hours;
	}
	
	public HourContract() {
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public HourContract(Date date, double valuePerHour, Integer hours) {
		super();
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	
	
}
