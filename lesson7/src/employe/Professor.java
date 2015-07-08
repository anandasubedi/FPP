package employe;

import java.util.Date;

public class Professor extends DeptEmployee {
	int numberOfPublications;

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	public Professor(String name, Date date,double salary,int numberOfPublications ) {
		super(name, date,salary);
		this.numberOfPublications=numberOfPublications;
	}

}
