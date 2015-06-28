package random;
public class Employee
{
	public static void main(String[] args) 
	{
		person p= new person("Bibek",75000);
		System.out.println("Name:"+p.getname()+",Salary:"+p.getSalary());
		System.out.println("Tax of Salary:"+p.yearlyFederalTax());
	}
}