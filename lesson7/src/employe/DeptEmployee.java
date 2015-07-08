package employe;
import java.util.Date;


public class DeptEmployee {

private String name;
private Date hireDate;
private double salary;

public DeptEmployee(String name,Date date,double salary) {
	this.name=name;
	this.hireDate=date;
	this.salary=salary;
}

public double computeSalary() {
	return salary;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Date getHireDate() {
	return hireDate;
}

/*public double getSalary(){
	return salary;
}*/
public void setHireDate(Date date) {
	this.hireDate = date;
}

@Override 
public String toString(){
	return getName()+" "+getHireDate();
	
}
}
