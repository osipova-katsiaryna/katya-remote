package homework;

public class Employer {

	// ФИО, должность, email, телефон, зарплата, возраст;
	String name;
	String lastName;
	String email;
	String phoneNumber;
	int salary;
	String occupation;
	int age;

	public Employer(String name, String lastName, String email, String occupation, String phoneNumber, int salary,
			int age) {
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.occupation = occupation;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.age = age;
	}

	public void printInfo() {
		System.out.println(
				name + " " + lastName + " " + email + " " + occupation + " " + phoneNumber + " " + salary + " " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employer employer = new Employer("Kate", "Osipova", "osipova.katsiaryna@gmail.com", "QA", "312479842", 1000, 35);
		employer.printInfo();

		// Person[] persArray = new Person[5];
		Employer[] emplArray = new Employer[5];
		emplArray[0] = new Employer("May", "Green", "may.green@gmail.com", "DevOps", "314265889", 3000, 29);
		emplArray[1] = new Employer("Max", "Kreen", "max.kreen@gmail.com", "BA", "314265899", 2000, 32);
		emplArray[2] = new Employer("Tanya", "Olly", "t.olly@gmail.com", "QA", "314265869", 1000, 26);
		emplArray[3] = new Employer("Lisa", "Shpak", "lisa.shpak@gmail.com", "Account manager", "314264889", 500, 43);
		emplArray[4] = new Employer("Kostya", "Os", "kostya.os@gmail.com", "Developer", "314285889", 3000, 48);
		for (int i = 0; i < emplArray.length; i++) {
			if (emplArray[i].age >= 40) {
				emplArray[i].printInfo();
			}
			
		}

	}

}
