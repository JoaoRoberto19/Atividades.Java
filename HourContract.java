package entities;

import java.util.Date;

public class HourContract {
	
	private Date Date;
	private Double ValuePerhour;
	private Integer Hour;
	
	public HourContract(){

}

	public HourContract(java.util.Date date, Double valuePerhour, Integer hour) {		
		Date = date;
		ValuePerhour = valuePerhour;
		Hour = hour;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Double getValuePerhour() {
		return ValuePerhour;
	}

	public void setValuePerhour(Double valuePerhour) {
		ValuePerhour = valuePerhour;
	}

	public Integer getHour() {
		return Hour;
	}

	public void setHour(Integer hour) {
		Hour = hour;
	}

	public double totalValue() {
		return ValuePerhour * Hour;

	}
}
