package entities;

public class Register {
	private Integer idEmployee;
	private String nameEmployee;
	private Double employeeSalary;
	private Double increasePercent;

	public Register(Integer idEmployee, String nameEmployee, Double employeeSalary) {
		this.idEmployee = idEmployee;
		this.nameEmployee = nameEmployee;
		this.employeeSalary = employeeSalary;
	}

	public Integer getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(Integer idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getNameEmployee() {
		return nameEmployee;
	}

	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}

	public Double getIncreasePercent() {
		return increasePercent;
	}

	public void setIncreasePercent(Double increasePercent) {
		this.employeeSalary += (employeeSalary * increasePercent / 100);
	}

	public Double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	public String toString() {
		return idEmployee + ", " + nameEmployee + ", " + employeeSalary;
	}
}
