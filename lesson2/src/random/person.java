package random;

public class person {
String name;
double Salary;
double yearlyFederalTax;
public person(String n,double s)
{
	name=n;
	Salary=s;
}

public String getname()
{
	return name;
}
public double getSalary()
{
	return Salary;
}
public double yearlyFederalTax()
{
	double tax=0;
	if (Salary>80000)
	{tax = Salary*28/100;}
	else if (Salary>50000&&Salary<=80000)
	{tax = Salary*24/100;}
	else if (Salary>26000&&Salary<=50000)
	{tax = Salary*20/100;}
	else{
		
		Salary= Salary;
	}
	
	return tax;
}
   

}